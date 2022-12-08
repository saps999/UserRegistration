package com.bridgelabz;

import java.util.*;
import java.util.regex.Pattern;


public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First name: ");
        boolean firstName = Pattern.matches("[A-Z][a-z]{3,}", sc.next());
        System.out.println("Result : " + firstName);
    }
}
