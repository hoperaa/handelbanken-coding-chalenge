package infraApi;

import api.CheckoutService;
import com.fasterxml.jackson.databind.ObjectMapper;
import infraApi.controler.CheckoutController;
import infraApi.dto.CheckoutDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ContextConfiguration(classes = {CheckoutController.class})
@WebMvcTest(CheckoutController.class)
public class CheckoutControllerTest {

    @Autowired private MockMvc mockMvc;

    @MockBean private CheckoutService checkoutService;
    @Autowired private CheckoutController checkoutController;
    @Autowired private ObjectMapper objectMapper;
    private static final String CHECKOUT_FILES_PATH = "src/main/resources/json/";
    ArgumentCaptor<CheckoutDto> checkoutCaptor = ArgumentCaptor.forClass(CheckoutDto.class);
    private String requestBody;
    private CheckoutDto expectedCheckoutDto;


    @BeforeEach
    void setUp() throws IOException {
        checkoutCaptor = ArgumentCaptor.forClass(CheckoutDto.class);
        requestBody = Files.readString(Path.of(CHECKOUT_FILES_PATH, "checkout_1.json"));
        when(checkoutService.doCheckout(checkoutCaptor.capture())).thenReturn(200.00);
        expectedCheckoutDto = objectMapper.readValue(requestBody,CheckoutDto.class);
    }

    @Test
    void contextLoads() {
        assertNotNull(mockMvc);
        assertNotNull(checkoutController);

    }

    @Test
    void isReceivedCheckout() throws  Exception {

        mockMvc
                .perform(
                        post("/checkout").contentType(MediaType.APPLICATION_JSON_VALUE).content(requestBody))
                .andExpect(status().isOk());
        CheckoutDto actualCheckoutDto = checkoutCaptor.getValue();

        verify(checkoutService).doCheckout(actualCheckoutDto);
        assertEquals(expectedCheckoutDto,actualCheckoutDto);

    }


}
