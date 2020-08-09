package com.swan.book.service;

import com.swan.book.domain.Rental;
import com.swan.book.domain.mapper.RentalMapper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RentalMybatisServiceTest {

    @Autowired
    private RentalMapper mapper;

    @Test
    public void test() {
        List<Rental> rentals = mapper.selectTest();
        log.info("rentals=>" + rentals);
    }
}