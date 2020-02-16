package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your favourite programming language: ");
        String userFavouriteProgLang = input.nextLine();

       if (userFavouriteProgLang.equalsIgnoreCase("Java")) {
           System.out.println("Good choice!");
        } else {
           System.out.println("Try again!");
       }
    }
}
