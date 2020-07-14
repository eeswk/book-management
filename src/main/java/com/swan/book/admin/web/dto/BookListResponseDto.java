package com.swan.book.admin.web.dto;

import com.swan.book.domain.Books;
import java.time.LocalDate;
import lombok.Getter;

@Getter
public class BookListResponseDto {
    private Long id;
    private String name;
    private String author;
    private String translator;
    private String publisher;
    private LocalDate publishedDate;

    public BookListResponseDto(Books entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.author = entity.getAuthor();
        this.translator = entity.getTranslator();
        this.publisher = entity.getPublisher();
        this.publishedDate = entity.getPublishedDate();
    }
}
