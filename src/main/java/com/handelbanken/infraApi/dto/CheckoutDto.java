package com.handelbanken.infraApi.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CheckoutDto {

    @Builder.Default
    private final List<WatchDto> watches = new ArrayList<>();

    public void addWatchDto(WatchDto watchDto) {
        watches.add(watchDto);
    }

}
