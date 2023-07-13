package day30maps;

import day33exceptionsenumsiterator.InvalidNumberException;

import java.util.Arrays;
import java.util.HashMap;

public class TekrarrHashMap03 {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        String str="I like you, like like!";
        str=str.replaceAll("\\p{Punct}","");
        System.out.println(str);
       String arr[]= str.split(" ");
        System.out.println(Arrays.toString(arr));
        HashMap<String,Integer> sayac=new HashMap<>();
        int counter=1;
        for (int i = 0; i < arr.length; i++) {
            Integer num=sayac.get(arr[i]);
            if (num==null){
                sayac.put(arr[i],1);

            }else {
                sayac.put(arr[i],num+1);
            }
        }
        System.out.println(sayac);//{like=3, I=1, you=1}

        System.out.println("*******************");
        System.out.println("*******************");
        System.out.println("*******************");


        //HomeWork
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String s="Hello Henry!";
       String[] a= s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(a));

        HashMap<String,Integer> karakterMap=new HashMap<>();
        for (String w:a) {
            Integer summ=karakterMap.get(w);
            if (summ==null){
                karakterMap.put(w,1);
            }else {
                karakterMap.put(w,summ+1);
            }
        }
        System.out.println(karakterMap);//{r=1, e=2, H=2, y=1, l=2, n=1, o=1}

    }
}
