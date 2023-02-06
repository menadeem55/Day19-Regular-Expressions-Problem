package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean userName(String regex, String input) {
		return Pattern.compile(regex).matcher(input).matches();
	}

	public static void main(String[] args) {
		System.out.println("welcome to User Registration program");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName = "[A-Z]{1}[a-z]{2,}";
		String input = scanner.next(); // Nadeem = ture, nadeem = false
		UserRegistration userRegistration = new UserRegistration();
		System.out.println(userRegistration.userName(firstName, input));
	}
}
