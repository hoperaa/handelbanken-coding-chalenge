package api;

import com.handelbanken.api.CheckoutService;
import com.handelbanken.repository.WatchRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(
        classes = {
                CheckoutService.class,
                WatchRepository.class,
        })
public class CheckoutServiceTest {

    @MockBean
    private WatchRepository watchRepository;
    @Autowired
    private CheckoutService checkoutService;

    @Test
    void checkoutIsReceivedAndProcessedCase1() throws IOException {
        when(watchRepository.findByWatchIdIn(any())).thenReturn(TestHelper.watches());
        Double checkoutSum = checkoutService.doCheckout(TestHelper.createCheckoutDto_1());
        verify(watchRepository,times(1)).findByWatchIdIn(anySet());
        assertEquals(500.00, checkoutSum);
    }

    @Test
    void checkoutIsReceivedAndProcessedCase2() throws IOException {
        when(watchRepository.findByWatchIdIn(any())).thenReturn(TestHelper.watches());
        Double checkoutSum = checkoutService.doCheckout(TestHelper.createCheckoutDto_2());
        verify(watchRepository,times(1)).findByWatchIdIn(anySet());
        assertEquals(450.00, checkoutSum);
    }

    @Test
    void checkoutWhenOneWatchIsNotIntoDb() throws IOException {
        when(watchRepository.findByWatchIdIn(any())).thenReturn(TestHelper.watches());
        Double checkoutSum = checkoutService.doCheckout(TestHelper.createCheckoutDto_3());
        verify(watchRepository,times(1)).findByWatchIdIn(anySet());
        assertEquals(400.00, checkoutSum);
    }
}
