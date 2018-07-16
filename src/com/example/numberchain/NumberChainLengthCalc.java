package com.example.numberchain;

import java.util.ArrayList;
import java.util.List;

public class NumberChainLengthCalc {
	
	public int createNumberChain(int input) {
		int numberChainLength = 1;
		List<Integer> inputArray = new ArrayList<>();
		int descOrder = getDescendingOrder(input);
		int ascOrder = getAscendingOrder(input);
		while(true) {
			int output = getSubtractedValue(descOrder, ascOrder);
			descOrder = getDescendingOrder(output);
			ascOrder = getAscendingOrder(output);
			if(!inputArray.contains(output)) {
				numberChainLength++;
				inputArray.add(output);
			}
			else
				break;
		}
		return numberChainLength;
		
	}

	public int getDescendingOrder(int number) {
		int sortedNumber = 0;
		for (int i = 9; i >= 0; i--) {
			int tmpNumber = number;
			while (tmpNumber > 0) {
				int digit = tmpNumber % 10;
				if (digit == i) {
					sortedNumber *= 10;
					sortedNumber += digit;
				}
				tmpNumber /= 10;
			}
		}
		return sortedNumber;
	}

	public int getAscendingOrder(int number) {

		int sortedNumber = 0;
		for (int i = 0; i <= 9; i++) {
			int tmpNumber = number;
			while (tmpNumber > 0) {
				int digit = tmpNumber % 10;
				if (digit == i) {
					sortedNumber *= 10;
					sortedNumber += digit;
				}
				tmpNumber /= 10;
			}
		}
		return sortedNumber;
	}

	public int getSubtractedValue(int descOrder, int ascOrder) {
		return descOrder - ascOrder;
	}

}
