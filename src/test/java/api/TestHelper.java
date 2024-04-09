package api;

import core.model.Watch;
import infraApi.dto.CheckoutDto;
import infraApi.dto.WatchDto;

import java.util.HashSet;
import java.util.Set;

public class TestHelper {

    public static CheckoutDto createCheckoutDto(){
         CheckoutDto checkoutDto = new CheckoutDto();
         checkoutDto.addWatchDto(WatchDto.builder().watchId("001").build());
         checkoutDto.addWatchDto(WatchDto.builder().watchId("002").build());
         checkoutDto.addWatchDto(WatchDto.builder().watchId("003").build());
         checkoutDto.addWatchDto(WatchDto.builder().watchId("001").build());
         checkoutDto.addWatchDto(WatchDto.builder().watchId("004").build());
         checkoutDto.addWatchDto(WatchDto.builder().watchId("002").build());
         checkoutDto.addWatchDto(WatchDto.builder().watchId("001").build());
         checkoutDto.addWatchDto(WatchDto.builder().watchId("001").build());
         return checkoutDto;
    }

    public static Set<Watch> watches() {
         Set<Watch> watches = new HashSet<>();
         watches.add(Watch.builder().watchId("001").watchName("Rolex").price(150.00).discountForPieces(3).discountAmount(400.00).build());
         watches.add(Watch.builder().watchId("002").watchName("Casio").price(100.00).discountForPieces(2).discountAmount(150.00).build());
         watches.add(Watch.builder().watchId("003").watchName("Fossili").price(110.00).discountForPieces(2).discountAmount(1600.00).build());
         watches.add(Watch.builder().watchId("004").watchName("Michal Cors").price(140.00).discountForPieces(0).discountAmount(0.00).build());
         return watches;
    }
}
