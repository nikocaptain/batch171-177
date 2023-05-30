package day16arraysforeachloop;

import java.util.Scanner;

public class TTett {
    public static void main(String[] args) {
         /*
    Soru: Kullanıcıdan üç adet sayı alarak, bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını kontrol eden bir program yazmanız istenmektedir.
Bir üçgenin dik üçgen olduğunu anlamak için Pisagor bağlantısından yararlanabilirsiniz. Pisagor bağlantısı, bir üçgenin
dik üçgen olduğunu belirlemek için kullanılan bir formüldür ve a^2 + b^2 = c^2 şeklinde ifade edilir. Burada a, b ve c üçgenin kenar uzunluklarını temsil eder.
İşte programınızın gereksinimleri:
Kullanıcıya üç adet sayı girmesi istenmelidir, bu sayılar üçgenin kenar uzunluklarını temsil eder.
Girilen her sayı negatif veya sıfır olamaz. Eğer kullanıcı negatif veya sıfır bir değer girerse,
hata mesajı gösterilmeli ve tekrar geçerli bir değer girmesi istenmelidir.
Girilen kenar uzunluklarıyla bir dik üçgen oluşturulup oluşturulmadığı kontrol edilmelidir.
Eğer oluşturulabiliyorsa, kullanıcıya "Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uyar." şeklinde bir mesaj gösterilmelidir. Dik üçgen değilse, kullanıcıya "Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uymaz." şeklinde bir mesaj gösterilmelidir.
Programınızı bu gereksinimlere uygun olarak yazınız.
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayiyi gir");
        double sayi1= scan.nextDouble();
        System.out.println("2. sayiyi gir");
        double sayi2= scan.nextDouble();
        System.out.println("3. sayiyi gir");
        double sayi3= scan.nextDouble();
        pisagor(sayi1,sayi2,sayi3);
        if (sayi1<=0||sayi2<=0||sayi3<=0){
            System.out.println("hatali giriş 0 dan buyuk sayi gir");
        }else{
            if (pisagor(sayi1,sayi2,sayi3)){
                System.out.println("Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uyar.");
            }else {
                System.out.println("dik ucgen degil");
            }


        }


    }

    private static boolean pisagor(double a,double b,double c) {
        return a*a +b*b ==c*c||a*a +c*c ==b*b||c*c +b*b ==a*a;
    }
}
