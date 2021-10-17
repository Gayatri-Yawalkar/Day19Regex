package com.bridgelabz.userRegistration;
//Uc4
import java.util.Scanner;
import java.util.regex.Pattern;
public class Validation {
	public static final String NAME_REGEX="[A-Z][a-z]{2,}";
	public static final String NUMBER_REGEX="91\s{1}[7-9]{1}[0-9]{9}";
	public static final String EMAIL_VALIDATION="[A-Za-z]+(\\.[A-Za-z]+)?@[a-zA-Z]+\\.co(m)?(\\.in)?";
	public static boolean validateName(String name) {
		return Pattern.matches(NAME_REGEX, name);
	}
	public static boolean validateNumber(String number) {
		return Pattern.matches(NUMBER_REGEX, number);
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
		sc.nextLine();
		System.out.println("Enter Mobile Number");
		String mobileNumber=sc.nextLine();
		System.out.println(validateNumber(mobileNumber));
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println(validateEmail(email));
	}
}