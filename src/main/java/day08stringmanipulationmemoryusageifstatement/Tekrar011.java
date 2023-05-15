package day08stringmanipulationmemoryusageifstatement;

public class Tekrar011 {
    public static void main(String[] args) {
        //ornek 4: bir stringdeki "java" kelimesinin ilk olarak kacıncı index te kullanıldığını gosteren kodu yazınız.
        //"Ah Java vah Java sensiz olmuyor Java."
        String str="Ah Java vah Java sensiz olmuyor Java.";

        int a=str.indexOf("Java");
        System.out.println(a);
        int b=str.lastIndexOf("Java");
        System.out.println(b);
        //ornek 5:bir string de a,i,e characterlerinin son gorunumlerinin indexleri toplamını ekrana yazdıreınız.
        String v="Java is easy to learn";

        int idxa=v.lastIndexOf('a');
        System.out.println("idxa = " + idxa);
        int idxi=v.lastIndexOf('i');
        System.out.println("idxi = " + idxi);
        int idxe= v.lastIndexOf('e');
        System.out.println("idxe = " + idxe);

        System.out.println("toplam :  "+(idxe+idxa+idxi));//40

        int idxk=v.lastIndexOf('k');
        System.out.println(idxk);//-1

        //ornek 1:bir string in belirli bir karaktrinden başlayarak belirli bir karaktere kadar dynamic olarak alınız.
        //abcgmail.com==>gmail

        String str1="abcgklkjhf@gmail.com";
        int startIndex=str1.indexOf('@')+1;
        int endingIndex=str1.lastIndexOf('.');
        String str2=str1.substring(startIndex,endingIndex);
        System.out.println(str2);

        //ornek 2: verilen iki stringin birbirinin aynısı olup olmadığını kontrol eden kodu yazınız

        String a1="Ali Can";
        String b1="alİ cAn";

        boolean result=a1.equals(b1);
        boolean tt=a1.equalsIgnoreCase(b1);
        System.out.println("tt  :" +tt);//true

        System.out.println(result);//false
       boolean z= a1==b1;
        System.out.println(z);

        int num=25;
        if(num>5&&num<25){
            System.out.println("numara istenen aralıkta   :   "+num);
        }

    }
}
