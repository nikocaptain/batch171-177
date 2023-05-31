package day18multidimensionalarray;

import java.util.Arrays;

public class Tekrar01 {
    public static void main(String[] args) {
        String student[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        //yukaridaki student array inde toplam kaç tane isim olduğunu bulunuz.
        System.out.println("Arrays.deepToString(student) = " + Arrays.deepToString(student));

        System.out.println("student.length = " + student.length);//4
        int sayac=0;
        for (String[] w: student){
            sayac=sayac+w.length;
        }
        System.out.println(sayac);//8
    }
}
