package day05ConcatinationOperatorsTypecasting;

public class concatination {//concatination:birleştirme demektir
    public static void main(String[] args) {

        //ornek:1 bir string ve 2 int variable oluşturun. string degeri ile int lerin toplamını konsola yazdırınız.
        String str="elma";
        int a=10;
        int b=11;
        System.out.println(str+a+b);//elma1011

        System.out.println(str+(a+b));//elma21
        System.out.println(str+a*b);//elma110
        System.out.println(a+b+str);//21elma
        System.out.println(a+str+b);//10elma11

        //Java da  "+" sembolu iki sayı arasında kullanılırsa toplama işlemi olur
        //Java da  "+" sembolu iki string veya bir string bir sayi arasında kullanılırsa "concatination"(birleştirme)  yapar.

        //note: concatination işlemlerinde java matematikteki işlem önceliği kurallarını kullanır.
        /*
        matematikte işlem önceliği
        1)önce üslü sayilar
        2)parantez içi
        3)çarpma ve bölme
        4)toplama ve çıkarma
        5)aynı öncelikli olanlarda soldan sağa doğru işlem yapar
         */

        //ornek 2: size String olarak verilen iki fiyatın toplamını ekrana yazdırınız.

        String shirt="2300";
        String shoes="5200";
        System.out.println(shirt+shoes);
        //Integer.valueOf() String degerleri integer a cevirir.
        int toplamfiyat=Integer.valueOf(shirt)+Integer.valueOf(shoes);
        System.out.println("toplamfiyat = " + toplamfiyat);

        //ornek 3: size string olarak verilen iki fiyatın toplamını ekrana yazdırınız

        String tv="$1100";
        String radio="$300";
        System.out.println(tv+radio);//$1100$300
        int totalprice=Integer.valueOf(tv)+Integer.valueOf(radio);
        System.out.println(totalprice);//$1100$300




        //note:ValueOf() methodu tüm karakterleri rakam olan String leri sayilara çevirir.
        //Eger Valueof() methodu kullanırken String in içine rakam olmayan bir karakter koyarsanız hata alırsınız.
        //Valueof() methodu kullanılırken sadece rakam olan karakterler kullanılmalıdır.


    }
}
