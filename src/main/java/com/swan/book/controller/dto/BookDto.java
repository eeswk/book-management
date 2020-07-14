package com.swan.book.controller.dto;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BookDto {

    private Long id;

    private String name;

    private String publisher;

    private LocalDate publishedDate;

}