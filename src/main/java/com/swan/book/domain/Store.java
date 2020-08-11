package com.swan.book.domain;

import javax.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stores")
@Data
public class Store {

    @Id
    private String id;

    private String name;
    private String city;

}

