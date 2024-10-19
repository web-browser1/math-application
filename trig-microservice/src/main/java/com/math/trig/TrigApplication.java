package com.math.trig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class TrigApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrigApplication.class, args);
    }

    @GetMapping("/sin")
    public double sin(@RequestParam double a) {
        return Math.sin(a);
    }

    @GetMapping("/cos")
    public double cos(@RequestParam double a) {
        return Math.cos(a);
    }

    @GetMapping("/tan")
    public double tan(@RequestParam double a) {
        return Math.tan(a);
    }
}