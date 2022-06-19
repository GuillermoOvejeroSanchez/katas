package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator
{
    public static void main( String[] args )
    {
        StringCalculator kata = new StringCalculator();
    }
    private final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?"); // Digit Regex
}
