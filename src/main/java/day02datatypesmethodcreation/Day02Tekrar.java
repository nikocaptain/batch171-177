package day02datatypesmethodcreation;

public class Day02Tekrar {
    //ornek 1 toplama islemi yapan bir method olusturunuz ve kullanınız.

    public static int toplamaYap(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {

        int sonuc= toplamaYap(8,78);
        System.out.println(sonuc);
        System.out.println(toplamaYap(6, 54));
        System.out.println(multiply(8, 9, 70));
        System.out.println(dikalan(8, 6));
        double csonuc =cikarma(38,29);
        System.out.println("csonuc = " + csonuc);
    }
    //ornek 3: verilen 3 sayıdan ilk ikisini carpan ve ucuncu sayı ıle sonucu toplayan methodu olusturun ve kullanın

    protected static int multiply(int a,int b,int c){
       return (a*b)+c;
    }

    //odev 1 dikdörtgenin alanını hesaplayan methodu olusturun ve kullanın

    private static int dikalan(int a,int b){
        return a * b;
    }

    //ornek 1 cikarma islemi yapan bir method olusturunuz ve kullanınız.

    public static double cikarma(double a,double b){
        return a-b;
    }

}
