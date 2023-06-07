package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {
                /*
        Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin
    */

        List<String> myList=new ArrayList<>();
        myList.add("A");
        myList.add("J");
        myList.add("K");
        Scanner scan=new Scanner(System.in);
        int counter=0;
        do {
            if (counter==3){
                System.out.println("GAME OVER");
                break;
            }
            System.out.println("Lütfen bir harf gir");
            String letter= scan.next().toUpperCase().substring(0,1);
            if (myList.contains(letter)){
                myList.set(myList.indexOf(letter),"Buldum!!" );
            } else {
                myList.add(letter);
            }
            System.out.println(myList);
            counter++;
        }while (true);



    }
}
