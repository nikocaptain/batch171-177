package day18multidimensionalarray;

import java.util.Arrays;

public class Tekrar022 {
    public static void main(String[] args) {
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan","Kayahan"}};

        //ornek 1: yukaridaki student arrayinde icinde "m" harfi olan isimleri console yazdiriniz.
        for (String[] w:students) {
            for (String k:w){
                if (k.contains("m")){
                    System.out.println(k);
                }
            }

        }
        System.out.println("---------2--------");
        //ornek 2: Bir integer md Array olusturunuz, tüm elemanların çarpımını hesaplayınız.

        int nums[][]={{5,4},{2,3,2},{7}};
        int carpim=1;
        int sayac=0;
        System.out.println("Arrays.deepToString(nums) = " + Arrays.deepToString(nums));

        for (int[] w:nums){
            for (int k:w){
                carpim*=k;
                sayac++;
            }

        }
        System.out.println(carpim);
        System.out.println("Array uzunluğu: "+sayac);
    }
}
