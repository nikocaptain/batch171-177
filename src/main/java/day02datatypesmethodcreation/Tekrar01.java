package day02datatypesmethodcreation;

public class Tekrar01 {
    public static void main(String[] args) {
        toplamaYap(12, 25);
        saat(20,15);

    }

    private static void saat(int sayi,int sayi1) {
        System.out.println(sayi1+sayi);
    }

    //ornek 1 toplama islemi yapan bir method olusturunuz ve kullanınız.
    public static void toplamaYap(int a,int b){

        System.out.println(a+b);
    }
}
