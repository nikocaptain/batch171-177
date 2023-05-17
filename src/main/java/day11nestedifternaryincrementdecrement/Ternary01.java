package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //ternary Statement :
        //ornek 1: sayi 10 dan küçük ise konsola "küçük " yzdırın değilse " kucuk degil" yazdırın
        //-----------if else çözümü------------------

        int num =2;
        if(num<10){
            System.out.println("kucuk");
        }else{
            System.out.println("kucuk degil");
        }

        //--------------Ternary Çözümü------------------
        //Condition ? Condition true ise çalışacak kısım yazılır : Condition false ise calışacak kısım yazılır;
        int num1=15;
        String sonuc=num1<10 ? "kucuk" : "kucuk degil";
        System.out.println(sonuc);

        //ornek 2: sayi çift ise konsola "çift" tek ise "tek " yazdırın
        //-----------if else çözümü-----------
        int num2=15;
        if(num2%2==0){
            System.out.println("çift");
        }else{
            System.out.println("tek");
        }
        //----------Ternary çözümü-----------

       String str= num2%2==0 ? "çift" : "tek" ;
        System.out.println(str);

        //ornek 3: sayi 0 dan büyükse "pozitif" değilse  "pozitif değil" yazdırın

        int sayi=12;
        String result= sayi>0 ? "pozitif"  : "Pozitif değil";
        System.out.println(result);

        //ornek 4: kullanıcıdan 2 sayı alınız ve buyuk olmayan (kucuk veya eşit) sayıyı yazdırınız

        Scanner input=new Scanner(System.in);
        System.out.println("iki sayi giriniz...");
        double first= input.nextDouble();
        double second= input.nextDouble();

        //1.  yol if else çözümü
        if (first<second){
            System.out.println(first);

        }else {
            System.out.println(second);

        }

        double third =first<second ? first  :  second;
        System.out.println(third);
    }
}
