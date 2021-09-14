/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String s;
	    System.out.println("WHat is the input string? ");
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int n = s.length();
        System.out.println(s + " has " + n + " characters.");
    }
}
