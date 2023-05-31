package day17arrays;

import java.util.Arrays;

public class Tekrar01 {
    public static void main(String[] args) {
        //Array leri kisa yoldan nasil olusturabiliriz?

        int arr[]={14,25,27,8,175};
        System.out.println("arr.length = " + arr.length);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("arr = " + arr);

        //ornek 1: verilen array de kaç tane çift sayi kaç tane tek sayi oldugunu bulan kodu yaziniz...

        int sayac=0;
        for (int w:arr){
            if (w%2==0){
                sayac++;
            }
        }
        System.out.println("verilen Array de "+sayac+" adet cift sayi "+(arr.length-sayac)+" tek sayi vardir.");

        //ornek 2:size verilen bir string array deki isimlerden 5 character den az character icerenleri console a yazdırınız.
        String str[]={"Niyazi","inci","Tugba","Ayla","faruk"};
        String counter="";
        for (String w: str){
            if (w.length()<5){
                System.out.println(w);
            }

        }
        System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
        System.out.println("str.length = " + str.length);
        //ornek 3: size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        //"F" ile baslayan isimler haric diger isimleri console a yazdırınız
        //note 1: sort() methodu sayisal data type larını kucukten buyuge siralar (ascending order)
        //note 2: sort() methodu string data type larını alfabetik olarak sıralar(alphabetic order)
        //Note 3: ascending order  +  alphabetical order ==> Natural Order
        //Note 4: sort() methodu array elemanlarini "Natural Order" a gore siralar

        for (String w: str){
            if (w.startsWith("F")){
                continue;
            }
            System.out.println(w);
        }













    }
}
