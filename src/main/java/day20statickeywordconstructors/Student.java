package day20statickeywordconstructors;

public class Student {
    /*
    1) Static variable veya static methodlar:(class member) tüm object'ler için ortak elemandir.
    2) Static class member lar üzerinde yapilan tüm değişiklikler tüm object leri etkiler.
    3) Static class member lar class'a,non-static class member lar object lere monte edilir.
    Mesala ; bir class'dan 100 tane object olusturdugunuzda, non-statik olanlar 100 kere oluşturulur,
    ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur.
    4)Static class member lara ulasmak icin object olusturmaya gerek duyulmaz.
    ama non-static class member lara ulasmak icin object olusturmak sarttir.
    5)static variable larin diger adi "Class variable" dir.
      Non-static  variable larin diger adi "Instance Variable" veya "Object Variable" dir.
     */

    public static String stdName="Tom Hanks";
    public int age=13;

    public static void staticMethod(){
        System.out.println("ben static methodum");
    }
    public void nonStaticMethod(){
        System.out.println("Ben Static olmayan methodum");
    }
}
