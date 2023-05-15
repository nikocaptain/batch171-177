package day09ifstatemens;

import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {
        //ornek : verilen karakter büyük harf ise ekrana "büyük harf" yazdiran
        // kuçuk harf ise "kucuk harf" yazdiran kodu oluşturun

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz :");
        char ch=input.next().charAt(0);

        if (ch<='Z'&&ch>='A'){
            System.out.println(ch+" : buyuk harf");
        } else if (ch>='a'&&ch<='z') {
            System.out.println(ch+" : kucuk harf");
        }
        else {
            System.out.println("lütfen harf giriniz");
        }
    }
}
