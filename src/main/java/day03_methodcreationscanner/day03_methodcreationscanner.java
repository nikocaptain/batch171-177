package day03_methodcreationscanner;

public class day03_methodcreationscanner {
    public static void main(String[] args) {

        double kup = getCube(5);
        System.out.println("kup = " + kup);

        double kup1 = getCube(22.8);
        System.out.println("kup1 = " + kup1);

        print("java is easy");

        //method olusturmak icin ikinci yol
        //ornek 2: girilen bir kelimeyi ekrana yazdıran bir method olusturup kullanınız
        //main method icinde iken method ta kullanılacak olan variable lari olusturunuz

        String str = "TechproEdu";
        //method ismi ve parametreleri yazınız
        //kirmizi kismin uzerinde bekleyip create methoda tiklariz intellij otomatik olarak bir method olusturur
        //daha sonrakendi istegimize gore dizayn eder.
        printConsole(str);
        String str1 = "hayat güxeldir";


        //ornek 3: verilen iki tam sayiyi carpan ve sonucu ekrana yazdıran method olusturp kullanınız.

        int a = 5;
        int b = 6;
        carpmaYap(a, b);

        //ornek 4: verilen bir tamsayinin karesini alan ve ekrana yazdıran method olusturunuz.

        int c = 8;
        kareal(c);


    }



    private static void kareal(int c) {
        System.out.println(c*c);
    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    public static void printConsole(String str) {
        System.out.println(str);
    }

    //ornek 1: verilen bir ondalık sayının kupunu hesaplayan bir method olusturun

     static double getCube(double sayi){
        return sayi*sayi*sayi;
     }

    //ornek 2: girilen bir kelimeyi ekrana yazdıran bir method olusturup kullanınız

    public static void print(String str){
        System.out.println(str);
        //eger bir method yeni bir data üretmiyorsa return type void olur
        //methodun return type i void ise body icinde return keyword u yazilmaz.

    }
}
    //note:access modifier i default yapmak isterseniz access modifier YAZMAYINIZ..

// home work
// 1:cemberin cevresini hesaplayan methodu olusturunuz ve kullanınız
// 2: darinein alanını hesaplayan methodu olusturunuz ve kullanınız