package day15loops;

import java.util.Scanner;

public class TekrarWhileLoop02 {
    public static void main(String[] args) {
        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir");
        int num= scan.nextInt();
        int a=1;
        while (a<11){
            System.out.println(num+"x"+a+"="+(num*a));
            a++;
        }
        //example 2: verilen bir String de her harfin sonrasına "*" sembolünü ekleyiniz.
        //Java==>>J*a*v*a*
        System.out.println("kelime gir");
        String word= scan.next();
        int b=0;
        String str="";
        while (b<word.length()){
         str=str+   word.charAt(b)+"*";

         b++;
        }
        System.out.println(str);
        //ornek 3:Bir stringdeki tekrarsiz karakterleri konsola yazdırınız.
        //kertenkelle==>rtn
        System.out.println("kelime gir");
        String word1=scan.next();
        String s="";
        int c=0;
        String sonuc="";
        while (c<word1.length()){
            char ch=word1.charAt(c);
            if (word1.indexOf(ch)==word1.lastIndexOf(ch)){
                sonuc=sonuc+ch;



            }

            c++;
        }System.out.print(sonuc);



    }
}
