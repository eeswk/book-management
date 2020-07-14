package com.swan.book.admin.web.dto;

import com.swan.book.domain.Books;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BookSaveRequestDto {

    private String name;
    private String author;
    private String translator;
    private String publisher;
    private LocalDate publishedDate;

    @Builder
    public BookSaveRequestDto(String name, String author, String translator, String publisher, LocalDate publishedDate) {
        this.name = name;
        this.author = author;
        this.translator = translator;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
    }

    public Books toEntity() {
        return Books.builder().name(name)
                .author(author)
                .translator(translator)
                .publisher(publisher)
                .publishedDate(publishedDate)
                .build();
    }
}
