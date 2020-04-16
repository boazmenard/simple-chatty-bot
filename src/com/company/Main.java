package com.company;
//package bot;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Kim.");
        System.out.println("I was created in 2020.");
        System.out.println("Please, remind me your name.");
        Scanner scnr = new Scanner(System.in);
        String name = scnr.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7");
        int remainder3 = scnr.nextInt();
        int remainder5 = scnr.nextInt();
        int remainder7 = scnr.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");

    }
}
