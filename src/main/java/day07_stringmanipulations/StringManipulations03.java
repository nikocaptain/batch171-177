package day07_stringmanipulations;

public class StringManipulations03 {
    //ornek 1: bir string in bas ve sonunda space karakteri varsa siliniz
    //"    Ali Can    "==>"Ali Can"
    public static void main(String[] args) {
        String s="   Ali Can"    ;
        System.out.println(s);

        //trim methodu bas ve sonundaki space karakterleriini siler aradaki space lere dokunmaz
       String sTrimmed= s.trim();

        System.out.println(sTrimmed);

        //ornek 2: asagıdaki fiyatlari verilen urunlerin toplam fiyatını bulunuz.

        String tv="$456.99";
        String laptop="$875.99";

        String tv1 =tv.replace("$","");
        System.out.println("tv1 = " + tv1);
       String laptop1= laptop.replace("$","");
        System.out.println("laptop1 = " + laptop1);
        double totalprice=Double.valueOf(tv1)+ Double.valueOf(laptop1);

        System.out.println("totalprice = " + totalprice);

        //ornek 3: verilen ismi ilk isminin ilk harfini ve soyisminin ilk harfini ekrana büyük yazdırınız
        //"Ali Can"==> AC

        String name="Ali Can";
      char first=  name.trim().toUpperCase().charAt(0);
      char last= name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(""+first+last);
        //split() methodu bir stringi istediğimiz karakterden parçalamaya yarar


    }

}
