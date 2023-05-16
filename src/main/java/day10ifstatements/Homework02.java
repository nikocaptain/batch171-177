package day10ifstatements;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        //2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
        //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....

       // 3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
        //  1==> January, 2 ==> February .....

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz :");
        String dayName=input.nextLine();
        if (dayName.equalsIgnoreCase("pazar")){
            System.out.println("1. gün");

        } else if (dayName.equalsIgnoreCase("pazartesi")) {
            System.out.println("2. gün");

        }else if (dayName.equalsIgnoreCase("salı")) {
            System.out.println("3. gün");

        }else if (dayName.equalsIgnoreCase("çarşamba")) {
            System.out.println("4. gün");

        }else if (dayName.equalsIgnoreCase("perşembe")) {
            System.out.println("5. gün");

        }else if (dayName.equalsIgnoreCase("cuma")) {
            System.out.println("6. gün");

        }else if (dayName.equalsIgnoreCase("cumartesi")) {
            System.out.println("7. gün");

        }else {
            System.out.println("lütfen gün ismi girdiğinizden emin olun");
        }
    }
}
