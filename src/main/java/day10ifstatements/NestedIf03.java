package day10ifstatements;

import java.util.Scanner;

public class NestedIf03 {
    /*
                   Password'un ilk harfi buyuk harf ise
                   'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                   Adana ==> Gecerli

                   Passwordun ilk harfi kucuk harf ise
                   'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                   zehirli ==> Gecerli
        */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");

        String pwd=input.nextLine();

        if (pwd.charAt(0)>='A'&&pwd.charAt(0)<='Z'){//Password'un ilk harfi buyuk harf ise
            if (pwd.charAt(0)=='A'){
                System.out.println("gecerli password");

            }else {
                System.out.println("gecersiz password cunku buyuk harf A degil");

            }

        } else if (pwd.charAt(0)>='a'&&pwd.charAt(0)<='z') {//Passwordun ilk harfi kucuk harf ise
            if (pwd.charAt(0)=='z'){
                System.out.println("gecerli password");

            }else {
                System.out.println("gecersiz password cunku kucuk harf z degil");

            }

        }else {
            System.out.println("ilk karakter harf olmalıdır");//iyiki github dersini erken almışız diyeceksiniz 16.05.2023

        }
    }
}
