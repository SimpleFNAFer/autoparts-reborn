package com.autoparts.cartservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @GetMapping("/cart")
    public String cart(@RequestParam Long userId) {
        return "Placeholder";
    }

    @PostMapping("/add")
    public String add(@RequestParam Long userId, @RequestParam Long partId) {
        return "Placeholder";
    }

    @DeleteMapping("/rm")
    public String rm(@RequestParam Long userId, @RequestParam Long partId) {
        return "Placeholder";
    }

    @DeleteMapping("/clean")
    public String clean(@RequestParam Long userId) {
        return "Placeholder";
    }
}
