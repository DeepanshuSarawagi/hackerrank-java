package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Simple input output challenge
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("Hello, World");
        System.out.println(inputString);
        scanner.close();
    }
}
