package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int i = scanner.nextInt();
        scanner.nextLine();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println("String is " + s);
        System.out.println("Double is " + d);
        System.out.println("integer is " + i);

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (i = 1; i<=10; i++) {
            System.out.println(N + " x " + i + " = " + (N*i) );
        }

    }
}
