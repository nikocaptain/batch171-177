package day04_scannerwrapper;

import java.util.Scanner;

public class tekrar {
    public static void main(String[] args) {
        //ornek 1:kullanıcıdan adını soyadını alıp ikisini ayni satirda yazdırınız.
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz :");
        String isim= input.nextLine();

        System.out.println("isim :  "+isim);

    }
}
