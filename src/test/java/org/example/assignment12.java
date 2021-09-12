/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment12 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = scan.nextDouble();

        System.out.print("Rate of Interest: ");
        double interest = scan.nextDouble();

        System.out.print("Number of years: ");
        double years = scan.nextDouble();

        double formula = principal * (1 + interest * 0.01 * years);

        String str1 = String.format("%.2f", formula);

        System.out.println("After " + years + " years at " + interest + "%," + " the investment would be worth $" + str1);

    }
}