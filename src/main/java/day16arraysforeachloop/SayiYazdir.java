package day16arraysforeachloop;

public class SayiYazdir {
    public static void main(String[] args) {


    /*Soru a sayısından b sayısına kadar olan  sayıların
  ve her bir sayının kendinden önceki iki sayının toplamlarını  bulan bir program yazmanız isteniyor.
örnek 1+(0+(-1))+   2+(1+0)+   3+(2+1)+ 4+(3+2) .......
*/
    int sayi1=10,sayi2=15,toplam=0;
    while (sayi1<=sayi2){
        toplam=toplam+sayi1+(sayi1-1)+(sayi1-2);

        sayi1++;
    }
        System.out.println("toplam = "+toplam);
}

        }

