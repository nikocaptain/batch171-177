package day31mapsexception;

import java.util.Arrays;

public class TekrarE044 {
    public static void main(String[] args) {
        //Araylerde olmayan bir index kullanıldıgında java ArrayIndexOutOfBoundsException fırlatır

        String arr[]=new String[4];
        arr[0]="J";
        arr[1]="A";
        arr[2]="V";
        arr[3]="A";
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));//Arrays.toString(arr) = [J, A, V, A]

        getEleman(arr,5);//Index 5 out of bounds for length 4
        getEleman(arr,2);

    }

    private static void getEleman(String[] arr, int i) {
        try {
            String a= arr[i];
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());//Index 5 out of bounds for length 4
            System.out.println(e.getCause());//null
        }
    }
}
