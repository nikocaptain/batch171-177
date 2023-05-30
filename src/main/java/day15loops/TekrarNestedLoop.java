package day15loops;

public class TekrarNestedLoop {
    public static void main(String[] args) {
        /*
        Example 1: Asagidaki sekli cizen kodu yaziniz
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5
                       */
        int a=5;
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");


        }
    }
}
