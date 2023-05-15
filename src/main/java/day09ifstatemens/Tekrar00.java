package day09ifstatemens;

public class Tekrar00 {
    public static void main(String[] args) {
        //ornek 1 : sayi 3 basamaklı ise ekrana "sai 3 basamaklıdır" yazdırın

        int sayi=666;
       sayi= Math.abs(sayi);

       //1.yol

       if (sayi<1000&&sayi>99){
            System.out.println(sayi+" : sayi uc basamaklıdır...");
        }
       if (sayi<100||sayi>1000){
           System.out.println(sayi+" : sayi uc basamaklı degıldır");
       }

       //2.yol
        if (sayi<1000&&sayi>99){
            System.out.println(sayi+" : sayi uc basamaklıdır...");

    }
        else {
            System.out.println(sayi+" : sayi uc basamaklı degıldır");
        }
}
}
