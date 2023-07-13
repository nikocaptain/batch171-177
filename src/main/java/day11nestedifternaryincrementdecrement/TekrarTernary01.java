package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class TekrarTernary01 {
    public static void main(String[] args) {
        //ornek 2: sayi çift ise konsola "çift" tek ise "tek " yazdırın

        int num=11;
        String i= num%2==0 ? "cift" : "tek";
        System.out.println(i);


        //ornek 3: sayi 0 dan büyükse "pozitif" değilse  "pozitif değil" yazdırın

        int num1=-1;
        String str=num1>=0?"pozitif":"negatif";
        System.out.println(str);

        //ornek 4: kullanıcıdan 2 sayı alınız ve buyuk olmayan (kucuk veya eşit) sayıyı yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz :");
        int ilkSayi= scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz :");
        int ikinciSayi= scan.nextInt();

       int sonuc= ilkSayi<=ikinciSayi?ilkSayi:ikinciSayi;
        System.out.println("Kucuk sayi : "+sonuc);


    }
}
