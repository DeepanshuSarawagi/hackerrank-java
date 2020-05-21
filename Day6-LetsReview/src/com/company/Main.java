package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string of your choice: ");
        String s = scanner.nextLine();
        for (int i=0; i<s.length(); i+=2) {
            System.out.print(s.charAt(i));
        }
        System.out.print(" ");
        for (int i=1; i<s.length(); i+=2) {
            System.out.print(s.charAt(i));
        }
    }
}
