package day19passByValuemethodoverloading;

public class TekrarPassByValue01 {
    public static void main(String[] args) {
        double ayakkabi=800;
        System.out.println("orjinal deger "+ayakkabi);
        System.out.println("yuzde 10 indirimli hali "+indirim10(ayakkabi));

        System.out.println("yuzde 20 indirimli hali "+indirim20(ayakkabi));
        System.out.println("orjinal deger "+ayakkabi);
        System.out.println("-----------------------------------");

        String str="hayat kisa";
        System.out.println("orjinal deger: "+str);
        System.out.println(karakterEkleme(str, '!'));

    }

    private static String karakterEkleme(String a,char b) {
       return a=b+a+b;
    }

    private static double indirim20(double a) {
        return a - a * 0.2;

    }

    private static double indirim10(double a) {
        return a-a*0.1;
    }


}
