package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Yuvarlama {
    public static void main(String[] args) {
        /*

"yuvarlamak istediginiz sayinin miktarini giriniz"  mesaji verin
kullanicidan miktar alin.
girilen tum sayilar icin;
    Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.

    a) Son basamak 5 'e eşit ve 5 den büyükse, yuvarlama işlemi: "Son basamağı bir üst ondalı-
    ğa yuvarla"
    b) Son basamak 5 den küçükse, yuvarlama işlemi: "Son basamağı bir alt ondalığa yuvarla"
    cikti soyle olmalidir

    yuvarlamak istediginiz sayilarin miktarini giriniz
    5
    lutfen sayilari giriniz
    sayi 1 :
    13
    sayi 2 :
    16
    sayi 3 :
    18
    sayi 4 :
    11
    sayi 5 :
    12
    [13, 16, 18, 11, 12]
    Son basamağı bir alt ondalığa yuvarla ==> 10
    Son basamağı bir üst ondalığa yuvarla ==> 20
    Son basamağı bir üst ondalığa yuvarla ==> 20
    Son basamağı bir alt ondalığa yuvarla ==> 10
    Son basamağı bir alt ondalığa yuvarla ==> 10

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("gireceginiz sayi adedini giriniz...");
        int adet= scan.nextInt();
        int sayilar[]=new int[adet];

        for (int i = 0; i < adet; i++) {
            System.out.println("lütfen "+i+". sayiyi gir");
            int sayilar1= scan.nextInt();
            sayilar[i]=sayilar1;
            System.out.println(Arrays.toString(sayilar));

        }
        int sayi[]=new int[adet];
        for (int i = 0; i <adet ; i++) {
            if (sayilar[i]%10<5){
                sayi[i]=sayilar[i]/10;

            }else {
                sayi[i]=sayilar[i]/10*10+10;

            }

        }
        System.out.println(Arrays.toString(sayi));
    }
}
