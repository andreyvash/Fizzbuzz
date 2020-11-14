package com.objective.fizzbuzz.service;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static com.objective.fizzbuzz.enums.FizzBuzz.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FizzBuzzServiceTest {

    @Autowired
    private FizzBuzzService fizzBuzzService;

    @Test
    public void deveRetornarFizz_quandoNumero3() throws Exception
    {
        String retorno = fizzBuzzService.multiplo(3);

        assertThat(retorno, equalTo(FIZZ.getDescricao() + "\n"));
    }

    @Test
    public void naoDeveRetornarFizz_quandoNumero5() throws Exception
    {
        String retorno = fizzBuzzService.multiplo(5);

        assertThat(retorno, not(FIZZ.getDescricao() + "\n"));
    }

    @Test
    public void deveRetornarBuzz_quandoNumero5() throws Exception
    {
        String retorno = fizzBuzzService.multiplo(5);

        assertThat(retorno, equalTo(BUZZ.getDescricao() + "\n"));
    }

    @Test
    public void naoDeveRetornarBuzz_quandoNumero3() throws Exception
    {
        String retorno = fizzBuzzService.multiplo(3);

        assertThat(retorno, not(BUZZ.getDescricao() + "\n"));
    }

    @Test
    public void deveRetornarNumero_quandoNumeroNaoEhMultiplo() throws Exception
    {
        String retorno = fizzBuzzService.multiplo(13);

        assertThat(retorno, equalTo(13 + "\n"));
    }

    @Test
    public void deveRetornarFizzBuzz_quandoNumero15() throws Exception
    {
        String retorno = fizzBuzzService.multiplo(15);

        assertThat(retorno, equalTo(FIZZ.getDescricao() + BUZZ.getDescricao() + "\n"));
    }

    @Test
    public void deveRetornarErro_quandoNumeroMaiorQue100() throws Exception
    {
        String retorno = fizzBuzzService.multiplo(101);

        assertThat(retorno, equalTo("Numero deve estar entre 1 e 100"));
    }

    @Test
    public void deveRetornarErro_quandoNumeroMenorQue1() throws Exception
    {
        String retorno = fizzBuzzService.multiplo(0);

        assertThat(retorno, equalTo("Numero deve estar entre 1 e 100"));
    }

}
