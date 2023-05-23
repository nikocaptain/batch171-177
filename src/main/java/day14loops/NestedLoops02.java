package day14loops;

import java.util.Scanner;

public class NestedLoops02 {
    public static void main(String[] args) {
        /*              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */

        Scanner input=new Scanner(System.in);
        System.out.println("Satir (row) sayisini giriniz");
        int row= input.nextInt();
        System.out.println("Sutun (column) sayisini giriniz");
        int column= input.nextInt();

        for (int i = 1; i <=row ; i++) {
            System.out.println();
            for (int j = 1; j <=column ; j++) {
                System.out.print("x ");

            }


        }
    }
}
