package com.swan.book.service;

import com.swan.book.domain.Books;

import com.swan.book.domain.Rental;
import com.swan.book.domain.mapper.RentalMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RentalMybatisService {

    @Autowired
    private RentalMapper mapper;

    public List<Rental> selectTest() {
        return mapper.selectTest();
    }

}
