package day04_scannerwrapper;

import java.util.Scanner;

public class scanner05 {
    public static void main(String[] args) {
        //ornek: kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki rakamlarının toplamını
        //yazdıran kodu yazınız.

        Scanner input= new Scanner(System.in);
        System.out.println("lütfen 5 basamaklı pozitif bir tamsayı giriniz");
        int number=input.nextInt();
        //bir sayının son rakamını alabilmek için 10 a bölüp kalanı almalıyız.
        //% (modulus operatör):solunda bulunan sayının sağında bulunan sayıya bölümünden kalanı verir.
        //dolayısıyla %10 her zaman bize birler basamağını verir
        //bir tamsayıyı bir tamsayıya bölerseniz java sonucu daima tamsayı yapar
        //java bu durumda yuvarlama yapmaz ondalık kısmı iptal eder.
        //dolayısıyla bir tamsayıyı 10 a bölersek birler basamağını silmiş oluruz
        //sayı 38671 olarak isteyelim
        //son rakamı al
        int birlerbasamagi=number%10;//1
        //sayi kucult
        number=number/10;//3867
        //sondan ikinci rakamı al
        int sondanikinci=number%10;//7
        //sayi kucult
         number=number/10;//386
        //sondan ucuncu rakamı al
        int sondanucuncu=number%10;//6
        //sayi kucult
         number=number/10;//38
        //sondan dorduncu rakamı al
        int sondandorduncu =number%10;//8
        //sayı kucult
         number= number/10;//3
        //sondan besinci rakamı al
        int sondanbesinci=number%10;//3

        //son rakam oldugu icin kucultmeye gerek yok.
        System.out.println(sondanbesinci+sondandorduncu+sondanikinci+birlerbasamagi);

        //homework 1
        //kullanıcıdan aldiğimiz 3 tane sayının ortalamısını bulan kodu yazınız
        //orneğin =>3,5,7 (3+5+7)/3=5
        //homework 2
        //kullanıcıdan aldıgınız 3 basamklı bir sayının rakamları toplamını bulunuz.


    }
}
