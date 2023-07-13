package day34lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Tekrar_Lambda01 {
    public static void main(String[] args) {
                /*
        1) Lambda "Functional Programming"dir, digeri "Structured Promramming"
        2)Functional Programming de "Ne Yapilacak"  (What to do)  üzerine yogunlasilir
            "Structured Programming" " Nasil yapilacak" (how to do) uzerine yogunlasilir.
        3) Functional Programming java 8 ile kullanilmaya baslandi.
        4) Functional Programming Collectionlar ve Array'lerde kullanilir
         */

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        printElements1(nums);
        System.out.println();
        printElements2(nums);



    }
    //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured == Yapisal)

    public static void printElements1(List<Integer> nums){
        for (Integer w:nums){
            System.out.print(w+" ");
        }
    }
    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Functional )

    public static void printElements2(List<Integer> nums) {
        nums.stream().forEach(t-> System.out.print(t+" "));//methodchain==> arka arkaya method zinciri yaptık
        //streamm==>bellekte yer tutmaz veriyi yapısını değiştirmeden akışa çevirdi. tabiri caizse alt alta sıralayarak hazır hale getirdi.
        //stream bir veri yapısı değildir bellekte yer tutmaz. nums verisini aldı yapısını değiştirmeden bir akışa çevirir.
    }
    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Structured)


    public static void printEventElements1(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printEventElements2(List<Integer> nums){
        nums.
                stream().
                filter(t->t%2==0).
                forEach(t-> System.out.println(t+" "));

    }

    //5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printSquareOfOddElements(List<Integer> nums){
        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t+" "));
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> nums){
        nums.
                stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.println(t+" "));
    }

    //7)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin" "toplamını"
    // hesaplayan method oluşturun

    public static void printSumOfSquaresOfDistinctEventElements(List<Integer> nums){
      Integer sum=
              nums.
                      stream().
                      distinct().
                      filter(t->t%2==0).
                      map(t->t*t).
                      reduce(0,(t,u)->t+u);
        System.out.println(sum);
    }

    //8) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void printProductOfSquareOfDistinctEventElements(List<Integer> nums){
      Integer product=
              nums.
                      stream().
                      distinct().
                      filter(t->t%2==0).
                      map(t->t*t).
                      reduce(1,(t,u)->t*u);
        System.out.println(product);
    }

    //9)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    //1. yol

    public static void getMaxValue1(List<Integer> nums){
      Integer max=
              nums.
                      stream().
                      distinct().
                      reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);
    }

    //2. yol

    public static void getMaxValue2(List<Integer> nums){
     Integer max=
             nums.
                     stream().
                     distinct().
                     reduce(nums.get(0),(t,u)->t>u?t:u);
    }

    //3. yol

    public static void getMaxValue3(List<Integer> nums){
      Integer max=
              nums.
                      stream().
                      distinct().
                      sorted().
                      reduce((t, u)->u).
                      get();
    }

    //4. yol

    public static void getMaxValue4(List<Integer> nums){
       Integer max=
               nums.
                       stream().
                       distinct().
                       //sorted().
                       reduce(Math::max).
                       get();
    }

    //10)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun

    //1. yol

    public static void getMinValue1(List<Integer> nums){
       Integer min= nums.stream().distinct().reduce(Math::min).get();
    }

    //2. yol

    public static void getMinValue2(List<Integer> nums){
      Integer min=
              nums.
                      stream().
                      distinct().
                      reduce(nums.get(0),(t,u)->t<u?t:u);
    }

    //3. yol
    public static void getMinValue3(List<Integer> nums){
       Integer min=
               nums.
                       stream().
                       distinct().
                       sorted().
                       reduce((t,u)->t<u?t:u).
                       get();
    }

    //4.yol

    public static void getMinValue4(List<Integer> nums){
      Integer min=
              nums.
                      stream().
                      distinct().
                      reduce(Integer.MAX_VALUE,(t,u)->t>u?u:t);
    }









}
