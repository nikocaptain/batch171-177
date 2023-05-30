package day17arrays;

import java.util.Arrays;

public class Array04 {
    public static void main(String[] args) {
        //Ornek 1 :Size verilen bir cümlede kaç kalime oldugunu gosteren kodu yaziniz.
        String s="Java is easy. Learn Java earn money.";

        String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));//[Java, is, easy., Learn, Java, earn, money.]
        System.out.println(words.length);//7


        //Ornek 2: Size verilen bir cümlede kac harf oldugunu gosteren kodu yaziniz...

        String letters[]=s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);
    }
}
