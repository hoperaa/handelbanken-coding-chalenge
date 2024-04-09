package infraApi.controler;

import infraApi.dto.CheckoutDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CheckoutControler {

    @PostMapping("checkout")
    Double receiveCheckout(@RequestBody CheckoutDto checkoutDto);
}
