package day10ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ay ismi giriniz...");
        String monthName=input.next();
        if (monthName.equalsIgnoreCase("January")){
            System.out.println("1");
        }else if (monthName.equalsIgnoreCase("Februaey")){
            System.out.println("2");
        }else if (monthName.equalsIgnoreCase("march")) {
            System.out.println("3");
        }else if (monthName.equalsIgnoreCase("april")) {
            System.out.println("4");
        }else if (monthName.equalsIgnoreCase("may")) {
            System.out.println("5");
        }else if (monthName.equalsIgnoreCase("june")) {
            System.out.println("6");
        }else if (monthName.equalsIgnoreCase("july")) {
            System.out.println("7");
        }else if (monthName.equalsIgnoreCase("agust")) {
            System.out.println("8");
        }else if (monthName.equalsIgnoreCase("september")) {
            System.out.println("9");
        }else if (monthName.equalsIgnoreCase("october")) {
            System.out.println("10");
        }else if (monthName.equalsIgnoreCase("november")) {
            System.out.println(11);
        }else if (monthName.equalsIgnoreCase("december")) {
            System.out.println("12");
        }else {
            System.out.println("invalid Month Name");
        }
    }
}
