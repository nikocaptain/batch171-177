package day26polymorphism;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println("s1.getStdId() = " + s1.getStdId());//s1.getStdId() = AC202306014
        System.out.println("s1.getNotOrt() = " + s1.getNotOrt());//s1.getNotOrt() = 3.13
        System.out.println("s1.isSuccessful() = " + s1.isSuccessful());//s1.isSuccessful() = false

    }
}
