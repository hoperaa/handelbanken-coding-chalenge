package com.handelbanken.infraApi.controler;

import com.handelbanken.api.CheckoutService;
import com.handelbanken.infraApi.dto.CheckoutDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
public class CheckoutController {

    private final CheckoutService checkoutService;

    @PostMapping("checkout")
    public Double receiveCheckout(@RequestBody CheckoutDto checkoutDto) {
        log.info("Received checkout: " + checkoutDto.toString());
          return checkoutService.doCheckout(checkoutDto);
    }
}
