package day04_scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Ornek: kullanıcıdan iki sayı alıp dört işlem yapan ve işlemlerini sonuçlarını ekrana yazdıran kodu yazdırın
        Scanner input = new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        //kullanıcıdan arka arkaya data almamız gerektiğinde input.next satırı arka arka ya
        // farklı isime atama yapılarak alınır.
        double firstnumber=input.nextDouble();
        double secondnumber=input.nextDouble();

        System.out.println(firstnumber+secondnumber);
        System.out.println(firstnumber-secondnumber);
        System.out.println(firstnumber*secondnumber);
        System.out.println(firstnumber/secondnumber);

        System.out.println("toplama: "+(firstnumber+secondnumber)+" çıkarma: "+(firstnumber-secondnumber)+" çarpma "+(firstnumber*secondnumber)+" bölme "+(firstnumber/secondnumber));


    }
}
