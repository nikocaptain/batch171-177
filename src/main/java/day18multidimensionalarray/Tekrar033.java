package day18multidimensionalarray;

import java.util.Arrays;

public class Tekrar033 {
    public static void main(String[] args) {
        //ornek : 2 boyutlu bir Array i tek boyutlu bir Array e ceviriniz.

        int numbers[][]={{5,4},{2,3,1}};
        int elemanSayisi=0;
        for (int[] w:numbers){
            for (int k:w){
                elemanSayisi++;
            }
        }
        System.out.println(elemanSayisi);
        int tekBoyut[]=new int[elemanSayisi];
        int counter=0;
        for (int[] w:numbers){
            for (int k:w){
                tekBoyut[counter]=k;
                counter++;
            }
        }
        System.out.println("Arrays.toString(tekBoyut) = " + Arrays.toString(tekBoyut));
       Arrays.sort(tekBoyut);
        System.out.println("Arrays.toString(tekBoyut) = " + Arrays.toString(tekBoyut));
    }
}
