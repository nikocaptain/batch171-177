package day15loops;

import java.util.Scanner;

public class Do02 {
    public static void main(String[] args) {
      /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */
        Scanner scan = new Scanner(System.in);

        int counter = 1;
        do {
            System.out.println("kullanici adini giriniz");
            String kulAdi = scan.next();
            System.out.println("Şifrenizi giriniz");
            String sifre = scan.next();
            if (kulAdi.equals("admin") && sifre.equals("pwd123")) {
                System.out.println("Hesabiniza hosgeldiniz");
                break;
            } else {
                if (counter == 4) {
                    System.out.println("Hesabiniz bloke olmustur");
                    break;

                }
                System.out.println("Lütfen tekrar deneyiniz");

            }counter++;
        } while (true);
    }
}
