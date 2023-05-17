package day10ifstatements;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen gün için bir sayi giriniz");
        byte num=input.nextByte();

        if (num==1){
            System.out.println("Pazar");

        } else if (num==2) {
            System.out.println("Pazartesi");

        }else if (num==3) {
            System.out.println("Sali");

        }else if (num==4) {
            System.out.println("Çarşamba");

        }else if (num==5) {
            System.out.println("Perşembe");

        }else if (num==6) {
            System.out.println("Cuma");

        }else if (num==7) {
            System.out.println("Cumartesi");

        }else{
            System.out.println("Lütfen 1-7 arasında bir rakam giriniz");
        }
    }
}
