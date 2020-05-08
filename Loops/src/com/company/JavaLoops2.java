package com.company;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        /*
        We use the integers a, b, and n to create the following series:
        (a + (2^0)*b), (a + (2^0)*b + (2^1)*b), (a + (2^0)*b + (2^1)*b + (2^2)*b), .......(a + (2^0)*b +
        (2^1)*b + (2^2)*b......(2^n-1)*b)

        You are given  queries in the form of a, b, and n. For each query, print the series corresponding to the given , ,
        and values as a single line of  space-separated integers.
         */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = 0;
            int twoPowered = 1;
            for (int j = 0; j<=n-1; j++) {
                if (j == 0) {
                    sum = a + (twoPowered * b);
                } else {

//                    twoPowered = (int)Math.pow(2, j);
                    // calculate twoPowered without using Math.pow
                    for (int k =1; k<=j; k++) {
                        twoPowered *= 2;
                    }
                    System.out.println("twoPowered is " + twoPowered);
                    sum += (twoPowered * b);
                }
                System.out.print(sum + " ");
                twoPowered = 1;
            }
            System.out.println();
        }
    }
}
