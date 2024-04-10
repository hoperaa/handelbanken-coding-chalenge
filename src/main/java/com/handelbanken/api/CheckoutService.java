package com.handelbanken.api;

import com.handelbanken.model.Watch;
import com.handelbanken.repository.WatchRepository;
import com.handelbanken.infraApi.dto.CheckoutDto;
import com.handelbanken.infraApi.dto.WatchDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
@Slf4j
public class CheckoutService {

   final WatchRepository checkoutRepository;

   public Double doCheckout(CheckoutDto checkoutDto){
      Map<String, Integer> watchesGrouped = checkoutDto.getWatches().stream().collect(Collectors.groupingBy(WatchDto::getWatchId,Collectors.summingInt(e -> 1)));
      Set<Watch> watches = checkoutRepository.findByWatchIdIn(watchesGrouped.keySet());
       log.info("Watches for checkout:" + watches.toString());
      return watches.stream().mapToDouble(watch -> {
                 if (watch.getDiscountForPieces() != 0) {
                    int quantity = watchesGrouped.get(watch.getWatchId());
                    return (quantity / watch.getDiscountForPieces()) * watch.getDiscountAmount()
                            + (quantity % watch.getDiscountForPieces()) * watch.getPrice();
                 } else {
                    return watchesGrouped.get(watch.getWatchId()) * watch.getPrice();
                 }
              })
              .sum();

   }
}
