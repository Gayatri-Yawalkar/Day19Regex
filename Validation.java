package com.bridgelabz.userRegistration;
//Uc3
import java.util.Scanner;
import java.util.regex.Pattern;
public class Validation {
	public static final String NAME_REGEX="[A-Z][a-z]{2,}";
	public static final String EMAIL_VALIDATION="[A-Za-z]+(\\.[A-Za-z]+)?@[a-zA-Z]+\\.co(m)?(\\.in)?";
	public static boolean validateName(String name) {
		return Pattern.matches(NAME_REGEX, name);
	}
	public static boolean validateEmail(String email) {
		return Pattern.matches(EMAIL_VALIDATION, email);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName=sc.next();
		System.out.println(validateName(firstName));
		System.out.println("Enter Last Name");
		String lastName=sc.next();
		System.out.println(validateName(lastName));
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println(validateEmail(email));
	}
}