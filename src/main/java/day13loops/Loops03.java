package day13loops;

public class Loops03 {
    public static void main(String[] args) {
        //ornek 1: verilen bir String de küçük harfleri konsola yazmayınız.
        //"Pwd12?Ab" ==>> P12?A

        String s="Pwd12?Ab";
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>='a'&&s.charAt(i)<='z'){//küçük harfleri sectim
                continue;//görmezden gel devam et demek...
            }

            System.out.print(s.charAt(i));

        }
        //"break" ile "continue" arasındaki fark nedir
        //"break" switch indisina cikmak icin ve loop u kirmak icin kullanilir.
        //"continue" ise loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.
        //"continue" keyword u gormeden devam et demektir.

    }
}
