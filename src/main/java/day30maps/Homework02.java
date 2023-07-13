package day30maps;

import java.util.Arrays;
import java.util.HashMap;

public class Homework02 {
    public static void main(String[] args) {
        //HomeWork
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String str="Hello Henry!";
       str= str.replaceAll("[^a-zA-Z]","");
        System.out.println(str);
       String s[]= str.split("");
        System.out.println(Arrays.toString(s));//[H, e, l, l, o, H, e, n, r, y]

        HashMap<String,Integer> tekrarsiz=new HashMap<>();

        for (String w:s) {
         Integer num  = tekrarsiz.get(w);
         if (num==null) {
             tekrarsiz.put(w, 1);
         }else{
             tekrarsiz.put(w,num+1);
         }
        }
        System.out.println(tekrarsiz);
    }
}
