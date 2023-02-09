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
		/*
		 * User need to enter a valid First Name and Last Name First name and Last Name
		 * start capital minimum 1.
		 */
		System.out.println("Enter First Name: ");
		String firstName = "[A-Z]{1}[a-z]{2,}";
		String input = scanner.next(); // Nadeem = ture, nadeem = false

		System.out.println("Enter Last Name: ");
		String lastName = "[A-z]{1}[a-z]{2,}";
		String inputLastName = scanner.next(); // Akhtar = true, akhtar = false

		/*
		 * User need to enter a valid email to valid email is (abc.xyz@bl.co.in)
		 */
		System.out.println("Enter Email Id: ");
//		String emailId = "[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})";	//abc.xyz@bl.co.in
		String emailId = "[a-zA-z0-9][a-zA-z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+"; // to provide all email
		String inputEmailId = scanner.next(); // me.nadeem@gmail.com = ture, me.nadeem55@gmail.com = false

		/*
		 * User need to follow pre-defined Mobile Format Country code follow by hypen
		 * and 10 digit numbers
		 */
		System.out.println("Enter Mobile Number: ");
		String mobileNumber = "(91)(-)[6-9]{1}[0-9]{9}";
		String inputmobileNumber = scanner.next(); // 91-8826923224 = ture, 918826923224 = false

		/*
		 * As a user need to add Password rules At a minimum 8 characters And maximum
		 * any character and should have at least one numeric number Has exactly one
		 * special char
		 */
		System.out.println("Enter Password");
//		String Password = "[A-za-z0-9]{8}$";
//		String Password = "((?=.*[A-Z]).{8,})";
//		String Password = "((?=.*[A-Z])(?=.*[0-9]).{8,})";
		String Password = "((?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*_]).{8,})";
		String inputPassword = scanner.next(); // Asdfg@12124 = ture, asdfgh@55 = false, at least one special char

		UserRegistration userRegistration = new UserRegistration();
		System.out.println(userRegistration.userName(firstName, input));
		System.out.println(userRegistration.userName(lastName, inputLastName));
		System.out.println(userRegistration.userName(emailId, inputEmailId));
		System.out.println(userRegistration.userName(mobileNumber, inputmobileNumber));
		System.out.println(userRegistration.userName(Password, inputPassword));
	}
}
