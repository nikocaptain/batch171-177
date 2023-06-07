package day22arraylistsdatetime;

import java.util.List;

public class Tekrar01 {
    public static void main(String[] args) {
        //ornek: bir list teki tekrarsız elemanlari konsola yazdiran kodu yaziniz.

        List<Double>price=List.of(2.5,1.25,2.5,3.75,1.25,4.0);
        for (Double   w:  price) {
            if (price.indexOf(w)==price.lastIndexOf(w)){
                System.out.println(w);
            }

        }
        System.out.println("----2----");

        //ornek 2: bir listte tekrarlı eleman olup olmadıgını gosteren kodu yazdırın
        List<Integer> heights=List.of(3,13,3);
        int counter=0;
        for (Integer   w:  heights) {
            if (heights.indexOf(w)!=heights.lastIndexOf(w)){
              counter++;
            }

        }
        if (counter==0){
            System.out.println("tekrarlı eleman yok");
        }else {
            System.out.println("en az 1 tane tekrarlı eleman var");
        }
        System.out.println("------3-----");





    }
}
