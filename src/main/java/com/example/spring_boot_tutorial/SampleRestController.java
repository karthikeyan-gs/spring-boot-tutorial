package com.example.spring_boot_tutorial;

import java.util.Date;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/spring-boot-tutorial")
public class SampleRestController {
    @GetMapping("/ping")
    public String ping() {
        return new String("Successfully pinged " + new Date());
    }
}
