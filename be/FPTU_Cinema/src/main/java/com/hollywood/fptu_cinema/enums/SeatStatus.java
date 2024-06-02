package com.hollywood.fptu_cinema.enums;

import lombok.Getter;

@Getter
public enum SeatStatus {
    UNAVAILABLE(0),
    AVAILABLE(1);

    private final int value;

    SeatStatus(int value) {
        this.value = value;
    }
}
