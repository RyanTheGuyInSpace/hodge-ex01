/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Hodge
 */

import java.util.Locale;
import java.util.Scanner;

/*
 * Create a program that prompts for your name and prints a greeting using
 * your name
 */
public class Solution01 {
    public static void main(String[] args) {

        // Print a statement asking the user for their name
        // Accept User input and store in variable
        // Print another statement greeting the user using the entered name

        Scanner scan = new Scanner(System.in);

        System.out.println("Hey there, what's your name?");
        String name = scan.nextLine().toString();

        String output = String.format("Hey, %s, nice name! You make it yourself?", name);

        System.out.println(output);
    }
}
