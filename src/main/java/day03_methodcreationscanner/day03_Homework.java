package day03_methodcreationscanner;

public class day03_Homework {
   // 1:cemberin cevresini hesaplayan methodu olusturunuz ve kullanınız
    // 2: darinein alanını hesaplayan methodu olusturunuz ve kullanınız

    public static void main(String[] args) {
        int cemberinCevresi= cembercevre(5);
        System.out.println("cemberinCevresi = " + cemberinCevresi);

        int daireninAlani=daireninalani(6);
        System.out.println("daireninAlani = " + daireninAlani);

    }

    private static int cembercevre(int a) {

        return 2*3*a;
    }

    public static int daireninalani(int a){
        return 3*a*a;
    }
}
