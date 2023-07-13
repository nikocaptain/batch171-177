package day31mapsexception;

public class TekrarE03 {
    public static void main(String[] args) {
        String s="Java";
        //System.out.println("s.charAt(4) = " + s.charAt(4));

        getChar(s,4);
    }

    private static void getChar(String a,int idx) {

        try {
            char ch=a.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("olmayan index kullanim hatasi yaptiniz "+e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();

            System.out.println("kod calismaya devam etti.");
        }

    }
}
