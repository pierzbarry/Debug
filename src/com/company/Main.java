package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type something...");

        String userInput = "";

        do {
            System.out.println(userInput);
            userInput = keyboard.next();

        } while (userInput != "");

    }
}
