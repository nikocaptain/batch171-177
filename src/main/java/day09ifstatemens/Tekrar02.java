package day09ifstatemens;

import java.util.Scanner;

public class Tekrar02 {
    public static void main(String[] args) {
        //ornek 1: kullanıcıdan alınan bir sayinin tek mi çift mi olduğunu konsala yazdırın

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int num=input.nextInt();
        if (num%2==0){
            System.out.println(num+" :çift tam sayi");
        }
        else {
            System.out.println(num+" : tek tamsayi");
        }

    }
}
