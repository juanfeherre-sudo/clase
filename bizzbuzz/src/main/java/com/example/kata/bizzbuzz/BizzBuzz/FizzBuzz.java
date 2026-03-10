package com.example.kata.bizzbuzz.BizzBuzz;



public class FizzBuzz {

    public static final Integer MIN_VALUE = 0;
    public static final Integer MAX_VALUE = 100;
    public static final Integer FIZZ_NUMBER = 3;
    public static final Integer BUZZ_NUMBER = 5;
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String calculate(int number){
        if (number <= MIN_VALUE || number >= MAX_VALUE){
            throw new IllegalArgumentException("el numero debe ser mayor a 0 o menor a 100");
        }
        if (number % FIZZ_NUMBER != 0 && number % BUZZ_NUMBER != 0){
            return Integer.toString(number);
        }
        String result = "";
        if (number % FIZZ_NUMBER == 0){
            result =  FIZZ;
        }

        if (number % BUZZ_NUMBER == 0){
            result = result.concat( BUZZ);
        }
        return result;

    }
    public void print (){
        for (int i = MIN_VALUE; i<= MAX_VALUE;i++){
            System.out.println(calculate(i));
        }
    }
}
