package com.swan.book.domain;

import com.fasterxml.jackson.databind.node.LongNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@Alias("rental")
@NoArgsConstructor
@AllArgsConstructor
public class Rental {
    private Long id;
    private String name;
}
