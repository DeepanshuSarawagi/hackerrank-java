package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Given an integer, , perform the following conditional actions:
        //If  is odd, print Weird
        //If  is even and in the inclusive range of 2 to 5print Not Weird
        //If  is even and in the inclusive range of 6 to 20, print Weird
        //If  is even and greater than 20, print Not Weird
        //Complete the stub code provided in your editor to print whether or not  is weird.

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            if ((N >= 2 && N <= 5) || (N > 20)) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}
