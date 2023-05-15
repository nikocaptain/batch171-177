package day09ifstatemens;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //ornek : verilen karakter büyük harf ise ekrana "büyük harf" yazdiran
        // kuçuk harf ise "kucuk harf" yazdiran kodu oluşturun

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz..");
        char ch =input.next().charAt(0);

        //1. yol

        if (ch>='A'&&ch<='Z'){
            System.out.println(ch+"  Buyuk Harf..");
        }
        if(ch>='a'&&ch<='z'){
            System.out.println(ch+"  Kucuk Harf");
        }
        if (ch>='A'&&ch<='Z') {
            System.out.println(ch+"  Buyuk Harf..");
        }else if(ch>='a'&&ch<='z'){
            System.out.println(ch+"  Kucuk Harf");

        }
        else{
            System.out.println("Harf Degil");
        }

        //2. yol
        if (ch>='A'&&ch<='Z'){//her zaman boolean return eder.if else de ilk satır true oldu mu diğerlerine bakmaz
            System.out.println(ch+"  Buyuk Harf..");
        }
        if(ch>='a'&&ch<='z'){
            System.out.println(ch+"  Kucuk Harf");
        }
        if (ch>='A'&&ch<='Z') {
            System.out.println(ch+"  Buyuk Harf..");
        }else if(ch>='a'&&ch<='z'){
            System.out.println(ch+"  Kucuk Harf");

        }
        else{//iş bana kalırsa ben her zaman çalışırım der
            System.out.println("Harf Degil");
        }
    }
}
