package core.model;

import jakarta.persistence.Id;
import lombok.*;


import java.util.Objects;
import jakarta.persistence.Entity;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Watch {

    @Id
    private String watchId;
    private String watchName;
    private Double price;
    private int discountForPieces;
    private Double discountAmount;

    public boolean sameAs(Watch other) {
        return Objects.equals(watchId, other.watchId);
    }
}
