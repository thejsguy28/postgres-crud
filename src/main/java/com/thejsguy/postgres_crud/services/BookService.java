package com.thejsguy.postgres_crud.services;

import com.thejsguy.postgres_crud.entity.Book;
import com.thejsguy.postgres_crud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }
}
