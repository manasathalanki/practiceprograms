package com.wissen.review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "ABc", "abc", "BC", "ABC", "abc", "bc", "abC", "cd", "bc", "bc", "ABc", "CD" };
		int k = 0, l = 0;
		List<String> ar = new ArrayList<>();
//		TreeSet<String> set=new TreeSet(String.CASE_INSENSITIVE_ORDER());
		int c = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} 
			/*
			 * else map.put(arr[i], 1);
			 */

		}
		System.out.println(map);

		TreeSet<String> set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equalsIgnoreCase(arr[j])) {

					set.add(arr[i]);

				}
			}

		}
		System.out.println();
		System.out.println(set);
//		System.out.println(s);
//		System.out.println(ar);
		// System.out.println(Arrays.toString(s1));

	}

}
