package com.company;

public class Task1 {
    public static void main(String[] args) {
        String one = "";
        String two = "Java";

        int index = firstPosition(one, two);
        System.out.println(index);
    }
    public static int firstPosition (String main, String part) {
          if (main == null || part == null) {
              return -5;
          }else if (main.length()==0){
              return -3;
          } else {
              return main.indexOf(part);
          }
        }
}
