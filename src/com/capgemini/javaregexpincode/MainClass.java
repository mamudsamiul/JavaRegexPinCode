package com.capgemini.javaregexpincode;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Welcome to Pin Code validator");
		String pinCode=TakingInput.read();
		if(CheckFormat.check(pinCode))
			System.out.println("Valid pincode");
		else
			System.out.println("Invalid pin code");

	}

}
