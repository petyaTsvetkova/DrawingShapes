package com.company;

public class Task6 {
    public static void main(String[] args) {
        String[] address = {"Иван Иванов", "България", "София", "ул. Незабравка 12", "1000"};
        System.out.println(formatLetter(address));

    }
    public static String formatLetter(String[]address) {
        return String.format("%s\n%s\n%s\n%s\n%s", address[0], address[1], address[2], address[3], address[4] );
    }
}
