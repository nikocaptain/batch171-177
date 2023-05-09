package day04_scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //ornek kullanıcıdan adresini alınız ve ekrana yazdırınız.
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen adresinizi giriniz");
        String adress=input.nextLine();
        System.out.println(adress);

        //nextline() methodu'u kullanıcıdan cok kelimeli string almak icin kullanılır.

    }
}
