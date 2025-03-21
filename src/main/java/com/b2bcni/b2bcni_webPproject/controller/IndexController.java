package com.b2bcni.b2bcni_webPproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
     @GetMapping("/")
    public String home() {
        return "index";  // 타임리프 템플릿을 반환
    }
}
