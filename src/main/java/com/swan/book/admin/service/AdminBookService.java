package com.swan.book.admin.service;

import com.swan.book.admin.web.dto.BookListResponseDto;
import com.swan.book.admin.web.dto.BookSaveRequestDto;
import com.swan.book.domain.Books;
import com.swan.book.repository.BookRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AdminBookService {

    private final BookRepository bookRepository;

    @Transactional
    public Long save(BookSaveRequestDto requestDto) {
       return bookRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<BookListResponseDto> findAllDesc() {
        return bookRepository.findAllDesc().stream()
                .map(BookListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public BookListResponseDto fineById(Long bookId) {
        Books books = bookRepository.findById(bookId).orElseThrow(() -> new IllegalArgumentException("해당 도서정보가 없습니다. bookId=" + bookId));
        return new BookListResponseDto(books);
    }
}
