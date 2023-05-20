package day11nestedifternaryincrementdecrement;

public class Tekrar05 {
    public static void main(String[] args) {
        // HW-1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        String str = "Java 100'de yuz kolaydir";
        System.out.println(str.replaceAll("[0-9]", "").length());
        //HW-2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri
        // console a buyuk harflerle yazdiriniz
        System.out.println(str.toUpperCase().substring(1, str.length() - 1));
        //HW-3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin
        // ASCII degerleri toplamini console a yazdirini
        char a=str.charAt(0);
        char b=str.charAt(str.length()-1);
        System.out.println(a+b);
        //HW-4) Tek kelimeli bir sehir ismi icin string variable olusturun ve
        // sehir isiminin ilk harfini buyuk harfle

        String str1="sivAS";
        char ch1=str1.toUpperCase().charAt(0);
        String str2=str1.toLowerCase().substring(1,str1.length());
        System.out.println(ch1+str2);


    }
}
