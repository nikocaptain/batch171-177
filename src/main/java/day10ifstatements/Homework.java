package day10ifstatements;

import java.util.Scanner;

public class Homework {
    /*Homework
    1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
            //ve kullaniciya uygun mesaj veren kodu yaziniz

*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String str=input.nextLine();
        String str1="pwd123!";

        if (str.equals(str1)){
            System.out.println("şifreniz doğru hesabınızda 5 milyon dolar var");

        }else {
            System.out.println("Lütfen tekrar deneyiniz");

        }

    }
}
