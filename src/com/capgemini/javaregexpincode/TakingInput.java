package com.capgemini.javaregexpincode;

import java.util.Scanner;

public class TakingInput {
	private static String pinCode;

	static String read() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Pin Code");
		pinCode = scan.nextLine();
		return pinCode;
	}
}
