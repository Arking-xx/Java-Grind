package com.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "hello world";

        System.out.println(s1.equals(s2));

        // string builder
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append("baeldung");
        stringBuilder.append("is");
        stringBuilder.append("awesome");

        System.out.println("Baeldung is awesome " + stringBuilder.toString());

        String myString = "The " + "quick " + "brown " + "fox...";
        System.out.println("The quick brown fox".concat(myString));

        String myThirdString = String.format("%s %s %.2f %s %s, %s...", "I",
                "ate",
                2.5056302,
                "blueberry",
                "pies",
                "oops");
        System.out.println(myThirdString);

        String[] strings = {"I'm", "running", "out", "of", "pangrams!"};

        String join = String.join(" ", strings);


//        System.out.println(join);

        String[] myFavouriteLanguages = {"Java", "JavaScript", "Python"};
        String toString = Arrays.toString(myFavouriteLanguages);
        System.out.println(toString);

        List<String> awesomeAnimals = Arrays.asList("Shark", "Panda", "Armdaillo");
        String animalString = awesomeAnimals.stream().collect(Collectors.joining(", "));

        System.out.println(animalString);

        String name = "Alice";
        int age = 30;

        String html = """
                  <html>
                
                                <body>
                                    <span>example text</span>
                                </body>
                            </html>
                """;


        System.out.println(html);
    }
}