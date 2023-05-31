package day17arrays;

import java.util.Arrays;

public class Tekrar03 {
    public static void main(String[] args) {
         /*
        1)binarySearch() methodunu sort() kullanmadan kullanmayiniz, cunku binarySearch() mantigi sirali elemanlar icin gecerlidir
        2)binarySearch() methodu var olan elemanlar icin size o elemanin index ini verir
        3)binarySearch() methodundan aldiginiz index 0 veya 0 dan buyukse bu o eleman arrayde var demektir
        4)binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir.
        "-" isaretinin anlami o eleman yok demektir.
        "sayi" ise o eleman olsaydi kacinci eleman olurdu demektir
         */
        //specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz

        String arr[]={"K","C","R","A","S"};
        String eleman="Z";

        //1. yol

        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(eleman)) {
                counter++;
            }
        }
            if (counter>0){
                System.out.println("Array "+eleman+" kelimesini içerir");
            }else {
                System.out.println("Array "+eleman+" kelimesini içermiyor");
            }

            //2. yol
        System.out.println("-----------2. yol------------");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int result=Arrays.binarySearch(arr,eleman);
        if (result<0){
            System.out.println("Array "+eleman+" kelimesini içermiyor");
        }else {
            System.out.println("Array "+eleman+" kelimesini içerir");
        }

       int num= Arrays.binarySearch(arr,"F");
        System.out.println(num);




    }
}
