package org.example;


import java.util.Optional;

/**
 * Hello world!
 *
 */
public class FizzBuzz
{
    int ITERATIONS = 100;
    public String fizzbuzz(Integer number){
        String result = Optional.of(number).map(n -> (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : "")).get();
        return result.isEmpty()? number.toString() : result;
    }

    public static void main( String[] args )
    {
        FizzBuzz fB = new FizzBuzz();
        for (int i = 0; i < fB.ITERATIONS; i++) {
            System.out.println(fB.fizzbuzz(i));
        }
    }
}
