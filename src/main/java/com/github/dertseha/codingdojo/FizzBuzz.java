package com.github.dertseha.codingdojo;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;

        if (isDivisibleBy3 && isDivisibleBy5) {
            return "FizzBuzz";
        }
        if (isDivisibleBy3) {
            return "Fizz";
        }
        if (isDivisibleBy5) {
            return "Buzz";
        }
        //kein Cast sondern eine Convertierung
        return Integer.toString(number);
    }
}
