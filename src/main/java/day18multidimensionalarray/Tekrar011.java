package day18multidimensionalarray;

import java.util.Arrays;

public class Tekrar011 {
    public static void main(String[] args) {
        String student[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        System.out.println("Arrays.deepToString(student) = " + Arrays.deepToString(student));
        System.out.println(student.length);
        String sum[] = new String[0];
        for (String[] w: student){

               sum=w;
            System.out.println("Arrays.toString(sum) = " + Arrays.toString(sum));
        }


    }
}
