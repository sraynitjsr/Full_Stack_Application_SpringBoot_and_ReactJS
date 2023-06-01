package com.sraynitjsr.movies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {
    @GetMapping("/")
    public String home() {
        return "Welcome to Movies Application";
    }
}
