package day16arraysforeachloop;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        /*
"1'den 1000'e kadar olan sayılardan, her bir sayının basamaklarının küpleri toplamı kendisine eşit olan Armstrong
sayılarını bulan bir program yazın."
Bir Armstrong sayısı, her bir basamağının küplerinin toplamının kendisine eşit olduğu bir sayıdır.
Örneğin, 153 bir Armstrong sayısıdır, çünkü 1^3 + 5^3 + 3^3 = 153'e eşittir.
Sizden istenen program, 1'den 1000'e kadar olan tüm Armstrong sayılarını bulmalıdır. İyi şanslar!
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("0-1000 arasında bir sayi giriniz...");
        int sayi= scan.nextInt();
        armstrong(sayi);
        if (sayi<=0||sayi>1000){
            System.out.println("sayiyi dogru gir");
        }else {
            if (armstrong(sayi)){
                System.out.println(sayi+ " armstrong");
            }else {
                System.out.println("armstrong değil");
            }
        }
    }

    private static boolean armstrong(int a) {
        if (a<=10) {

            return a==Math.pow(a,3);
        } else if (a<100) {
            int birler=a%10;
            int onlar=a/10;
            return a==Math.pow(birler,3)+Math.pow(onlar,3);

        }else {
            int birler=a%10;
            int onlar=a/10%10;
            int yuzler=a/100;
            return a==Math.pow(birler,3)+Math.pow(onlar,3)+Math.pow(yuzler,3);
        }

    }
}

