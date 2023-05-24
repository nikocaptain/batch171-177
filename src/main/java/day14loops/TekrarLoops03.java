package day14loops;

import java.util.Scanner;

public class TekrarLoops03 {
    public static void main(String[] args) {
        //ornek 2: his sayi kullanmadan 1 den 80 e kadar olan sayiları konsala yazdırınız
        //char ch =80;
        //System.out.println(ch);
        for (int i='P'/'P';i<='P';i++){
            System.out.print(i+" ");
        }
        System.out.println("");
        /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
         9 - 14 ==> 10  12  14     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Baslangic degeri gir:");
        int start= scan.nextInt();
        System.out.println("Bitiş degeri gir:");
        int finish= scan.nextInt();
        if(start>finish){
            System.out.println("baslangic degeri bitiş degerinden buyuk olamaz tekrar gir");
        }else {


            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
