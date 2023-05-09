package day02datatypesmethodcreation;

public class Day02Homework {

    //odev 1 dikdörtgenin alanını hesaplayan methodu olusturun ve kullanın

    public static long dikAlan(long a,long b){
        return a*b;


    }
    // odev 2 dikdörtgenin çevresini hesaplayan methodu olusturun ve kullanın
    private static int dikCevre(int a,int b){
        return (a+b)*2;

    }

    public static void main(String[] args) {
        System.out.println(dikAlan(5, 9));

        System.out.println(dikCevre(8, 12));
    }
}
