package api;

import core.repository.WatchRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

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
    void checkoutIsReceivedAndProcessed() throws IOException {
        when(watchRepository.findAllByWatchIdIs(any())).thenReturn(TestHelper.watches());
        Double checkoutSum = checkoutService.doCheckout(TestHelper.createCheckoutDto());
        verify(watchRepository,times(1)).findAllByWatchIdIs(anySet());
    }
}
