package com.example.shareit.booking;

import java.util.Collection;

public interface BookingRepository {
    Collection<Booking> findAll();
    Booking getBookById(long id);
}
