package com.capgemini.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class HelloWorld {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
	    Integer max = list
	    	      .stream()
	    	      .mapToInt(v -> v)
	    	      .max().orElseThrow(NoSuchElementException::new);
	    System.out.println(max);

	}
	

	public static void main5(String[] args) {
		System.out.println("Hello World");
		
		int arr[] = new int[] {2, 4, 1, 6, 5, 9, 7};
		
		int refIndex = 0;
		List<List<Integer>> list = new ArrayList<>();
		
		while(refIndex <= arr.length) {
			List<Integer> sublist = new ArrayList<>();
			
			for(int i=refIndex; i<arr.length; i++) {
				int item = arr[i];
				
				
				if(sublist.size() == 0) {
					sublist.add(item);
					refIndex++;
				} else {
					Integer max = sublist
				    	      .stream()
				    	      .mapToInt(v -> v)
				    	      .max().getAsInt();
					
					Integer min = sublist
				    	      .stream()
				    	      .mapToInt(v -> v)
				    	      .min().getAsInt();
					
					if(item > max || item < min) {
						break;
					}
				}
				
			}
			
			System.out.println(refIndex);
			
			list.add(sublist);
		}
		
		System.out.println(list);
		
	}

	static int arraySortedOrNot(int arr[], int n) {
		if (n == 1 || n == 0)
			return 1;

		if (arr[n - 1] < arr[n - 2])
			return 0;

		return arraySortedOrNot(arr, n - 1);
	}

	public static void main2(String[] args) {

		// List<Integer> list = Arrays.asList(1, 3, 6, 4, 1, 2);
		// List<Integer> list = Arrays.asList(1, 2, 3);
		List<Integer> list = Arrays.asList(-1, -3);
		Collections.sort(list);
		System.out.println(list);

		int minref = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			int item = list.get(i);

			if (item <= minref) {
				continue;
			} else if (item == minref + 1) {
				minref = minref + 1;
				continue;
			} else if (item > minref + 1) {
				break;
			}
		}

		System.out.println(minref + 1);
	}

	public static void main1(String[] args) {
		System.out.println("Hello World");

		List<Integer> list = Arrays.asList(1, 3, 6, 4, 1, 2);
		Collections.sort(list);
		System.out.println(list);

		int minref = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			int item = list.get(i);

			if (item <= minref) {
				continue;
			} else if (item == minref + 1) {
				minref = minref + 1;
				continue;
			} else if (item > minref + 1) {
				break;
			}
		}

		System.out.println(minref);
	}
}
