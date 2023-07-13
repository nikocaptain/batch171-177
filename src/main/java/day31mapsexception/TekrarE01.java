package day31mapsexception;

public class TekrarE01 {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        //divide(a,b);
        divide2(a,b);
    }

    private static void divide2(int a,int b) {
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println("do not divide by zeroo");
        }
    }

//    private static void divide(int a, int b) {
//        if (b==0){
//            System.out.println("do not divide by zero");
//        }else {
//            System.out.println(a/b);
//        }
//    }
}
