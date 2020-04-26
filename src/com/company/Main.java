package com.company;
//package bot;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Hello! My name is Kim.");
        System.out.println("I was created in 2020.");
        System.out.println("Please, remind me your name.");
        String name = scnr.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7");

        int remainder3 = scnr.nextInt();
        int remainder5 = scnr.nextInt();
        int remainder7 = scnr.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want.");
        int myNumber = scnr.nextInt();
        for (int i = 0; i <= myNumber; i++) {
            System.out.println(i + "!");
        }

        int ans = 0;
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        do {
            ans = scnr.nextInt();
            if (ans != 4) {
                System.out.println("Please, try again");
            }
        } while (ans != 4);

        System.out.print("Congratulations, have a nice day!");
    }
}
