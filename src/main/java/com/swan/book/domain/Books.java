package com.swan.book.domain;

import com.swan.book.utils.LocalDateConverter;
import java.time.LocalDate;
import javax.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;


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

    @Column(name = "published_date")
    @Convert(converter = LocalDateConverter.class)
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
