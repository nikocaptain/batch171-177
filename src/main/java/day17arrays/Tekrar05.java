package day17arrays;

import java.util.Arrays;

public class Tekrar05 {
    public static void main(String[] args) {
        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int a[]={0,2,3,0,12,0};
        int b[]=new int[a.length];

        int idx=0;
        for (int w:a){
            if (w>0){
                b[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        int arr[] = {12, 23, 12, 2, 3};
        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 12));
    }
}
