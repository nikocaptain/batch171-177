package day33exceptionsenumsiterator;

public class ExceptionRunner {

    /*
    Garbage collector memory i temiz tutmak için memory i devamlı tarar ve silinmesi gerekenleri siler
    Garbage collector silmeden once silecegi datalari finalize eder sonra siler.

     */
    public static void main(String[] args) throws InvalidStudentGradeException {
    getStudentGrade(50);
    //getStudentGrade(-50);//InvalidStudentGradeException
        getTheNumberofStudents(50);//50
        //getTheNumberofStudents(-50);//InvalidNumberException
    }


    public static void getTheNumberofStudents(int numofStudents){
        if (numofStudents<0){
            throw new InvalidNumberException("Student number cannot be negative");
        }else {
            System.out.println(numofStudents);
        }
    }

    public static void getStudentGrade(int grade) throws InvalidStudentGradeException {
        if (grade<0||grade>100){
            throw new InvalidStudentGradeException("Students grades cannot be less than zero or greater than 100");

        }else {
            System.out.println(grade);
        }
    }
}
