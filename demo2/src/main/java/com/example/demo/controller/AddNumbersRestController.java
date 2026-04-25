package com.example.demo.controller;

import com.example.demo.service.AddNumbersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddNumbersRestController {

    private final AddNumbersService addNumbersService;

    public AddNumbersRestController(AddNumbersService addNumbersService) {
        this.addNumbersService = addNumbersService;
    }

    @GetMapping("/addNumbers")
    public int addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return addNumbersService.addNumbers(num1, num2);
    }
}
