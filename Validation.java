package com.bridgelabz.userRegistration;
//Uc2
import java.util.Scanner;
import java.util.regex.Pattern;
public class Validation {
	public static final String NAME_REGEX="[A-Z][a-z]{2,}";
	public static boolean validateName(String name) {
		return Pattern.matches(NAME_REGEX, name);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName=sc.next();
		System.out.println(validateName(firstName));
		System.out.println("Enter Last Name");
		String lastName=sc.next();
		System.out.println(validateName(lastName));
	}
}
