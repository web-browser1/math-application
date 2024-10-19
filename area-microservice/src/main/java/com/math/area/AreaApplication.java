package com.math.area;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class AreaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AreaApplication.class, args);
    }

    @GetMapping("/triangle")
    public double triangle(@RequestParam double base, @RequestParam double height) {
        return 0.5 * base * height;
    }

    @GetMapping("/square")
    public double square(@RequestParam double side) {
        return side * side;
    }

    @GetMapping("/sphere")
    public double sphere(@RequestParam double radius) {
        return 4 * Math.PI * radius * radius;
    }
}