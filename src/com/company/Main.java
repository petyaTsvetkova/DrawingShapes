package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String name = input.nextLine();

        System.out.println(name.charAt(0));
    }
}
