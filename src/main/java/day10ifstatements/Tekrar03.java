package day10ifstatements;

import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {
                   /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz         */

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen yaşını gir :");
        int age=input.nextInt();
        if (age<0){
            System.out.println("hatalı giriş");
        } else if (age<5) {
            System.out.println("bebek");

        }else if (age<13) {
            System.out.println("cocuk");

        }else if (age<22) {
            System.out.println("genç");

        }else if (age<31) {
            System.out.println("yetişkin");

        }else {
            System.out.println("adamın hası");
        }
    }
}
