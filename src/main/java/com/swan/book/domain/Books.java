package com.swan.book.domain;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String author;
    private String translator;
    private String publisher;
    private LocalDate publishedDate;

    @Builder
    public Books(String name, String author, String translator, String publisher, LocalDate publishedDate) {
        this.name = name;
        this.author = author;
        this.translator = translator;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
    }
}
