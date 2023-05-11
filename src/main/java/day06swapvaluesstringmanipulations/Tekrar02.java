package day06swapvaluesstringmanipulations;

public class Tekrar02 {
    public static void main(String[] args) {
        int a=12;
        int b=5;//Swap den sonra ==>a=5, ve b=12
        System.out.println("a= " +a);
        System.out.println("b = " + b);

        int box=0;
        box=a;//box=12
        a=b;//a=5
        b=box;//b=12
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        String x="elma";
        String y="armut";
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        String z="";
        z=x;//z=elma
        x=y;//x=armut
        y=z;//y=elma
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
