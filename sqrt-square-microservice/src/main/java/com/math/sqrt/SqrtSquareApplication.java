package com.math.sqrt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class SqrtSquareApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqrtSquareApplication.class, args);
    }

    @GetMapping("/sqrt")
    public double sqrt(@RequestParam double a) {
        return Math.sqrt(a);
    }

    @GetMapping("/square")
    public double square(@RequestParam double a) {
        return a * a;
    }
}