package com.swan.book.domain.mapper;

import com.swan.book.domain.Rental;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface RentalMapper {
    List<Rental> selectTest();
}
