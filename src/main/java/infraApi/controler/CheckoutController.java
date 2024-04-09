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
public class CheckoutController {

    private final CheckoutService checkoutService;

    @PostMapping("checkout")
    public Double receiveCheckout(@RequestBody CheckoutDto checkoutDto) throws IOException {
          return checkoutService.doCheckout(checkoutDto);
    }
}
