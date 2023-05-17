package day10ifstatements;

import java.util.Scanner;

public class Tekrar02 {
    public static void main(String[] args) {
        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ay ismi giriniz :");
        String monthName=input.nextLine();

        if (monthName.equalsIgnoreCase("ocak")){
            System.out.println("1. ay");

        } else if (monthName.equalsIgnoreCase("subat")) {
            System.out.println("2. ay");

        }else if (monthName.equalsIgnoreCase("mart")) {
            System.out.println("3. ay");

        }else if (monthName.equalsIgnoreCase("Nisan")) {
            System.out.println("4. ay");

        }else if (monthName.equalsIgnoreCase("mayıs")) {
            System.out.println("5. ay");

        }else if (monthName.equalsIgnoreCase("haziran")) {
            System.out.println("6. ay");

        }else if (monthName.equalsIgnoreCase("temmuz")) {
            System.out.println("7. ay");

        }else if (monthName.equalsIgnoreCase("agustos")) {
            System.out.println("8. ay");

        }else if (monthName.equalsIgnoreCase("eylül")) {
            System.out.println("9. ay");

        }else if (monthName.equalsIgnoreCase("ekim")) {
            System.out.println("10. ay");

        }else if (monthName.equalsIgnoreCase("kasım")) {
            System.out.println("11. ay");

        }else if (monthName.equalsIgnoreCase("aralık")) {
            System.out.println("12. ay");

        }else{
            System.out.println("lütfen ay ismi girdiğinizden emin olun");
        }
    }
}
