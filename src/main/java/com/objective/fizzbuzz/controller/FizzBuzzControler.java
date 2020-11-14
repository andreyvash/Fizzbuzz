package com.objective.fizzbuzz.controller;

import com.objective.fizzbuzz.enums.FizzBuzz;
import com.objective.fizzbuzz.service.FizzBuzzService;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fizzbuzz")
public class FizzBuzzControler {
    
    @Autowired
    private FizzBuzzService fizzBuzzService;
    
    @GetMapping("/{numero}")
    public String multiplo(@PathVariable int numero)
    {
        return fizzBuzzService.multiplo(numero);    
    }

}
