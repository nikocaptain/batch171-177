package day18multidimensionalarray;

public class Md02 {
    public static void main(String[] args) {
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan","Kayahan"}};

        //ornek 1: yukaridaki student arrayinde icinde "m" harfi olan isimleri console yazdiriniz.

        for (String[] w : students) {

            for (String k : w) {
                if (k.contains("m")) {
                    System.out.println(k + " ");
                }
            }
        }

        //ornek 2: Bir integer md Array olusturunuz, tüm elemNLrın çrpımını hesaplayınız.

        int nums[][]={{5,4},{2,3,2},{7}};
        int carpma=1;
        for (int[] w:nums){
            for (int k:w){
                carpma=carpma*k;
            }
        }
        System.out.println(carpma);//1680
    }
}
