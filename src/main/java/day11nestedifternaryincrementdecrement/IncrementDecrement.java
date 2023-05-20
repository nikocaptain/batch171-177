package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        //Increment1 :arttırmak

        int a=5;
        System.out.println(a);//5
        a=a+2;
        System.out.println(a);//7
        a+=2;
        System.out.println(a);//9
        //bir tane Integer deger oluşturun ve onu iki şekilde 5 arttırın

        int b=10;
        System.out.println(b);//10
        b=b+5;
        System.out.println(b);//15
        b+=5;
        System.out.println(b);//20

        //Decrement1: azaltma

        int c=8;
        System.out.println(c);//8
        c=c-3;
        System.out.println(c);//5
        c-=3;
        System.out.println(c);//2

        //Increment 2:
        int d=6;
        System.out.println(d);//6
        d=d*2;
        System.out.println(d);//12
        d*=2;
        System.out.println(d);//24

        //Decrement 2:
        int e=24;
        System.out.println(e);//24
        e=e/2;
        System.out.println(e);//12
        e/=2;
        System.out.println(e);//6


        //"1" ile increment

        int f=12;
        f=+1;
        f+=1;
        f++;

        //i"1" ile decrement
        int h=10;
        h=-1;
        h-=1;
        h--;

        //"post-increment" ve "pre-increment"

        int i=10;
        int k=i++;

        int m=15;
        int n=++m;
        System.out.println(m);//16
        System.out.println(n);//16

        int p=17;
        int r=p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s=20;
        int t=--s;
        System.out.println(s);//19
        System.out.println(t);//19

        /*
        1) Increment artirmak demektir, Decrement azaltmak demektir
        2) Increment toplama ve carpma ile , Decrment cikarma ve bolme ile yapilabilir
        3) Increment
            a)i=i+5;
            b)i+=5;
            c)Eger 1 ile artirma sozkonusu ise ozaman i++; tavsiye edilir

            Decrement
            a)i=i-5;
            b)i-=5;
            c)Eger 1 ile azaltma sozkonusu ise ozaman i--; tavsiye edilir
         */



    }
}
