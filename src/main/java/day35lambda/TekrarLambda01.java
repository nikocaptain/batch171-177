package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TekrarLambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        printElementsExceptStartsWithE(myList);
        System.out.println();
        printDistinctElementsLengthLessThanFive(myList);
        System.out.println();
        System.out.println(getElementsLengthMoreThanFiveWithUpperCase(myList));
        printElementsLengthLessThanFiveUniqueWithLowerCase(myList);
        System.out.println();
        printElementsLengthLessThanFiveUniqueWithLowerCase2(myList);
        System.out.println();
        printElementsUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElementsUniqueLowerCaseSortedWithLength(myList);

    }
    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.

    public static void printElementsExceptStartsWithE(List<String> myList){
        myList.
                stream().
                filter(t->!t.startsWith("E")).
                forEach(t-> System.out.print(t+" "));
    }

    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari
    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.

    public static void printDistinctElementsLengthLessThanFive(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                forEach(t-> System.out.print(t+" "));
    }

    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari buyuk
    // harflerle bir listin icinde veren method'u olusturunuz.

    public static List<String> getElementsLengthMoreThanFiveWithUpperCase(List<String> myList){
       return myList.
               stream().
               filter(t->t.length()<5).
               map(t->t.toUpperCase()).
               collect(Collectors.toList());//collect() stream de bulunan dataları list e cevirir.
    }
    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.

    public static void printElementsLengthLessThanFiveUniqueWithLowerCase(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                sorted().
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t+" "));
    }
    //2. yol
    //best practice budur

    public static void printElementsLengthLessThanFiveUniqueWithLowerCase2(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                sorted().
                map(String::toLowerCase).
                forEach(t-> System.out.print(t+" "));
    }

    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.

    public static void printElementsUniqueToUpperCaseSorted(List<String> myList){
        myList.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(t-> System.out.print(t+" "));
    }

    //Example 6: Bir list'teki elemanları tekrarsız olarak küçük harflerle
    // uzunluklarına göre küçükten büyüğe sıralayarak console'a yazdıran methodu oluşturunuz.

    public static void printElementsUniqueLowerCaseSortedWithLength(List<String> myList){
        myList.
                stream().
                distinct().
                map(String::toLowerCase).//ClassName::methodName==> method reference
                sorted(Comparator.comparing(String::length)).//istedigimizz sekilde siralama yaptik
                forEach(Utils::printInTheSameLineWithSpace);
    }





}
