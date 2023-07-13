package day35lambda;

import java.util.stream.IntStream;

public class TekrarLambda03 {
    public static void main(String[] args) {
        int sum=getSumFromSevenToSeventy();
        System.out.println(sum);//2464

        int carp=getMultiplicationFromThreeToNine();
        System.out.println(carp);//181440
        System.out.println(getFactorial(5));//120
       int top= getSumOfEvensBetweenTwoInt(1,9);
        System.out.println(top);

    }

    //9 ) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz

    public static int getSumFromSevenToSeventy(){
      return   IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }

    //10 ) 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.

    public static int getMultiplicationFromThreeToNine(){

      int carpim=  IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();

      return carpim;
    }

    //11) Size verilen sayinin faktöriyelini hesaplayın

    public static int getFactorial(int x){

        if (x==0){

            return 1;
        }else if (x<0){
            System.out.println("faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        }else {
            return   IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        }


    }

    //12) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.

    //1, yol
    public static int getSumOfEvensBetweenTwoInt(int a,int b){
        if (a>b){
            int empty=a;
            a=b;
            b=empty;
        }

      return   IntStream.rangeClosed(a,b).filter(t->t%2==0).sum();//.reduce(Math::addExact).getAsInt();
    }

    //2, yol
    public static int getSumOfEvensBetweenTwoInt2(int a,int b){
        if (a>b){
            int empty=a;
            a=b;
            b=empty;
        }
       return IntStream.range(a+1,b).filter(Utils::isNumberEven).sum();


    }





}
