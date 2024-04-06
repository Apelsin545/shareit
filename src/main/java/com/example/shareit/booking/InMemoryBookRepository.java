package com.example.shareit.booking;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryBookRepository implements BookingRepository {
    private final Map<Long, Booking> books = new HashMap<>();

    @Override
    public List<Booking> findAll() {
        return books.values().stream().toList();
    }

    @Override
    public Booking getBookById(long id) {
        return books.get(id);
    }
}
