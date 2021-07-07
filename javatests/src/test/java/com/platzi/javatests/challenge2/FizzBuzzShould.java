package com.platzi.javatests.challenge2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzShould {
    /*fizzBuzz(3) ⇒ "Fizz"
    fizzBuzz(6) ⇒ "Fizz"
    fizzBuzz(5) ⇒ "Buzz"
    fizzBuzz(10) ⇒ "Buzz"
    fizzBuzz(15) ⇒ "FizzBuzz"
    fizzBuzz(30) ⇒ "FizzBuzz"
    fizzBuzz(2) ⇒ "2"
    fizzBuzz(16) ⇒ "16"*/

    @Test
    public void return_Fizz_when_is_divisible_by_3() {
        assertThat(FizzBuzz.fizzBuzz(3), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(6), is("Fizz"));
    }

    @Test
    public void return_Buzz_when_is_divisible_by_5() {
        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void return_FizzBuzz_when_is_divisible_by_5_and_3() {
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    public void return_the_same_number_when_is_not_FizzBuzz_or_Fizz_or_Buzz() {
        assertThat(FizzBuzz.fizzBuzz(2), is("2"));
        assertThat(FizzBuzz.fizzBuzz(16), is("16"));
    }
}
