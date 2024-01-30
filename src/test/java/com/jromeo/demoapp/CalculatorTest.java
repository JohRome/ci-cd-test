package com.jromeo.demoapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {


    @Test
    void testAddNumbers() {

        //given
        Calculator sut = new Calculator(5, 5);

        //when
        int actual = sut.addNumbers();

        //then
        int expected = 10;
        assertEquals(expected, actual);
    }
}