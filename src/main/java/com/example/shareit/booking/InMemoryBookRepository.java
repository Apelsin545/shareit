package com.example.shareit.booking;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryBookRepository implements BookingRepository {
    private final Map<Long, Booking> books = new HashMap<>();

    @Override
    public Collection<Booking> findAll() {
        return books.values();
    }

    @Override
    public Booking getBookById(long id) {
        return books.get(id);
    }
}
