package day04_scannerwrapper;

import java.util.Scanner;

public class Homework3BasamakliToplam {
    //homework 2
    //kullanıcıdan aldıgınız 3 basamaklı bir sayının rakamları toplamını bulunuz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir pozitif tamsayı giriniz:");
        int sayi= input.nextInt();
        //birlerbasamagi için % yaparız
        int birlerbasamagi=sayi%10;
        //sayiyi küçültmek için /10 yaparız tamsayı oldugu için java özelligi geregi
        // "." dan sonrasını atar
        sayi=sayi/10;
        //onlar basamagı icin %10 yaparız
        int onlarbasamagi=sayi%10;
        //sayiyi küçültmek için /10 yaparız tamsayı oldugu için java özelligi geregi
        // "." dan sonrasını atar
        sayi=sayi/10;
        //yüzler basamagı icin %10 yaparız
        int yuzlerbasamagi=sayi%10;
        System.out.println("üç basamaklı sayının rakamları toplamı : "+(birlerbasamagi+onlarbasamagi+yuzlerbasamagi));




    }
}
