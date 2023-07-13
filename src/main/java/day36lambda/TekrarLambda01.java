package day36lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TekrarLambda01 {
    public static void main(String[] args) {
        Course courseTurkishDay=new Course("Summer","Turkish day",97,128);
        Course courseTurkishNight=new Course("Winter","Turkish Night",98,155);
        Course courseEnglishDay=new Course("Spring","English day",95,132);
        Course courseEnglishNight=new Course("Winter","English Night",93,144);

        List<Course> courseList=new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);

        //System.out.println(courseList);

        //1)Tum "averageScore"larin 91 den buyuk olup olmadıgını kontrol kodu yaziniz
       boolean result1= courseList.stream().allMatch(t->t.getAvarageScore()>91);
        System.out.println(result1);//true

        //2) kurs isimlerinden en az birini "Turkish" içerip içermediğini kontrol eden kodu yaziniz.

       boolean result2= courseList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result2);//true

        //3) kurs dönemleri içinde "Fall" doneminin hiç bulunmadıgıni kontrol eden kodu yaziniz.
       boolean result3= courseList.stream().noneMatch(t->t.getSeason().contains("Fall"));
        System.out.println(result3);//true

        //4) Avarage score'u en yüksek olan kursun ismini console a yazdiran kodu yaziniz.
       String name= courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore).reversed()).findFirst().get().getCourseName();
        System.out.println(name);//Turkish Night

        //5)Tüm course objelerinin avarage score a gore kucukten buyuge diziniz ve ilk ikisi hariç liste halinde yazdiriniz

       List<Course> myList= courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).skip(2).collect(Collectors.toList());
        System.out.println(myList);

        //6)Tüm course objelerinin avarage score larina göre kucukten buyuge diziniz ve ilk ucunu liste halinde yazdiriniz.

       List<Course> mylist2= courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).limit(3).collect(Collectors.toList());
        System.out.println(mylist2);

        //7)kursta bulunan ogrerci sayilarina gore buyukten kucuge sırali bir şekilde list içinde veren kodu yaziniz

       List<Course> myList3= courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).collect(Collectors.toList());
        System.out.println(myList3);

        //8)kursta bulunan ingilizce bolumlerinin sayisini veren kodu yaziniz
       long ingilizceKursSayisi= courseList.stream().filter(t->t.getCourseName().contains("English")).count();
        System.out.println(ingilizceKursSayisi);//2

        //9 Ogrenci sayisi 140 tan az olan kurslari bir liste halinde veren kodu yaziniz

       List<Course> myList4= courseList.stream().filter(t->t.getNumberOfStudents()<140).collect(Collectors.toList());
        System.out.println(myList4);


    }


}
