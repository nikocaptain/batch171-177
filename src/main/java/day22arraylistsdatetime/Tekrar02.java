package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tekrar02 {
    public static void main(String[] args) {
        //Example 1: Bir tane Integer List olusturunuz===>>>Interview sorusu
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10

        List<Integer>  sayi=new ArrayList<>();
        sayi.add(12);
        sayi.add(23);
        sayi.add(10);
        sayi.add(19);
        System.out.println(sayi);
        Collections.sort(sayi);
        System.out.println(sayi);
        int min=sayi.get(1)-sayi.get(2);
        min=Math.abs(min);
        for (int i = 1; i < sayi.size(); i++) {
          min=  Math.min(min, sayi.get(i)- sayi.get(i-1));

        }
        System.out.println(min);

        for (int i = 1; i <sayi.size() ; i++) {
            if (min== sayi.get(i)- sayi.get(i-1)){
                System.out.println(sayi.get(i-1)+" and "+ sayi.get(i));
            }
        }




    }
}
