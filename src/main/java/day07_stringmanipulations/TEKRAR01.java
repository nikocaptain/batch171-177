package day07_stringmanipulations;

public class TEKRAR01 {
    //ornek 3: verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana büyük yazdırınız
    //"Ali Can"==> AC
    public static void main(String[] args) {
        String str="  niyazi bölükbaşı";

       char ch= str.trim().toUpperCase().charAt(0);
       char ch1=str.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(""+ch+ch1);

        //ornek 2: asagıdaki fiyatlari verilen urunlerin toplam fiyatını bulunuz.

        String tv="$456.99";
        String laptop="$875.99";

       String tv1= tv.replace("$","");
       String laptop1=laptop.replace("$","");
        System.out.println("tv1 = " + tv1);
        System.out.println("laptop1 = " + laptop1);

        double tv2=Double.valueOf(tv1);
        double laptop2=Double.valueOf(laptop1);
        System.out.println("tv2 = " + tv2);
        System.out.println("laptop2 = " + laptop2);
        double totalprice=tv2+laptop2;
        System.out.println("totalprice = "+"$" + totalprice);
    }
}
