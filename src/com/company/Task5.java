package com.company;

public class Task5 {
    public static void main(String[] args) {
        String[] address = {"Иван Иванов", "България", "София", "ул. Незабравка 12", "1000"};
        System.out.println(addressReceiver(address));

    }
    public static String addressReceiver (String address[]){
        StringBuilder addressReceive = new StringBuilder();
        for (int i = 0; i < address.length ; i++) {
           addressReceive.append(address[i]).append("\n");

        }return addressReceive.toString();

    }
}
