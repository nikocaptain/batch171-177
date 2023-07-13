package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
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

        //1)Tum "averageScore"larin 91 den buyu olup olmadıgını kontrol kodu yaziniz

       boolean result1= courseList.stream().allMatch(t->t.getAvarageScore()>91);
        System.out.println(result1);//true

        //allMatch()--> :Verilen şarta göre stream icindeki tüm elemanlarin bu sarta uymasi durumunda true verecektir.mükemmelliyetçi
        //bir tane bile şart saglanmaz ise sonuc false verir.

        //2) kurs isimlerinden en az birini "Turkish" içerip içermediğini kontrol eden kodu yaziniz.

       boolean result2= courseList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result2);//true

        //"anyMath()" methodu stream'de bulunan data'larda herhangi bir degerin eslesmesi durumunda true verir.polyannacı

        //3) kurs dönemleri içinde "Fall" doneminin hiç bulunmadıgıni kontrol eden kodu yaziniz.

       boolean result3= courseList.stream().noneMatch(t->t.getSeason().contains("Fall"));
        System.out.println(result3);//true

        //noneMatch() : Verilen şarta göre stream içindeki hiçbir elemanın şarti saglamamasi durumunda true verir.

        //4) Avarage score'u en yüksek olan kursun ismini console a yazdiran kodu yaziniz.

       String name1= courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore).reversed()).findFirst().get().getCourseName();
        System.out.println(name1);


        //5)Tüm course objelerinin avarage score a gore kucukten buyuge diziniz ve ilk ikisi hariç liste halinde yazdiriniz

       List<Course> myList= courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).skip(2).collect(Collectors.toList());
        System.out.println(myList);//[Course{season='Summer', courseName='Turkish day', avarageScore=97, numberOfStudents=128},
        // Course{season='Winter', courseName='Turkish Night', avarageScore=98, numberOfStudents=155}]


        //6)Tüm course objelerinin avarage score larina göre kucukten buyuge diziniz ve ilk ucunu liste halinde yazdiriniz.

        List<Course> myList2= courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).limit(3).collect(Collectors.toList());
        System.out.println(myList2);//[Course{season='Winter', courseName='English Night', avarageScore=93, numberOfStudents=144},
        // Course{season='Spring', courseName='English day', avarageScore=95, numberOfStudents=132},
        // Course{season='Summer', courseName='Turkish day', avarageScore=97, numberOfStudents=128}]


        //7)kursta bulunan ogrerci sayilarina gore buyukten kucuge sırali bir şekilde list içinde veren kodu yaziniz

       List<Course> yourList=courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).collect(Collectors.toList());
        System.out.println(yourList);//[Course{season='Winter', courseName='Turkish Night', avarageScore=98, numberOfStudents=155},
        // Course{season='Winter', courseName='English Night', avarageScore=93, numberOfStudents=144},
        // Course{season='Spring', courseName='English day', avarageScore=95, numberOfStudents=132},
        // Course{season='Summer', courseName='Turkish day', avarageScore=97, numberOfStudents=128}]

        //8)kursta bulunan ingilizce bolumlerinin sayisini veren kodu yaziniz

       long ingilizceBolumSayisi= courseList.stream().filter(t->t.getCourseName().contains("English")).count();
        System.out.println(ingilizceBolumSayisi);//2

        //9 Ogrenci sayisi 140 tan az olan kurslari bir liste halinde veren kodu yaziniz

       List<Course> myList3= courseList.stream().filter(t->t.getNumberOfStudents()<140).collect(Collectors.toList());
        System.out.println(myList3);//[Course{season='Summer', courseName='Turkish day', avarageScore=97, numberOfStudents=128},
        // Course{season='Spring', courseName='English day', avarageScore=95, numberOfStudents=132}]





    }
}
