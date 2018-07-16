package com.example.numberchain;

import java.util.Arrays;
import java.util.HashSet;

public class NumberChainLengthCalc {

	public int createNumberChain(String input) {
		int difference = Integer.parseInt(input);
		int numberChainLength = 0;
		HashSet<Integer> h = new HashSet<Integer>();
		for (int i = 0; i <= h.size(); i++) {
			int descOrder = getDescendingOrder(Integer.toString(difference));
			int ascOrder = getAscendingOrder(Integer.toString(difference));
			difference = getSubtractedValue(descOrder, ascOrder);
			h.add(difference);
			numberChainLength++;
		}
		return numberChainLength;

	}

	public int getDescendingOrder(String number) {
		String input = number;
		char arr[] = input.toCharArray();
		Arrays.sort(arr);
		String output = "";
		for (int j = arr.length - 1; j >= 0; j--) {
			output = output + Character.toString(arr[j]);
		}
		int descending = Integer.parseInt(output);
		return descending;
	}

	public int getAscendingOrder(String number) {
		String input = number;
		char arr[] = input.toCharArray();
		Arrays.sort(arr);
		String output = "";
		for (int j = 0; j < arr.length; j++) {
			output = output + Character.toString(arr[j]);
		}
		int ascending = Integer.parseInt(output);
		return ascending;
	}
	
	public int getSubtractedValue(int descOrder, int ascOrder) {
		return descOrder - ascOrder;
	}

}
