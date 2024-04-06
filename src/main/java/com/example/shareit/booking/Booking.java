package com.example.shareit.booking;

import com.example.shareit.item.Item;
import com.example.shareit.user.User;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Booking {
    private User user;
    private Item item;
    private LocalDateTime bookingTime;
}
