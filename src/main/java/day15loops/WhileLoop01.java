package day15loops;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Kalibini oluşturalim
        /* for kalibi
        for (baslangic degeri ; loop calisma kurali ; artirma/azaltma) {
            calisacak kodlar
        }

        */
        /*
        while loop kalibi
        baslangic degeri
         while(loop calisma kurali ){
            calisacak kodlar
            artirma/azaltma
         }*/

        // Ornek 1: 3 ten 6 ya kadar tamsayıları konsola yazdırınız

        //1. Yol
        for (int i = 3; i <7 ; i++) {
            System.out.print(i+"*");

        }
        System.out.println("");

        //2. Yol

        int i =3;

        while (i<7){//while ken demektir . i yediden küçük olduğu müddetçe
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");

        //ornek 223 ten 12 ye kadar çift tamsayilari konsola yazdırınız

        int k=223;

        while (k>11){
            if(k%2==0){
                System.out.print(k+" ");
            }
            k--;

        }
        System.out.println("");
        //ornek 3: 6 dan 19 a kadar tek sayilari konsola yazdırınız
        int m=6;
        while (m<20){
            if (m%2!=0){
                System.out.print(m+" ");
            }

            m++;
        }


    }
}
