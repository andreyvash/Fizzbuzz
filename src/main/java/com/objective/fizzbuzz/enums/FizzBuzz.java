package com.objective.fizzbuzz.enums;

public enum FizzBuzz {

    FIZZ("Fizz"),
    BUZZ("Buzz");

    private String descricao;

    private FizzBuzz(String codigo) {
        descricao = codigo;
    }

    public String getDescricao()
    {
        return descricao;
    }
}
