package com.example.shareit.booking;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Book {
    private long userId;
    private long itemId;
    private LocalDateTime bookingTime;
}
