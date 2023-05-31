package day18multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {
       //ornek : 2 boyutlu bir Array i tek boyutlu bir Array e ceviriniz.

       int numbers[][]={{5,4},{2,3,2}};

       //1. step: iki boyutlu array de kaç eleman olduğunu bulan kodu yazmalıyız
        int toplamElemanSayisi=0;
        for (int[] w: numbers){//outer loop ile multidimensional arrayin int array olan elemanlarini tek tek aliriz
            toplamElemanSayisi=toplamElemanSayisi+w.length;
        }
        System.out.println(toplamElemanSayisi);//5

        //2. step: tek boyutlu arrayi iki boyutlu Array in eleman sayisini kullanarak oluşturmaliyiz
        int newArray[]=new int[toplamElemanSayisi];
        int idx=0;

        //3. step: iki boyutlu array deki elemanlari tek boyutlu array e transmer etmeliyiz.
        for (int[] w: numbers){//outer loop ile multidimensional arrayin int array olan elemanlarini tek tek aliriz
            for (int k:w){//inner loop ile w sepetine koymus oldugumuz arrayin elemanlarini tek tek aliriz
                newArray[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArray));//[5, 4, 2, 3, 2]



    }
}
