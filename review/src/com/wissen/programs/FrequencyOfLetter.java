package com.wissen.programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfLetter {

	public static void main(String[] args) {
		String inputString = "srinivas123 pallala56789123";
		int[] count = new int[26];
		char[] ch = inputString.toCharArray();
		Map<Character, Integer> charCount = new HashMap<>();
		for (char c : ch) {
			if (Character.isLetter(c)) {
				char lower = Character.toLowerCase(c);
				charCount.put(c, charCount.getOrDefault(lower, 0) + 1);
			}
			if (Character.isDigit(c)) {
				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
			}
		}
		System.out.println(charCount);
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				char lower = Character.toLowerCase(ch[i]);
				int lowerIndex = lower - 'a';
				count[lowerIndex]++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				Character letter = (char) ('a' + i);
				System.out.println("letter-" + letter + "  frequency-" + count[i]);
			}
		}
	}

}
