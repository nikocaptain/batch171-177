package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {
        //NOT: Kodumuzu yazarken Nested yapilardan(ic ice gecen kodlardan) mumkun oldukca uzak durmaliyiz.
        // Cunku bu tarz yapilar uygulamayi yavaslatir
        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String dayName= scan.next();

        switch (dayName.toLowerCase()){
            case "pazartesi" :
                System.out.println("birinci gün");
                break;
            case  "sali":
                System.out.println("ikinci gün");
                break;
            case "carsamba":
                System.out.println("ücüncü gün");
                break;
            case "persembe":
                System.out.println("dorduncu gun");
                break;
            case "cuma":
                System.out.println("besinci gün");
                break;
            case "cumartesi":
                System.out.println("altinci gun");
                break;
            case "pazar":
                System.out.println("yedinci gun");
                break;
            default :
                System.out.println("hatali giris");
        }
    }
}
