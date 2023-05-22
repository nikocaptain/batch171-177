package day13loops;

import java.util.Scanner;

public class Tekrar03Ternary {
    public static void main(String[] args) {
        //ornek girilen sayı 3 e bölünürse aferin değilse takrar deneyiniz
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi= scan.nextInt();
        String result=sayi%3==0 ? "Aferin" : "Tekrar dene";
        System.out.println("result = " + result);
    }
}
