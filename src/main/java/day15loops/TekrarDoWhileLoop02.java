package day15loops;

import java.util.Scanner;

public class TekrarDoWhileLoop02 {
    public static void main(String[] args) {
        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */
        Scanner scan = new Scanner(System.in);

        int a = 0;
        int sayi;
        do {
            System.out.println("sayi gir:");
            sayi = scan.nextInt();
            if (sayi < 100) {
                System.out.println("kaybettin");
                break;
            } else {
                System.out.println("kazanmaya devam");
            }
            a++;
        } while (true);
    }
}
