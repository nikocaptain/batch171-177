package day05ConcatinationOperatorsTypecasting;

public class AsciiValues {
    public static void main(String[] args) {
        /*
        java da her karakterin sayisal bir degeri vardir.
        bu degerler ASCII degerler olarak adlandırılır.
        bu degerlerin tamamının bulundugu tabloya ASCII tablo denır.
         */
        char a='a';
        System.out.println(a);//a
        int x='a';
        System.out.println("a nin ascii degeri = " + x);//97

        //herhangi bir karakterin ASCII degerini bulmak icin o karakteri int data type ında bir variable içine koyunuz.

        int k='!';
        System.out.println(k);//33
        byte n='&';
        System.out.println(n);//38
        System.out.println(k+n);//71

        char c1='K';
        char c2='?';
        System.out.println(c1+c2);//138

        //Java da char lari matematiksel işlemlerde kullanırsanız, java char larin ASCII degerlerini kullanır.
    }

}
