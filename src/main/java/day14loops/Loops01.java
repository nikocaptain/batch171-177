package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        //ornek 1:bir stringi ters ceviren kodu yazınız.

        //1. yol

        String s="Java";
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));

        }

        //2. yol
        String ters="";
        System.out.println("");

        for (int i = s.length()-1; i >=0 ; i--) {
            ters=ters+s.substring(i,i+1);

        }
        System.out.print(ters);

        System.out.println("");

        //Ornek 2 Size verilen bir string in palindrome olup olmadigini kontrol eden kodu yaziniz
        //         ey edip adanada pide ye , nalan, kucuk, ada
        //Logic : String i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise Palindrome dur.

        String duz="Ay edip adanada pide ye";
        String ters1="";

        for (int i = duz.length()-1; i >=0 ; i--) {
            ters1 = ters1 + duz.charAt(i);
        }
            if (duz.equalsIgnoreCase(ters1)){
                System.out.println("Palindrome :" +duz+"  ++  "+ters1);
            }else {
                System.out.println("Palindrome değil");
            }


    }
}
