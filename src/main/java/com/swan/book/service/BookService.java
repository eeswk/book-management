package com.swan.book.service;

import com.swan.book.domain.Book;
import com.swan.book.repository.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book detail(Long bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    public List<Book> list() {
        return bookRepository.findAll();
    }
}
