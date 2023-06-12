package org.example.tasks;

import java.util.stream.Stream;

public class StringFeatures {

    public static void main(String[] args) {
        printLines();
        System.out.println("");
        repeat();
        formatted();
    }

    //lines
    private static void printLines() {
        System.out.println("******* String java11 feature start - lines() *******");
        String sentence = "I \nam learning \n java\nprogram";
        Stream<String> lineStream = sentence.lines();
        lineStream.map(x -> x.strip()).forEach(System.out::println);
        System.out.println("******* String java11 feature end - lines() *******");
    }

    private static void repeat() {
        System.out.println("****** String java11 feature start - formatted() *******");
        for (int i = 0; i < 10; i++) System.out.println("*".repeat(i));
        System.out.println("****** String java11 feature end - formatted() *******");
    }

    private static void formatted(){
        String message = "Welcome to %s program".formatted("java");
        System.out.println(message);
    }
}
