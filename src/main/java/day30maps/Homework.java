package day30maps;

import java.util.Arrays;
import java.util.HashMap;

public class Homework {
    public static void main(String[] args) {
        //HomeWork
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String s = "Hello Henry!";
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);//Hello Henry
        s = s.replaceAll(" ", "");
        System.out.println(s);//HelloHenry

        String[] ch = s.split("");
        System.out.println(Arrays.toString(ch));//[H, e, l, l, o, H, e, n, r, y]

        HashMap<String, Integer> charr = new HashMap<>();

        for (String w : ch) {
            Integer num = charr.get(w);
            if (num == null) {
                charr.put(w, 1);
            } else {
                charr.put(w, num + 1);
            }
        }
        System.out.println(charr);//{r=1, e=2, H=2, y=1, l=2, n=1, o=1}

    }
}
