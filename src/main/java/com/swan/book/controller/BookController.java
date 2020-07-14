package com.swan.book.controller;

import com.swan.book.controller.dto.BookDto;
import com.swan.book.domain.Book;
import com.swan.book.service.BookService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(path = "books")
    public String list(Model model) {
        List<Book> list = bookService.list();
        List<BookDto> books = list.stream().map(
                book -> BookDto.builder()
                        .id(book.getId())
                        .name(book.getName())
                        .publisher(book.getPublisher())
                        .publishedDate(book.getPublishedDate())
                        .build()
        ).collect(Collectors.toList());
        model.addAttribute("books", books);
        return "list";
    }

    @RequestMapping(path = "books/{bookId}")
    public String detail(@PathVariable Long bookId, Model model) {
        Book book = bookService.detail(bookId);
        BookDto bookDto = BookDto.builder()
                .id(book.getId())
                .name(book.getName())
                .publisher(book.getPublisher())
                .publishedDate(book.getPublishedDate())
                .build();
        model.addAttribute("book", bookDto);
        return "detail";
    }
}
