package com.ll.exam.app0203.app.home.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String main() {
        return "home/main";
    }

    @RequestMapping("/test/upload")
    public String upload() {
        return "home/test/upload";
    }
}
