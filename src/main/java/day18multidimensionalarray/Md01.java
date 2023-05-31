package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        // Bir Array in elemanlari Array ise bu Arrayler Multidimensional Array dir

        // Multidimensional Array nasil olusturulur.

        int a[][] = new int[3][2];


        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));//[[I@30c7da1e, [I@5b464ce8, [I@57829d67] refarans nosu verir
        System.out.println("Arrays.deepToString(a) = " + Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //Multidimensional array içerisinden spesifik bir eleman nasıl yazdırılır.

        System.out.println(a[1][1]);//45
        System.out.println(a[2][0]);//123
        System.out.println("Arrays.toString(a[0]) = " + Arrays.toString(a[0]));//[5, 12]
        System.out.println("Arrays.toString(a[2]) = " + Arrays.toString(a[2]));//[123, 0]

        //kisa yoldan multidimensional array nasil olusturulur?
        //Multidimensional arrayleri console a yazdirmak icin toString() methodu degil,
        //"deepToString()" methodunu kullanmaliyiz

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir?
        System.out.println(a[1][1]);
        System.out.println(a[2][0]);
        System.out.println("----");

        //Multidimensional Array icindeki array nasil yazdirilir?
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(Arrays.toString(a[2]));//[123, 0]

        //Kisa yoldan Multidimensional Array nasil olusturulur?

        String student[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        System.out.println(student.length);//4

        //yukaridaki student array inde toplam kaç tane isim olduğunu bulunuz.

        int sum = 0;
        for (String[] w : student) {
            sum = sum + w.length;

        }
        System.out.println(sum);


    }
}
