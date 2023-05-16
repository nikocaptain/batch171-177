package day10ifstatements;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        // 3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
        //  1==> January, 2 ==> February .....
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kaçıncı ay olduğunu giriniz");
        byte dayNum=input.nextByte();

        if (dayNum==1){
            System.out.println("January");

        } else if (dayNum==2) {
            System.out.println("February");
        }else if (dayNum==3) {
            System.out.println("March");
        }else if (dayNum==4) {
            System.out.println("April");
        }else if (dayNum==5) {
            System.out.println("May");
        }else if (dayNum==6) {
            System.out.println("June");
        }else if (dayNum==7) {
            System.out.println("July");
        }else if (dayNum==8) {
            System.out.println("August");
        }else if (dayNum==9) {
            System.out.println("September");
        }else if (dayNum==10) {
            System.out.println("October");
        }else if (dayNum==11) {
            System.out.println("November");
        }else if (dayNum==12) {
            System.out.println("December");
        }else {
            System.out.println("Lütfen 1-12 arasında bir tam sayı giriniz");
        }
    }
}
