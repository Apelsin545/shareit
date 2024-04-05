package com.example.shareit.booking;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryBookRepository implements BookRepository {
    private final Map<Long, Book> books = new HashMap<>();

    @Override
    public Collection<Book> findAll() {
        return books.values();
    }

    @Override
    public Book getBookById(long id) {
        return books.get(id);
    }
}
