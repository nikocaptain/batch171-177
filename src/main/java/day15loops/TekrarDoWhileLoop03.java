package day15loops;

import java.util.Scanner;

public class TekrarDoWhileLoop03 {
    public static void main(String[] args) {
        /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */

        Scanner scan=new Scanner(System.in);

        int a=0;

        do {
            int sayac=0;
            sayac=sayac+a;

            if (sayac==1) {
                System.out.println("bloke");
                break;
            }
            System.out.println("username");
            String user= scan.next();
            System.out.println("şifre");
            String password= scan.next();
            if (user.equals("admin")&&password.equals("pwd123")){
                System.out.println("girdin");
                break;
            }
          a++;
        }while (true);
    }
}
