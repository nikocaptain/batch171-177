package day19passByValuemethodoverloading;

public class TekrarMethodOverloading01 {

    public static void main(String[] args) {
        int x=12;
        int y=10;
        carpma(x,y);
        carpma(x,y);
        double m=12;
        double n=10;
        carpma(m,n);

    }

    private static void carpma(int a,int b) {
        System.out.println(a*b);
    }
    private static void carpma(double a,double b) {
        System.out.println(a*b);
    }
    private static void carpma(byte a,byte b) {
        System.out.println(a*b);
    }
}
