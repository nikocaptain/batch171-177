package day31mapsexception;

public class TekrarE02 {
    public static void main(String[] args) {

        String s="1234";

        Cevirme(s);

        String t="12345a";
        Cevirme(t);

    }

    private static void Cevirme(String a) {
        try {
            Integer Ints=Integer.valueOf(a);
            System.out.println(Ints+21);
        } catch (NumberFormatException e) {
            System.out.println("Bir String in sayiya donusturulmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage());
        }
    }
}
