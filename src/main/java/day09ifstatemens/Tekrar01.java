package day09ifstatemens;



public class Tekrar01 {
    public static void main(String[] args) {
        //Ornek 2: Bir string deki tekrarsiz characterleri ekrana yazdiriniz
        // abbccdc  ==> ad
        String str = "acd";

        char ch1=str.charAt(0);
        if (str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }
        char ch2=str.charAt(1);
        if (str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }
        char ch3=str.charAt(2);
        if (str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

    }
}
