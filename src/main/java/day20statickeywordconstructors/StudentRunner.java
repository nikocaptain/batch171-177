package day20statickeywordconstructors;


public class StudentRunner {
    public static void main(String[] args) {
        //stdName static oldugundan ona ulasmak icin object olusturmadan sadece
        //class ismini kullanmak yetrlidir.
        System.out.println("Student.stdName = " + Student.stdName);//"Tom Hanks"
        System.out.println("Student.stdName = " + Student.stdName);//"Tom Hanks"


        Student std=new Student();
        System.out.println("student.age = " + std.age);//13

        //stdName static oldugundan ona ulasmak icin object olusturmadim.
        //sadece class ismini yazarak ulastik.
        Student std1=new Student();
        System.out.println("std1.age = " + std1.age);//13
        //age non static oldugundan ona ulasmak icin object olusturduk.
        Student std2=new Student();
        System.out.println(std2.age);//13
        System.out.println(Student.stdName);
        Student.staticMethod();

        Student nonStatic=new Student();//ben static methodum
        nonStatic.nonStaticMethod();//Ben Static olmayan methodum
        //object uzerinden de static class member lara ulasabiliriz tıpkı gökteki ay gibi
        //object uzerinden static class member lara ulasmak tavsiye edilmez.

        System.out.println(Student.stdName);//Tom Hanks
        Student.staticMethod();//ben static methodum
        Student nonStatic1=new Student();
        nonStatic1.nonStaticMethod();//Ben Static olmayan methodum
        String str=Student.stdName;
        System.out.println("-----------");
        System.out.println("str = " + str);
        Student.staticMethod();

        Student str1=new Student();
        int str2=str1.age;
        System.out.println("str2 = " + str2);
        Student str3=new Student();

        str3.nonStaticMethod();



    }
}
