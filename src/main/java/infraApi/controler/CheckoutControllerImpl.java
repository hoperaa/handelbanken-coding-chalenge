package infraApi.controler;

import api.CheckoutService;
import infraApi.dto.CheckoutDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
@Slf4j
public class CheckoutControllerImpl implements CheckoutControler{

    private final CheckoutService checkoutService;

    @Override
    public Double receiveCheckout(@RequestBody CheckoutDto checkoutDto) {
        log.info("Received checkout: " + checkoutDto.toString());
          return checkoutService.doCheckout(checkoutDto);
    }
}
