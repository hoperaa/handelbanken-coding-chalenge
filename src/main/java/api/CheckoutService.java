package api;

import core.model.Watch;
import core.repository.WatchRepository;
import infraApi.dto.CheckoutDto;
import infraApi.dto.WatchDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
      Set<Watch> watches = checkoutRepository.findAllByWatchIdIs(watchesGrouped.keySet());
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
