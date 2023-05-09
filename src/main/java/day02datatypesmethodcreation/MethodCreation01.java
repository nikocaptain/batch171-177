package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    java da method nasıl olusturulur?
    1)main methodun disinda class in icinde olur.
                1           2           3        4       5
    2) Access modifier+ return type+method ismi +()  +  {}
     */
    /*
    olusturulan methodlar nasil kullanilir.
    1)methodu olusturmak methodu calistirmak icin yeterli degildir. kullanilmak istenen method
    main method un icinde kullanilir.
    2) method'un ismini + () yazin
    varsa işlem yapacağınız dataları parantezin icine koyun
    bu islem method call(method cagirma) olarak adlandırılır.
    3) methodun ismi+ parametreler ===>method signature

     */
    public static void main(String[] args) {

        int sonuc=  toplamaYap(22,18);
        System.out.println(sonuc);
        long multiply = multiply(8,9);
        System.out.println(multiply);

        System.out.println(karma(5, 5, 5));

    }
    //ornek 1 toplama islemi yapan bir method olusturunuz ve kullanınız.
    public static int toplamaYap(int a,int b){//bu kisimda method kapsamında kullanilmasini ve islenmesini istedigimiz dataları deklare ediyoruz.
      return a+b;
      //return demek bu methodun cagırıldıgı yere bu degeri return(geri döndür) et demek
        //main method static oldugu icin main method icinde kullanacagımız method statıc olmalıdır.
    }
    //ornek 2 sayıyı carpma işlemi yapan bir method olusturun ve kullanın
    protected static long multiply(int a,int b){
        return a*b;
    }

    //ornek 3: verilen 3 sayıdan ilk ikisini carpan ve ucuncu sayı ıle sonucu toplayan methodu olusturun ve kullanın

    private static int karma(int a,int b,int c){

        return a*b+c;

    }

}
        // odev 1 dikdörtgenin alanını hesaplayan methodu olusturun ve kullanın
        // odev 2 dikdörtgenin çevresini hesaplayan methodu olusturun ve kullanın
