package day10ifstatements;

import java.util.Scanner;

public class Tekrar04 {
    public static void main(String[] args) {
        /*
      Example 1: Kullanicidan 3 tane sayi aliniz.
                 Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                 Eger ucgen ise "eskenar" Ucgen olma durumunu kontrol ediniz.
                 INFO :
                 Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                   herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b|
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen     */
        Scanner input=new Scanner(System.in);
        System.out.println("1. sayiyi girin :");
        int num1= input.nextInt();
        System.out.println("2. sayiyi giriniz :");
        int num2= input.nextInt();
        System.out.println("3. sayiyi giriniz :");
        int num3= input.nextInt();

        num1=Math.abs(num1);
        num2=Math.abs(num2);
        num3=Math.abs(num3);

        boolean ucgenMi=num1+num2>num3  &&  num3>Math.abs(num1-num2)  &&  num1+num3>num2  &&  num2>Math.abs(num1-num2) &&  num2+num3>num1  && num1>Math.abs(num2-num3);

        if (ucgenMi){
            if (num1==num2&&num2==num3){
                System.out.println("Eşkenar üçgen");

            }else{
                System.out.println("Üçgen ama eşkenar değil");
            }

        }else{
            System.out.println("Üçgen değil");
        }
    }
}
