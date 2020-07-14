package com.swan.book.admin.web;

import com.swan.book.admin.service.AdminBookService;
import com.swan.book.admin.web.dto.BookSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/admin")
@RequiredArgsConstructor
public class AdminBooksApiController {
    private final AdminBookService adminBookService;

    @PostMapping(path = "api/v1/books")
    public Long save(@RequestBody BookSaveRequestDto requestDto) {
        return adminBookService.save(requestDto);
    }
}
