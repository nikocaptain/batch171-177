package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Array leri kisa yoldan nasil olusturabiliriz?

        int arr[]={63,7,312,8,4};
        System.out.println(Arrays.toString(arr));
        System.out.println("arr.length = " + arr.length);

        //ornek 1: verilen array de kaç tane çift sayi kaç tane tek sayi oldugunu bulan kodu yaziniz...

        int sayac=0;

        for (int w:arr){
            if(w%2==0){
                sayac++;
            }
        }
        System.out.println("Array'de "+sayac+" adet cift sayi "+(arr.length-sayac)+ " tek sayi vardır");

        //ornek 2:size verilen bir string array deki isimlerden 5 character den az character icerenleri console a yazdırınız.

        String stdNames[]=new String[5];
        stdNames[0]="Ajda";
        stdNames[1]="Ayhan";
        stdNames[2]="Tom";
        stdNames[3]="Cuneyt";
        stdNames[4]="Filiz";

        for (String w:stdNames){
            if (w.length()<5){

                System.out.println(w);
            }


        }

        //ornek 3: size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        //"F" ile baslayan isimler haric diger isimleri console a yazdırınız
        //note 1: sort() methodu sayisal data type larını kucukten buyuge siralar (ascending order)
        //note 2: sort() methodu string data type larını alfabetik olarak sıralar(alphabetic order)
        //Note 3: ascending order  +  alphabetical order ==> Natural Order
        //Note 4: sort() methodu array elemanlarini "Natural Order" a gore siralar

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));

        for (String w:stdNames){
            if (w.startsWith("F")){
                continue;

            }
            System.out.print(w+" ");
        }


    }
}
