package day03_methodcreationscanner;




public class Day03_Tekrar {

    // odev 2 dikdörtgenin çevresini hesaplayan methodu olusturun ve kullanın
    //method syntax: access modifier +return type +method ismi variable ile beraber +(method degerleri) + {}


    public static int dikdörtgenincevresi(int a, int b) {
        return (a + b) * 2;
    }

    //cemberin cevresini hesaplayan methodu olusturunuz ve kullanınız

    public static int cembercevresi(int a){
        return 2*3*a;
    }



    public static void main(String[] args) {
        int cevre = dikdörtgenincevresi(8, 20);
        System.out.println("Dikdortgenin cevresi = " + cevre);
        int cemberincevresi=cembercevresi(10);
        System.out.println("cemberincevresi = " + cemberincevresi);

        int toplamdaireadedi=katadedi(18,20);
        System.out.println("toplamdaireadedi = " + toplamdaireadedi);
    }
    //2 apartmandaki toplam katı veren methodu olusturun ve yazdırın
    public static int katadedi(int a,int b){
        return a+b;



    }
}