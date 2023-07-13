package day31mapsexception;

public class E02 {
    public static void main(String[] args) {
        String s="1234";
        convertStringtoInt(s);

        String t="123a";
        convertStringtoInt(t);

    }


    //icinde rakamlar dısında character olan bir stringi sayiya cevirmek isterseniz NumberFormatException alirsiniz
    public static void convertStringtoInt(String s){
        try{
            Integer intS= Integer.valueOf(s);
            System.out.println(intS+1);
        }catch (NumberFormatException e){
            System.out.println("Bir String in sayiya donusturulmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage());
        }

    }
}
