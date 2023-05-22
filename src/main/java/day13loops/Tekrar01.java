package day13loops;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {
        //ornek 1 ile 158 arasındaki 7 ye bölünen sayıları bulunuz
        for (int i=1;i<159;i++){
            if (i%7==0) {


                System.out.print(i+" ");
            }
        }
        System.out.println("");
        //kullanıcıdan aldığın iki sayı arasında 9 ile bölünebilen sayıları bul..
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen iki adet sayı giriniz :");
        int a= input.nextInt();
        int b= input.nextInt();
        for (int i=a;i<b+1;i++){
            if (i%9==0){
                System.out.print(i+" ");

            }

        }
    }
}
