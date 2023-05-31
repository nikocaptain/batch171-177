package day17arrays;

import java.util.Arrays;

public class Tekrar04 {
    public static void main(String[] args) {
        //Ornek 1 :Size verilen bir cümlede kaç kalime oldugunu gosteren kodu yaziniz.
        String s="Java is easy. Learn Java earn money.";

        String word[]=s.split(" ");
        System.out.println("Arrays.toString(word) = " + Arrays.toString(word));

        String word1[]=s.split("a");
        System.out.println("Arrays.toString(word1) = " + Arrays.toString(word1));
        System.out.println("word1.length = " + word1.length);

        String word2[]=s.split("Java");
        System.out.println("Arrays.toString(word2) = " + Arrays.toString(word2));
        System.out.println("word2.length = " + word2.length);
        //Ornek 2: Size verilen bir cümlede kac harf oldugunu gosteren kodu yaziniz...
        String elements[]=s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println("Arrays.toString(elements) = " + Arrays.toString(elements));
        System.out.println("elements.length = " + elements.length);


    }
}
