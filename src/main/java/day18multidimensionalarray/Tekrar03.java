package day18multidimensionalarray;

import java.util.Arrays;

public class Tekrar03 {
    public static void main(String[] args) {
        //ornek : 2 boyutlu bir Array i tek boyutlu bir Array e ceviriniz.

        int numbers[][]={{5,4},{2,3,2}};
        int idx=0;
        int elemanSayisi=0;
        for (int[] w:numbers){
            elemanSayisi=elemanSayisi+w.length;
        }
        int newArr[]=new int[elemanSayisi];
        for (int[] w:numbers){
            for (int k:w){
                newArr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2]
    }
}
