package day18multidimensionalarray;

public class Tekrar02 {
    public static void main(String[] args) {
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan","Kayahan"}};

        //ornek 1: yukaridaki student arrayinde icinde "m" harfi olan isimleri console yazdiriniz.
        for (String[] w: students){
            for (String k:w){
                if (k.contains("m")){
                    System.out.println(k);//Kemal Cemal
                }
            }
        }

        //ornek 2: Bir integer md Array olusturunuz, tüm elemaNLrın çarpımını hesaplayınız.

        int nums[][]={{5,4},{2,3,2},{7}};

        int multiply=1;
        for (int[] w: nums){
            for (int k:w){
                multiply=multiply*k;
            }
        }
        System.out.println(multiply);//1680





    }
}
