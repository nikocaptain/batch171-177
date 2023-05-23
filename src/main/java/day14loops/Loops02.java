package day14loops;

public class Loops02 {
    public static void main(String[] args) {
        //ornek 1: 5 den 8 e kadar tamsayıların toplamını veren kodu yazınız
        //5+6+7+8==>26

        int toplam=0;

        for (int i = 5; i <9 ; i++) {
            toplam=toplam +i;
        }
        System.out.println(toplam);

        //ornek 2: 7 den 9 a kadar tamsayıların çarpımını veren kodu yazınız

        int multiply=1;
        for (int i = 7; i <10 ; i++) {

            multiply=multiply*i;

        }
        System.out.println(multiply);

        //Ornek 3: Verilen bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        // 578  ==> 5 + 7 + 8 = 20


        int k=0;
        int sayi=578;
        sayi=Math.abs(sayi);

        for (int i = sayi; i >0 ; i/=10) {

            k=k+i%10;

        }
        System.out.println(k);

    }
}
