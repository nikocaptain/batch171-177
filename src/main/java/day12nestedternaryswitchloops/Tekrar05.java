package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Tekrar05 {
    public static void main(String[] args) {
        /*
        SwitchSoru6: Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz
           ornek
          Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java kolaydir
              B'yi secmis ise, ==> Java eglencelidir
              C'yi secmis ise, ==> ders calismam lazim :)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen A,B,C harfinden birisini giriniz...");
        char ch=scan.next().toUpperCase().charAt(0);
        switch (ch){
            case 'A':
                System.out.println("Java kolaydir");
                break;
            case 'B':
                System.out.println("Java eglencelidir");
                break;
            case 'C':
                System.out.println("ders calismam lazim :)");
                break;
            default :
                System.out.println("hayat kadar aci okyanus kadar derin...Hatali giris...");
        }
    }
}
