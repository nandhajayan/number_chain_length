package com.example.numberchain;

import java.util.Scanner;

public class NumberChainLength {

	public static void main(String[] args) {
		System.out.println("Enter the input: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		NumberChainLengthCalc calculator = new NumberChainLengthCalc();
		System.out.println("Chain Length : " + calculator.createNumberChain(input));
		
	}

}
