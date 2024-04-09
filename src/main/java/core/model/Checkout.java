package core.model;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Checkout {

    @Builder.Default
    private final Set<Watch> watches = new HashSet<>();;
}
