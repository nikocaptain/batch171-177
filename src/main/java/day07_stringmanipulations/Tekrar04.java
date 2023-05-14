package day07_stringmanipulations;

public class Tekrar04 {
    public static void main(String[] args) {
        //ornek 1: bir string in bas ve sonunda space karakteri varsa siliniz
        //"    Ali Can    "==>"Ali Can"

        String str="   Niyazi bölükbaşı  ";
        System.out.println("str = " + str);
        String trimm= str.trim();
        System.out.println("trimm = " + trimm);

        //ornek 2: asagıdaki fiyatlari verilen urunlerin toplam fiyatını bulunuz.

        String tv="$456.99";
        String laptop="$875.99";

        String tv1=tv.replace("$","");
        String laptop1=laptop.replace("$","");

        Double totalprice =Double.valueOf(tv1)+Double.valueOf(laptop1);
        System.out.println("totalprice = " + totalprice);//1332.98

        //ornek 3: verilen ismi ilk isminin ilk harfini ve soyisminin ilk harfini ekrana büyük yazdırınız
        //"Ali Can"==> AC

        String s="Ali Can";
        char a=s.toUpperCase().charAt(0);//A
        char b=s.toUpperCase().split(" ")[1].charAt(0);
        System.out.println(""+a+b);//AC





    }
}
