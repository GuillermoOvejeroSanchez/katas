package org.example;

import static org.junit.Assert.assertTrue;
import static org.fest.assertions.Assertions.assertThat;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest
{
    @Test
    public void givenMultipleOfThreeShouldReturnFizz(){
        FizzBuzz f = new FizzBuzz();
        int value = 3;
        String returnValue = "Fizz";
        assertThat(f.fizzbuzz(value)).isEqualTo(returnValue);
        assertThat(f.fizzbuzz(value*2)).isEqualTo(returnValue);
        assertThat(f.fizzbuzz(value*6)).isEqualTo(returnValue);
        assertThat(f.fizzbuzz(value*9)).isEqualTo(returnValue);

    }

    @Test
    public void givenMultipleOfFiveShouldReturnBuzz(){
        FizzBuzz f = new FizzBuzz();
        int value = 5;
        String returnValue = "Buzz";
        assertThat(f.fizzbuzz(value)).isEqualTo(returnValue);
        assertThat(f.fizzbuzz(value*2)).isEqualTo(returnValue);
        assertThat(f.fizzbuzz(value*7)).isEqualTo(returnValue);
        assertThat(f.fizzbuzz(value*8)).isEqualTo(returnValue);

    }

    @Test
    public void givenMultipleOfThreeAndFiveShouldReturnFizzBuzz(){
        FizzBuzz f = new FizzBuzz();
        String returnValue = "FizzBuzz";
        assertThat(f.fizzbuzz(15)).isEqualTo(returnValue);
        assertThat(f.fizzbuzz(45)).isEqualTo(returnValue);
        assertThat(f.fizzbuzz(30)).isEqualTo(returnValue);

    }

    @Test
    public void givenNotAMultipleOfThreeAndFiveShouldReturnNumber(){
        FizzBuzz f = new FizzBuzz();
        assertThat(f.fizzbuzz(1)).isEqualTo("1");
        assertThat(f.fizzbuzz(4)).isEqualTo("4");
        assertThat(f.fizzbuzz(7)).isEqualTo("7");

    }
}
