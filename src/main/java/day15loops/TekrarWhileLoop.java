package day15loops;

public class TekrarWhileLoop {
    public static void main(String[] args) {
       /*
        while loop kalibi
        baslangic degeri
        while(loop calisma kurali ){
            calisacak kodlar
            artirma/azaltma
        }*/

        // Ornek 1: 3 ten 6 ya kadar tamsayıları konsola yazdırınız

        int a=3;
        while (a<7){
            System.out.print(a+" ");
            a++;
        }
        System.out.println("");

        //ornek 223 ten 12 ye kadar çift tamsayilari konsola yazdırınız
        int b=223;
        while (b>11){
            if (b%2==0){
                System.out.print(b+" ");
            }

            b--;
        }
        System.out.println("");
        //ornek 3: 6 dan 19 a kadar tek sayilari konsola yazdırınız
        int c=6;
        while (c<20){
            if (c%2!=0){
                System.out.print(c+" ");
            }
            c++;
        }

    }
}
