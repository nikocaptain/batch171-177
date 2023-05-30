package day16arraysforeachloop;

import java.util.Arrays;

public class Tekrar_Array01 {
    public static void main(String[] args) {
        //ornek 2:String bir Array oluşturun 6 eleman ekleyiniz yellow dan önceki elemanları yazdırınız

        String renkler[]=new String[6];
        renkler[0]="Blue";
        renkler[1]="Green";
        renkler[2]="Purpel";
        renkler[3]="Yellow";
        renkler[4]="White";
        renkler[5]="Black";

        System.out.println(Arrays.toString(renkler));


        for (int i = 0; i < renkler.length; i++) {
            if (renkler[i].equals("Yellow")) {
                break;
            }
                System.out.println(renkler[i].charAt(0)+renkler[i].toUpperCase()+renkler[i].charAt(renkler[i].length()-3));


        }
        System.out.println("----------for each loop------------");


        for (String w:renkler){
            if (w.equals("White")){
                System.out.println("buraya kadar");
                break;
            }
            System.out.println(w);
        }


    }
}
