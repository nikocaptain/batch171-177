package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {
        //ornek 1: bir string in hic karakter içermediğini kontrol eden kodu yazınız.

        //1. yol length methodu ile çözüm
        String str="";
        boolean result1= !(str.length() >0);
        System.out.println("String boş mu?  "+result1);//String boş mu? true
        boolean result22= str.length()==0;
        System.out.println("String boş mu?  "+result22);//String boş mu? true

        //2.yol tavsiye edilir
        //java 1 konuda method olusturmus ise o methodu kullanmak en iyisidir

        boolean result2=str.isEmpty();
        System.out.println("is empty?  "+result2);//String boş mu? true

        //ornek 2: 1 stringin space haraiç hiçbir karakter içerdiğini kontrol eden kodu yazınız
        String  t="       ";
        //1. yol
       boolean result3= t.replace(" ","").length()==0;
        System.out.println(result3);//true

        //2. yol
        boolean result4= t.replace(" ","").isEmpty();
        System.out.println(result4);//true

        //3.yol
        boolean result5=t.isBlank();
        System.out.println("result5 = " + result5);

        // isBlank methodu sadece space içeren Stringler icin true verir. space dışında bir karakter var isde fals verir.
        //isBlank() methodu boş stringler için de true verir.
        //isBlank() methodu space +hiç birşey için true verir
        //isEmpty() methodu sadece hiçbir şey için true verir.

        //ornek 3: bir string de a,i,e ilk görümleri indexleri toplamını ekrana yazdırınız.
        //Java is easy to learn"==>1+5+8=14
        //0123456789

        String r="Java is easy to learn";
        int idxA=r.indexOf('a');
        System.out.println("idxA = " + idxA);//1
       int idxI= r.indexOf('i');
        System.out.println("idxI = " + idxI);//5
        int idxE=r.indexOf('e');
        System.out.println("idxE = " + idxE);//8
        int sonuc= idxE+idxA+idxI;
        System.out.println("sonuc = " + sonuc);//14

        //ornek 4: bir stringdeki "java" kelimesinin ilk olarak kacıncı index te kullanıldığını gosteren kodu yazınız.
        //"Ah Java vah Java sensiz olmuyor Java."
        String str1="Ah Java vah Java sensiz olmuyor Java.";
        int ss=str1.indexOf("Java");
        System.out.println("ss = " + ss);//3

        //indexOf("Java") kullanımında siz "Java" kelimesinin ilk harfinin (yani J nin) index ini almış olursunuz

       int idxjava= str1.indexOf("Java");
        System.out.println("idxjava = " + idxjava);//-1 verir
        //indexOf() methodu olmayan karakterlr için kullanılırsa her zaman -1 return eder.

        //ornek 5:bir string de a,i,e characterlerinin son gorunumlerinin indexleri toplamını ekrana yazdıreınız.
        String v="Java is easy to learn";
        int idxOfa=v.lastIndexOf('a');
        System.out.println("idxOfa = " + idxOfa);
        int idxOfe=v.lastIndexOf('e');
        System.out.println("idxOfe = " + idxOfe);
        int idxOfi=v.lastIndexOf('i');
        System.out.println("idxOfi = " + idxOfi);
        System.out.println(idxOfe+idxOfi+idxOfa);

        //note: lastindexOf() methodu olmayan karakterlr için kullanılırsa her zaman -1 return eder.
    }
}
