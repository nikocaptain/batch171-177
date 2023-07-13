package day31mapsexception;

public class E03 {

    public static void main(String[] args) {
        String s = "Java";
        getCharFromString(s, 2);

        String t = "Java";
        getCharFromString(s, 4);


    }
    //Stringlerde var olmayan index ler kullanıldıgında StringIndexOutOfBoundsException atar.

    public static void getCharFromString(String s, int idx) {


        //ctrl+alt+t kısa yoldan gelir
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("olmayan index kullanım hatası yaptınız" + e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
            /*
            java.lang.StringIndexOutOfBoundsException: String index out of range: 4
            at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
            at java.base/java.lang.String.charAt(String.java:693)
            at day31mapsexception.E03.getCharFromString(E03.java:22)
            at day31mapsexception.E03.main(E03.java:10)

Process finished with exit code 0

             */

            System.out.println("kod calismaya devam etti.");
        }

    }

}
