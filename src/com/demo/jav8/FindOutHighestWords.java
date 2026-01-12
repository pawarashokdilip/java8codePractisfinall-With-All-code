package com.demo.jav8;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Commit Message:
 * Add Java 8 program to find the longest word in a sentence
 *
 * Description:
 * This class uses Java 8 Stream API to split a sentence
 * and find the word with the maximum length.
 */
//01 Given a sentence, find the word that has the highest length || Most Asked
public class FindOutHighestWords {

    public static void main(String[] args) {

        // Input sentence
        String s = "hi my name is ashok i am lernning java 8";

        // Split sentence into words and find the longest word using Java 8 Stream
        String words = Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length))
                .get();

        // Print the longest word
        System.out.println(words);
    }
}
