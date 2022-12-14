package com.bridgelabz;

import java.util.*;
import java.util.regex.Pattern;


public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration: ");
        Scanner sc = new Scanner(System.in);
        Scanner scanner =new Scanner(System.in);
        /*
        First name starts with Cap and has minimum 3 characters
         */
        System.out.print("Enter First name: ");
        boolean firstName = Pattern.matches("[A-Z][a-z]{3,}", sc.next());
        System.out.println("Result : " + firstName);

        System.out.println(" ");
        /*
        Last name starts with Cap and has minimum 3 characters
         */
        System.out.print("Enter last name: ");
        boolean lastName = Pattern.matches("[A-Z][a-z]{3,}", sc.next());
        System.out.println("Result : " + lastName);

        System.out.println(" ");
        /*
         Applying the Regex pattern to check whether the email matches the pattern or not
         */
        System.out.print("Enter your e-mail id: ");
        boolean email = Pattern.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@([a-zA-Z0-9]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$", sc.next());
        System.out.println("Result : " + email);

        System.out.println(" ");

        /*
         Country code follow by space and 10 digit number
         */
        System.out.print("Enter your Mobile number: ");
        boolean mobileNo = Pattern.matches("[0-9]{1,15}\s[9876]{1}[0-9]{9}",scanner.nextLine());
        System.out.println("Result : " + mobileNo);

        System.out.println(" ");
        /*
        Password must be minimum of 8 character.
        at least one upper-case.
        at least one number.
        at least one special character.
         */
        System.out.print("Enter your Password: ");
        boolean password = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}$", sc.next());
        System.out.println("Result : " + password);

        System.out.println(" ");
    }
}
