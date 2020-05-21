package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        scan.nextLine();
        double inputDouble = scan.nextDouble();
        scan.nextLine();
        String inputString = scan.nextLine();
        System.out.println(i + inputInt);
        System.out.println(d + inputDouble);
        System.out.println(s + inputString);
        scan.close();

    }
}
