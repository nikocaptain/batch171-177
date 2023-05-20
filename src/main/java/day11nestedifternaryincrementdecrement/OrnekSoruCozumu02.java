package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class OrnekSoruCozumu02 {
    public static void main(String[] args) {
         /*
Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola
" 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
 */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz...");
        String word=input.nextLine();
        if (word.length()<3){
            System.out.println("Lütfen 3 karakterden uzun kelime giriniz...");

        }else {
            System.out.println(word.substring(word.length()-3)+word+word.substring(word.length()-3));

        }
    }
}
