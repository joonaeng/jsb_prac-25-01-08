package com.example.sbb_prac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World";
    }

    @GetMapping("/about")
    public void about() {
        System.out.println("Refresh Requested");
    }
}
