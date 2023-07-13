package day31mapsexception;

public class E01 {
    /*
    Exception beklenmedik durum demektir. java cozemedigi bir sorunla karşılaştıgında exeption class i devreye girer.
    Exception classı bize karşılaşılan sorunun cinsini,bu sorunun nereden kaynaklandıgını ve sebebini verir.

    Java Exception fırlattıgında java calısmayı durdurur(stops execution)
    Java Exception olusturan kod icin bizden karar vermemizi ister

    Eger hiçbirşey yamazsak beklendigi gibi java kodumuzun calısmasını durdurur.
        -Kodumuzun calısmaya devam etmesini istiyorsak try catch ile exception olussturması
        muhtemel kodlarımızı try catch blogu icinde yazmalıyız.
        -Exception halledebilmek (Handel ) için iki temel yol vardır.
            1) Exception a uygun cozumler uretebilirsiniz. buna Exception Handling denir
            2) Exception olustugunda bunu ilan eder ve geri cekilebilirsiniz. buna da throw exception denir.

        -Exception uygun cozumler uretmede try-catch kullanılır.
        try blokta yapılması gerekli işlemler java dan istenir
        Java işlemi problemsiz bir şekilde yaparsa catch blok java tarafından okunmaz
        try block da islem yapilirken Exception olusursa catch block devreye girer ve catch block icindeki kodlar calisir.
        try block da islem yapılırken Exception olusursa try block icindeki exceptiondan sonraki kodlar calistrilmaz.

        catch parantez icine karsilasilmasi muhtemel olan exception class ismini ve bir obje ismi(e), catch bloguna ise
        exception ile karsilasildiginda yapilmasi istenen kodlari yazariz.

        if else kullanirsak olusabilecek her problemi specific olarak if parantezine yazmamiz gerekir, buda neredeyse imkansizdir
        ve yazacagımız kodu cok uzatir ama try catch te java ilgili exception ile alakali olusabalieceek tum problemleri yakalar
     */
    public static void main(String[] args) {
        int a=12;
        int b=0;
        divide(a,b);
        divide2(a,b);
    }
    //Kesinlikle tavsiye edilmez

    public static void divide(int a,int b){
        if (b==0){
            System.out.println("Do not divide by zero");
        }else {
            System.out.println(a/b);
        }

    }

    //ArithmeticException yazdıgınız code da matematiksel islem kullanıyorsanız alınabilecek bir exceptin dir.
    public static void divide2(int a,int b){
       try {
           System.out.println(a/b);
       } catch (ArithmeticException e) {
           System.out.println("Do not divide by zeroo");
       }

    }

}



