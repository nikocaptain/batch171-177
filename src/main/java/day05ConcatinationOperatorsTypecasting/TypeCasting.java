package day05ConcatinationOperatorsTypecasting;

public class TypeCasting {
    /*
    Numeric primitive data type larının birbirine dönüştürülmesine "type casting" denir.
     */
    //NOTE 1: kucuk data type lar buyuk data type larına cevırmeyi java otomatik olarak yapar.
    //bu isleme "Autowidening"(otomatik genişletme) denir.
    //NOTE 2: büyük data type larını kucuk data type larına cevırmek rısklı bır ıstır,java bu riskli işlemi otomatik yapmaz
    // bu işlemi kod yazanlardan bekler
    //bu işleme "ExplicitNarrowing" (acıktan daraltma) denir

    //küçükten büyüğe  "Autowidening"
    //büyükten küçüğe  "ExplicitNarrowing"
    public static void main(String[] args) {
        //byte data type nın int data type ına ceviriniz.

        byte age=13;
        int age1=age;//autowidening
        //int data type ının short data type ına ceviriniz

        int weight=312;
        short weight1=(short)weight;//explicitnarrowing

        //int data TYPE INI FLOAT DATA TYPE INA cwviriniz

        int sayi=25;
        System.out.println(sayi);
        float sayi1=sayi;
        System.out.println(sayi1);
        //double data type short data type ceviriniz
        double num=28.88;
        System.out.println(num);
        short num1=(short)num;
        System.out.println(num1);

        short num2=260;
        System.out.println(num2);

        byte numbyte= (byte)num2;
        System.out.println(numbyte);
        //Donusum yaptigimiz sayi(260) donuseceginiz data type inin sinirlari disinda ise
        // java kullandiginiz sayi ile mod islemi yapar ve mod isleminin
        //sonucu sizin yeni degeriniz olur


    }

}
