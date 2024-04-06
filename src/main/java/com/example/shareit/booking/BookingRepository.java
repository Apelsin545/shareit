package com.example.shareit.booking;

import java.util.Collection;
import java.util.List;

public interface BookingRepository {
    List<Booking> findAll();
    Booking getBookById(long id);
}
