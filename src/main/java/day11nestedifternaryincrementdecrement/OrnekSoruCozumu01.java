package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class OrnekSoruCozumu01 {
    public static void main(String[] args) {
        //Soru 2
//Girilen ayin ismine gore mevsimi veren kodu yaziniz.
//Aralik-ocak-subat ==>KIS\
// mart -nisan mayis==>ilkbahar
//haziran -temmuz agustos ==>yaz
//eylul -ekim -kasim==>sonbahar
//input ==> Ocak output==> Kis

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ay ismini giriniz :");
        String monthName=input.nextLine();

        if (monthName.equalsIgnoreCase("aralik")|| monthName.equalsIgnoreCase("ocak")||monthName.equalsIgnoreCase("subat")){
            System.out.println("kis ayindasiniz");

        } else if (monthName.equalsIgnoreCase("mart")||monthName.equalsIgnoreCase("nisan")||monthName.equalsIgnoreCase("mayıs")) {
            System.out.println("ilkbahar ayindasiniz");

        }else if (monthName.equalsIgnoreCase("haziran")||monthName.equalsIgnoreCase("temmuz")||monthName.equalsIgnoreCase("agustos")) {
            System.out.println("yaz ayindasiniz");

        }else if (monthName.equalsIgnoreCase("eylul")||monthName.equalsIgnoreCase("ekim")||monthName.equalsIgnoreCase("kasım")) {
            System.out.println("sonbahar ayindasiniz");

        }else{
            System.out.println("lütfen ay ismini doğru giriniz...");

        }
    }
}
