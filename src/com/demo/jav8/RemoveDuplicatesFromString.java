package com.demo.jav8;

/*
 * Commit Message:
 * Add Java 8 program to remove duplicate characters from a string
 *
 * Description:
 * This program uses Java 8 Stream API to remove duplicate characters
 * from the given string and prints the unique characters.
 */

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {

        // Input string
        String input = "abctcsmsd";

        // Convert string to IntStream, remove duplicates, and print unique characters
        input.chars()
             .distinct()
             .mapToObj(m -> (char) m)
             .forEach(System.out::println);
    }
}
