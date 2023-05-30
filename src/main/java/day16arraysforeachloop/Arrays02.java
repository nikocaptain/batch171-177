package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //example 1:String Array oluşturun içine 5 tane eleman ekleyin ilk eleman ile son elemanın içerdiği karakter sayiları
        //toplamını ekrana yazdırın

        String arr[]=new String[5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";
        System.out.println(Arrays.toString(arr));//[Math, Science, Music, English, Art]

        System.out.println(arr[0].length()+ arr[arr.length - 1].length() );

        //ornek 2: String bir Array oluşturun içine 5 tane eleman ekleyin tüm elemanların içerdiği karakter sayıları toplamını ekrana yazdırın

        String brr[]=new String[5];
        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Ankara";
        brr[3]="Oslo";
        brr[4]="Erzurum";

        int totalChar=0;

        //1. yol for LOOP

        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar);

        //2. yol for each loop (enhanced loop)
        //baslangic degeri, loopun calisma sarti ve increment/decrement kismini kendisi halleder.
        // for-each-loop "Array" lerde ve "collection" larda kullanilir
        /*
        kalibini olusturalim
        for(DataType  w: arr/collection ){
            calisacak kodlar
        }
        */
        //Java collection ve Arraylere ozel for each loop olusturmus.Hata payi cok az
        // ..Egerki Array ve collection ile calisyorsak ilk tercih For each Loop olmalidir.


        int sum=0;
        for (String w:brr){
           sum= sum+w.length();

        }
        System.out.println("2. yol:  "+sum);

        //ornek 3: notlar adında int bir array oluşturunuz içine 6 tane not yerleştiriniz ve not ortalamasını ekrana yazdırın.

        int notlar[]=new int[6];
        notlar[0]=50;
        notlar[1]=70;
        notlar[2]=60;
        notlar[3]=40;
        notlar[4]=90;
        notlar[5]=80;

        System.out.println(Arrays.toString(notlar));//[50, 70, 60, 40, 90, 80]

        int toplam=0;
        for (int w:notlar){
            toplam=toplam+w;

        }
        toplam=toplam/notlar.length;
        System.out.println(toplam);
    }

}
