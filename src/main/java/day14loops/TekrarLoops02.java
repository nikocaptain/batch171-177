package day14loops;

public class TekrarLoops02 {
    public static void main(String[] args) {
        //ornek 2: 7 den 9 a kadar tamsayıların çarpımını veren kodu yazınız
        int carpim = 1;

        for (int i = 7; i < 10; i++) {
            carpim = carpim * i;
        }
        System.out.println(carpim);

    }
}
