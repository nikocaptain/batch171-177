package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java is easy");
        System.out.println(sb1);

        sb1.reverse();//String in ters cevirilmesi looplar ile de yapilir bu kisa yoldur.


        System.out.println(sb1);

        sb1.deleteCharAt(6);
        System.out.println(sb1);//Verilen index teki karakteri siler ==>ysae s avaJ

        sb1.delete(4,7);//baslangic index i dahil bitiş index ine kadar (hariç) olan karakterleri siler.
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(2,5,"Ooo");//methodu 2 dahil 5 haric yani index 2,3,4 deki karakterlerin yerine "OOOOOOOOO" koyar
        System.out.println(sb1);//ysOOOvaJ

        sb1.insert(3,"XXX");
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Kava");

        //sonuc 0 ise alfabetik olarak ayni siradalar demektir
        //sonuc -1 ise sb2 sb3 ten alfabetik olarak bir önde demektir
        //sonuc 1 ise sb2 sb3 ten alfabetik olarak bir sonra demektir

       int r1= sb2.compareTo(sb3);
        System.out.println(r1);

        //StringBuilder nasil String e cevirilir

       String str= sb2.toString().toUpperCase();
        System.out.println(str);

        //String nasil StringBuilder a cevrilir?
        StringBuilder newSb2=new StringBuilder(str);
        System.out.println(newSb2);
    }
}
