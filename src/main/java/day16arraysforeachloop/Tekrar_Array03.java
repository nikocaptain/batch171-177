package day16arraysforeachloop;

import java.util.Arrays;

public class Tekrar_Array03 {
    public static void main(String[] args) {
        //example 1:String Array oluşturun içine 5 tane eleman ekleyin ilk eleman ile son elemanın içerdiği karakter sayiları
        //toplamını ekrana yazdırın

        String sehir[]=new String[5];
        sehir[0]="Istanbul";
        sehir[1]="Ankara";
        sehir[2]="Izmir";
        sehir[3]="Sivas";
        sehir[4]="Ardahan";

        //System.out.println(sehir[0].length() + sehir[sehir.length - 1].length());

        //ornek 2: String bir Array oluşturun içine 5 tane eleman ekleyin
        // tüm elemanların içerdiği karakter sayıları toplamını ekrana yazdırın

        int sayac=0;
        for (String w:sehir){

            sayac=sayac+w.length();

        }
        System.out.println(sayac);

        //ornek 3: notlar adında int bir array oluşturunuz içine 6 tane not yerleştiriniz ve not ortalamasını ekrana yazdırın.

        int notlar[]=new int[6];
        notlar[0]=50;
        notlar[1]=70;
        notlar[2]=60;
        notlar[3]=40;
        notlar[4]=90;
        notlar[5]=80;

        System.out.println(Arrays.toString(notlar));//[50, 70, 60, 40, 90, 80]

        int counter=0;
        for (int w:notlar){

            counter= counter + w;
        }
        int total=counter/ notlar.length;
        System.out.println(total);


    }
}
