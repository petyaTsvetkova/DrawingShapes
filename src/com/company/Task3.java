package com.company;

public class Task3 {
    public static void main(String[] args) {
        int number = 4;

        System.out.println(numbersRow(number));
    }

    public static String numbersRow(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            sb.append(i).append(",");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}


