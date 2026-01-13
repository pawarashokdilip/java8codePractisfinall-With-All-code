package com.demo.jav8;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Commit Message:
 * Add Java 8 program to find the second highest length word in a sentence
 *
 * Description:
 * This program uses Java 8 Stream API to split a sentence into words,
 * sort them by length in descending order, skip the first (longest) word,
 * and then find the second longest word.
 */

public class SecoundHighstLenght {

    public static void main(String[] args) {

        // Input sentence
        String input = "i am the ashok";

        // Find the second longest word using Java 8 streams
        String secondhight = Arrays.stream(input.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .get();

        // Print the second longest word
        System.out.println(secondhight);
    }
}
