package com.example.kata.bizzbuzz.BizzBuzz;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BizzBuzzTest {

    @Test
    void testRangomenor() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int minValue = 0;
        //act
        assertThrows(IllegalArgumentException.class, ()-> fizzBuzz.calculate(minValue));
    }
    @Test
    void testRangomayor() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int maxValue = 101;
        //act
        assertThrows(IllegalArgumentException.class, ()-> fizzBuzz.calculate(maxValue));
    }

    @Test
    void testFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 27;
        String Expected = "Fizz";
        String result = fizzBuzz.calculate(value);

        //act
        assertEquals(Expected,result);
    }
    @Test
    void testBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 15;
        String Expected = "FizzBuzz";
        String result = fizzBuzz.calculate(value);

        //act
        assertEquals(Expected,result);
    }

    @Test
    void testNOBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 4;
        String Expected = Integer.toString(value);
        String result = fizzBuzz.calculate(value);

        //act
        assertEquals(Expected,result);
    }

}