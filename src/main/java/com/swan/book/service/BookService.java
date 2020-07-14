package com.swan.book.service;

import com.swan.book.domain.Books;
import com.swan.book.repository.BookRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    public Books detail(Long bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    public List<Books> list() {
        return bookRepository.findAll();
    }
}
