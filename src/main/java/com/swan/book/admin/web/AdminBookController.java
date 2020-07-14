package com.swan.book.admin.web;

import com.swan.book.admin.service.AdminBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping(path = "/admin")
public class AdminBookController {

    private final AdminBookService adminBookService;

    @RequestMapping(path = "regist")
    public String regist() {
        return "admin/regist";
    }

    @RequestMapping(path = "list")
    public String list(Model model) {
        model.addAttribute("books", adminBookService.findAllDesc());
        return "admin/list";
    }

    @RequestMapping(path = "detail/{bookId}")
    public String detail(@PathVariable Long bookId, Model model) {
        model.addAttribute("book", adminBookService.fineById(bookId));
        return "admin/detail";
    }

}
