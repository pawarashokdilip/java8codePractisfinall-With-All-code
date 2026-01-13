package com.demo.jav8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Commit Message:
 * Add Java 8 program to count occurrence of characters in a string
 *
 * Description:
 * This program uses Java 8 Stream API to convert a string into a stream
 * of characters, group identical characters, and count their occurrences
 * using Collectors.groupingBy() and Collectors.counting().
 */

public class OcuuranceCharaters {

	public static void main(String[] args) {

		// Input string in which we want to count character occurrences
		String input = "Diobos is big logistic domain";

		// Convert the string into an IntStream of characters
		// chars() gives ASCII/Unicode values of each character
		Map<Character, Long> occurances = input.chars()

				// Convert int value to Character
				.mapToObj(c -> (char) c)

				// Group characters and count how many times each character appears
				.collect(Collectors.groupingBy(Function.identity(), // Key: character itself
						Collectors.counting() // Value: number of occurrences
				));

		// Print the result map
		System.out.println(occurances);
	}
}
