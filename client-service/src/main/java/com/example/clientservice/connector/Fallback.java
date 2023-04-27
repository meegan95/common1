package com.example.clientservice.connector;

import com.example.clientservice.model.Book;

import java.util.Collections;
import java.util.List;

public class Fallback implements BookServiceConnector {

    @Override
    public List<Book> getAllBooks() {
        return Collections.emptyList();
    }
}