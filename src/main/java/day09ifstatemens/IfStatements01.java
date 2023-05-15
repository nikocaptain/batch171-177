package day09ifstatemens;

public class IfStatements01 {
    public static void main(String[] args) {

        //ornek 1 : sayi 3 basamaklı ise ekrana "sai 3 basamaklıdır" yazdırın

        int a=-990;
       a= Math.abs(a);
        if (a<1000&&a>99){
            System.out.println("sayi 3 basamaklıdır.!");
        }

        //Ornek 2: Bir string deki tekrarsiz characterleri ekrana yazdiriniz
        // abbccdc  ==> ad
        String str = "aac";

        char ch1=str.charAt(0);

        if(str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2=str.charAt(1);

        if(str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3=str.charAt(2);

        if(str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }




    }
}
