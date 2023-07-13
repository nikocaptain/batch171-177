package day33exceptionsenumsiterator;

public class TekrarExceptionRunner {
    public static void main(String[] args) throws TekrarInvalidStudentGradeException {
        getStudentGrade(50);
        getStudentGrade(25);
        getTheNumberofStudent(1307);
        getTheNumberofStudent(1450);

    }

    public static void getStudentGrade(int grade) throws TekrarInvalidStudentGradeException {
        if (grade<0||grade>100){
            throw new TekrarInvalidStudentGradeException("0-100 arasında sayi gir");
        }else {
            System.out.println(grade);
        }

    }
    public static void getTheNumberofStudent(int numofStudent){
        if (numofStudent<0){
            throw new TekrarInvalidNumberException("ögrenci sayisi negatif olamaz");
        }else {
            System.out.println(numofStudent);
        }
    }
}
