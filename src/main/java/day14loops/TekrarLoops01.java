package day14loops;

public class TekrarLoops01 {
    public static void main(String[] args) {
        //Ornek 2 Size verilen bir string in palindrome olup olmadigini kontrol eden kodu yaziniz
        //         ey edip adanada pide ye , nalan, kucuk, ada
        //Logic : String i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise Palindrome dur.

        String s="ey edip adanada pide ye";
        String ters="";
        for (int i = s.length()-1; i >=0 ; i--) {
            ters=ters + s.charAt(i);

        }
        if (s.equalsIgnoreCase(ters)){
            System.out.print("...palindrome...");

        }else {
            System.out.println("palindrome değil");
        }
    }
}
