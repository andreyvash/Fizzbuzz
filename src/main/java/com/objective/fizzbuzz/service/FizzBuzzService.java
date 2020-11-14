package com.objective.fizzbuzz.service;


import com.objective.fizzbuzz.enums.FizzBuzz;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    
    public String multiplo(int numero)
    {
        if(numero < 1 || numero > 100)
            return "Numero deve estar entre 1 e 100";

        StringBuilder str = new StringBuilder();

        if(multiploDeN(numero, 3))
            str.append(FizzBuzz.FIZZ.getDescricao());

        if(multiploDeN(numero, 5))
            str.append(FizzBuzz.BUZZ.getDescricao());  
            
        str.append(str.length() < 1 ? numero : "");  
        str.append("\n");  

        return str.toString();    
    }

    private boolean multiploDeN(int i, int n)
    {
        return i % n == 0;
    }

}
