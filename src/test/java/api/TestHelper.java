package api;

import com.handelbanken.model.Watch;
import com.handelbanken.infraApi.dto.CheckoutDto;
import com.handelbanken.infraApi.dto.WatchDto;

import java.util.HashSet;
import java.util.Set;

public class TestHelper {

    public static CheckoutDto createCheckoutDto_1(){
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

    public static CheckoutDto createCheckoutDto_2(){
        CheckoutDto checkoutDto = new CheckoutDto();
        checkoutDto.addWatchDto(WatchDto.builder().watchId("001").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("002").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("003").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("001").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("004").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("002").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("003").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("001").build());
        return checkoutDto;
    }

    public static CheckoutDto createCheckoutDto_3(){
        CheckoutDto checkoutDto = new CheckoutDto();
        checkoutDto.addWatchDto(WatchDto.builder().watchId("001").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("002").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("003").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("001").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("004").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("002").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("001").build());
        checkoutDto.addWatchDto(WatchDto.builder().watchId("005").build());
        return checkoutDto;
    }

    public static Set<Watch> watches() {
         Set<Watch> watches = new HashSet<>();
         watches.add(Watch.builder().watchId("001").watchName("Rolex").price(100.00).discountForPieces(3).discountAmount(200.00).build());
         watches.add(Watch.builder().watchId("002").watchName("Michal Kors").price(80.00).discountForPieces(2).discountAmount(120.00).build());
         watches.add(Watch.builder().watchId("003").watchName("Swatch").price(50.00).discountForPieces(0).discountAmount(0.00).build());
         watches.add(Watch.builder().watchId("004").watchName("Casio").price(30.00).discountForPieces(0).discountAmount(0.00).build());
         return watches;
    }
}
