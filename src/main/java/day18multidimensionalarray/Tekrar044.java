package day18multidimensionalarray;

public class Tekrar044 {
    public static void main(String[] args) {
        //ornek: Bir multidimensional Array deki en kucuk ve en buyuk elemanin toplamini bulunuz

        int ages[][] = {{15, 4}, {12, 43, 21}};
        int small=ages[0][0];
        int big=ages[0][0];
        for (int[] w:ages){
            for (int k:w){
                small=Math.min(small,k);
                big=Math.max(big,k);
            }
        }
        System.out.println("small = " + small);
        System.out.println("big = " + big);
        System.out.println("small+big: "+(small+big));
    }
}
