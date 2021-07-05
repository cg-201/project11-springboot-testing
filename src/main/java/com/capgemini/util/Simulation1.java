package com.capgemini.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Simulation1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		int max = list.stream().mapToInt(v -> v).max().getAsInt();
		System.out.println(max);
		
		int max1 = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max1);
		
		int[] arr = list.stream().mapToInt(v -> v).toArray();
		int[] arr1 = {1, 2, 3};
		
		List<Integer> list1 = list.stream().filter(v -> v %2 == 0).collect(Collectors.toList());
		System.out.println(list1);
	}
}
