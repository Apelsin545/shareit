package com.example.shareit.booking;

import java.util.Collection;

public interface BookRepository {
    Collection<Book> findAll();
    Book getBookById(long id);
}
