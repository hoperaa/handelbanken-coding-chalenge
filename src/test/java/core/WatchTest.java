package core;

import com.handelbanken.model.Watch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class WatchTest {

    private Watch watch;

    @BeforeEach
    void setUp() {
        watch =
                Watch.builder().watchName("Rolex").price(100.00).discountForPieces(2).discountAmount(200.00).build();
        watch.setWatchId("001");
    }


    @Test
    void shouldReturnFalseIfDifferentOddsOutcomeIsPassed() {
        Watch watchNew =
                Watch.builder()
                        .watchId("002")
                        .watchName("Casio")
                        .price(100.00)
                        .discountForPieces(2)
                        .discountAmount(200.00)
                        .build();

        assertFalse(watch.sameAs(watchNew));
    }

}
