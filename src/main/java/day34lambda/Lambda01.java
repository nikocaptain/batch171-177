package day34lambda;

import java.util.*;

public class Lambda01 {
    public static void main(String[] args) {
        /*
        1) Lambda "Functional Programming"dir, digeri "Structured Promramming"
        2)Functional Programming de "Ne Yapilacak"  (What to do)  üzerine yogunlasilir
            "Structured Programming" " Nasil yapilacak" (how to do) uzerine yogunlasilir.
        3) Functional Programming java 8 ile kullanilmaya baslandi.
        4) Functional Programming Collectionlar ve Array'lerde kullanilir
         */

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        printElements1(nums);//12 9 131 14 9 10 4 12 15
        System.out.println();
        printElements2(nums);//12 9 131 14 9 10 4 12 15
        System.out.println();
        printEventElements1(nums);//12 14 10 4 12
        System.out.println();
        printEventElements2(nums);//12 14 10 4 12
        System.out.println();
        printSquareOfOddElements(nums);//81 17161 81 225
        System.out.println();
        printCubeOfDistinctOddElements(nums);//729 2248091 3375
        System.out.println();
        printSumOfSquaresOfDistinctEventElements(nums);//456
        System.out.println();
        printProductOfSquareOfDistinctEventElements(nums);//45158400
        getMaxValue1(nums);//131
        getMaxValue2(nums);//131
        getMaxValue3(nums);//131
        getMinValue1(nums);//4
        getMinValue2(nums);//4
        getMinValue3(nums);//4
        getMinGreaterThanSevenEven(nums);//10


    }
    //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured == Yapisal)

    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }

    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Functional )

    public static void printElements2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));//methodchain==> arka arkaya meyhod zinciri yaptık
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


    //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printEventElements2(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
        //yanyana uzun kodlar best practice değil her bir methodda noktadan sonra enter yapıp alt satıra geçiririz

    }

    //5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printSquareOfOddElements(List<Integer> nums) {
        nums.
                stream().//Akışı başlatır
                filter(t -> t % 2 != 0). //Structure'da if kullanımı gibi
                map(t -> t * t).//map() :Bir Stream de var olan bir elemanı degistirmek icin kullanilir.
                forEach(t -> System.out.print(t + " "));//"Bir streamd'de yer alan her bir eleman için " anlamına gelir
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {
        nums.
                stream().//akışı başlatır
                distinct().//bir stream de bulunan tekrarlayan elemanları kaldırır yalnızca benzersiz elemanları tutar.
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).//map() :Bir Stream de var olan bir elemanı degistirmek icin kullanilir.
                forEach(t -> System.out.print(t + " "));
//        distinct() methodu stream deki elemanlarin tekrarlı elemani kaldirir, benzersiz elemanları kullanır. Stream method undan sonra kullanmak
//        Java'yi yormamak icin best practice dir.
    }

    //7)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin" "toplamını"
    // hesaplayan method oluşturun

    public static void printSumOfSquaresOfDistinctEventElements(List<Integer> nums) {
        Integer sum =
                nums.
                        stream().
                        distinct().
                        filter(t -> t % 2 == 0).
                        map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum);

//        reduce() streamde coklu datanin tek bir dataya indirgenecegi (reduction) zaman kullanilir.
//        identity ==> bu alana etkisiz eleman yazilir
//        t == baslangic(ilk) degerini identity den alir, sonraki degerlerini action(işlemden) dan alir
//        u == tum degerlerini streamden alir


    }

    //8) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void printProductOfSquareOfDistinctEventElements(List<Integer> nums) {
        Integer product =
                nums.
                        stream().
                        distinct().
                        filter(t -> t % 2 == 0).
                        map(t -> t * t).
                        reduce(1, (t, u) -> t * u);
        System.out.println(product);
    }

    //9)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    //1.yol tavsiye edilir
    public static void getMaxValue1(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);//131
    }

    //2. yol
    public static void getMaxValue2(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);//131
    }

    //3. yol
    public static void getMaxValue3(List<Integer> nums) {
        //  Optional<Integer> max= nums.stream().distinct().sorted().reduce((t,u)->u);//optional<> java 8 ile geldi
        Integer max =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce((t, u) -> u).get();//optional<> java 8 ile geldi
        System.out.println(max);//131

        // sorted() methodu, stream ı natural siralamaya gore siralar.
        // get() methodu, Optional <Integer>'i int'e cevirir.
    }

    //4. yol best practice budur
    public static void getMaxValue4(List<Integer> nums) {

        Integer max =
                nums.
                        stream().
                        distinct().
                        //sorted().
                                reduce(Math::max).get();//optional<> java 8 ile geldi
        System.out.println(max);//131
        //:: method refere etme demektir.


    }

    //10)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun

    //1. yol

    public static void getMinValue1(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.println(min);//4
    }

    //2, yol
    public static void getMinValue2(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce((t, u) -> t > u ? u : t).get();

        System.out.println(min);//4
    }

    public static void getMinValue3(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        sorted(Comparator.reverseOrder()).
                        reduce((t, u) -> u).get();

        System.out.println(min);//4
    }

    public static void getMinValue4(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce((t, u) -> Math.min(t, u)).get();

        System.out.println(min);//4
    }

    //11)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
    // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

    public static void getMinGreaterThanSevenEven(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        filter(t -> t > 7 && t % 2 == 0).
                        sorted().//10 ,12 ,12 ,14
                        reduce((t, u) -> t).get();
        System.out.println(min);//10

    }


}
/*
   >map() methodu stream de bulunana her bir elemanda degisiklik yapilacagi zaman kullanilir.
    >filter() methodu stream icerisinde belirli datalari cekmek icin kullanilir
    >stream() methodu listteki elemanlari akis haline getirir. Hafizada yer tutmaz.
    >forEach() methodu streamdeki her elemani alip yazdirmaya yarar.
    >distinct() methodu stream deki elemanlarin tekrarsiz olanlarak kullanmaya yarar. stream den sonra kullanmak
        Java'yi yormamak icin best practice.reduce() streamde coklu datanin tek bir dataya indirgenecegi (reduction) zaman kullanilir.
    >
        identity ==> etkisiz eleman yazilir
        t baslangic degerini identity den alir, sonraki degerlerini action dan alir
        u tum degerlerini streamden alir
        t identity olmadigindan degerini streamden alir u da streamdeki diger degeri alir
        identity kullanmadigimizda Optional veri dondurur.
    >get() methodu Optional <Integer>'i int'e cevirir.
    >Comparator.reverseOrder() methodu sorted yapilan verileri ters cevirir.
    >sorted() methodu parantez icerisinde istenilen siralama methoduna gore siralar.

     */



