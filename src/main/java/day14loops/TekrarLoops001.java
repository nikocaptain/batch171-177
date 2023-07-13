package day14loops;

public class TekrarLoops001 {
    public static void main(String[] args) {
        //Ornek 2 Size verilen bir string in palindrome olup olmadigini kontrol eden kodu yaziniz
        //         ey edip adanada pide ye , nalan, kucuk, ada
        //Logic : String i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise Palindrome dur.

        String duz="ey edip adanada pide ye";
        String ters="";
        for (int i = duz.length()-1; i>=0 ; i--) {
            ters=ters+duz.charAt(i);
        }
        //System.out.println(ters);
        if (ters.equals(duz)){
            System.out.println("verilen iki cumle palindrome \nVerilen cümle: "+duz+"\nCümlenin tersi: "+ters);

        }else {
            System.out.println("palindrome degil \nVerilen cümle: "+duz+"\nCümlenin tersi: "+ters);
        }
    }
}
