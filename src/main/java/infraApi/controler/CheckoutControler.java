package infraApi.controler;

import infraApi.dto.CheckoutDto;
import org.springframework.web.bind.annotation.PostMapping;

public interface CheckoutControler {

    @PostMapping("checkout")
    Double receiveCheckout(CheckoutDto checkoutDto);
}
