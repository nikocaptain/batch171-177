package day06swapvaluesstringmanipulations;

public class Tekrar033 {

    public static void main(String[] args) {
        String t= "Ali 13 yasindadir!...";

        //ornek 1:"t" string indeki tüm rakamları yıldıza ceviriniz

       String t1= t.replaceAll("[0-9]","*");
        System.out.println(t1);

//ornek 2: "t" stringindeki tüm rakamları ve harfleri "!" çeviriniz

       String t2= t.replaceAll("[0-9a-zA-Z]","!");
        System.out.println(t2);

        //ornek 3: "t" stringindeki tüm sesli harfleri "?" yapınız

        String t3=t.replaceAll("[aeiouAEİOU]","?");
        System.out.println(t3);

        //ornek 4: "t" stringindeki kucuk harfler dısındaski tüm karakterleri "<>" ceviriniz
        String t4 =t.replaceAll("[^a-z]","<>");
        System.out.println("t4 = " + t4);

        //ornek 5: "t" stringindeki tüm harfler dışındaki tüm karakterleri "+" ceviriniz

        String t5=t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);

        //ornek 6:"t" stringindeki spaceler dışındaki karakterleri "-" ceviriniz

        String t6=t.replaceAll("\\S","-");
        System.out.println(t6);

        //ornek 7: "t" stringindeki sesli harfler dışındaki tüm karakterlieri "&" ceviriniz

        String t7=t.replaceAll("[^aeiouAEİOU]","&");
        System.out.println(t7);

        String t8=t.replaceAll("\\p{Punct}","K");
        System.out.println(t8);
    }
}
