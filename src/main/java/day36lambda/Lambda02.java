package day36lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) throws IOException {
        //Example 1: verilen text file icindeki text i console a yazdiran kodu yaziniz.

        Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //lines:Dosya içindeki satırları stream'e çeviriyor

        //Example 2: Verilen text file içindeki text i buyuk harflerle konsola yazdirin

        Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Exanmple 3: Verilen text file içindeki textlerde "get" kelimesinin olup olmadıgını komtrol eden kodu yaziniz.

       boolean result1= Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).anyMatch(t->t.contains("get"));
        System.out.println(result1);//true

        //Example 4: Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.

       List<String> words= Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}","").split(" ")).
                flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(words);


        //"flatMap()" methodu ile streamde array formatinda olan kelimeler, normal kelimelere ceviriliyor

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.

      long numOfLetters=  Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).
                map(t->t.replaceAll("[^a-zA-Z]","").split("")).flatMap(Arrays::stream).count();
        System.out.println(numOfLetters);//1656

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
//           icinde return eden kodu yaziniz.

      List<String> letters=  Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).
                map(t->t.replaceAll("[^a-zA-Z]","").split("")).
              flatMap(Arrays::stream).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(letters);


    }
}
