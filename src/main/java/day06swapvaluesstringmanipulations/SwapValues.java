package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        //Swap=yer değiştirmek 1. kap Patates 2. kap Domates ==>Swap dan sonra 1. kap Domates 2. kap Patates

        int a=12;
        int b=5;//Swap den sonra ==>a=5, ve b=12
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp=0;
        //1. adım
        temp=a;
        //2. adim
        a=b;
        //3. adim
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2. yol
        int elma=12;
        int armut=5;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);
        elma=elma+armut;//17
        armut=elma-armut;//12
        elma=elma-armut;//5
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);


    }
}
