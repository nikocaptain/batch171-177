package day13loops;

import java.util.Scanner;

public class Tekrar02switch {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 2 sayi gir :");
        double a= scan.nextDouble();
        double b= scan.nextDouble();
        System.out.println("lütfen işlem gir :");
        char ch=scan.next().charAt(0);
        switch (ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println((a*b)/100);
                break;
            default:
                System.out.println("doğru gir");
        }
    }
}
