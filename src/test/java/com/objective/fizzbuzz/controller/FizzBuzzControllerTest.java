package com.objective.fizzbuzz.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static com.objective.fizzbuzz.enums.FizzBuzz.*;

import com.objective.fizzbuzz.enums.FizzBuzz;

import org.codehaus.jackson.JsonProcessingException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@SpringBootTest
public class FizzBuzzControllerTest {


    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;
  

    @BeforeEach
    public void setUp()
    {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @AfterEach
    public void shutDown()
    {

    }
    
    @Test
    public void deveRetornarFizz_quandoNumero3() throws Exception
    {
        mockMvc.perform(get("/fizzbuzz/3")
                .contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").value(FIZZ.getDescricao()));
    }

    @Test
    public void deveRetornarBuzz_quandoNumero5() throws Exception
    {
        mockMvc.perform(get("/fizzbuzz/5")
                .contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").value(BUZZ.getDescricao()));
    }

    @Test
    public void deveRetornarFizzBuzz_quandoNumero15() throws Exception
    {
        mockMvc.perform(get("/fizzbuzz/15")
                .contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").value(FIZZ.getDescricao() + BUZZ.getDescricao()));
    }
}
