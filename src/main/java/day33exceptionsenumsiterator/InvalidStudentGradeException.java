package day33exceptionsenumsiterator;

public class InvalidStudentGradeException extends Exception {

    public InvalidStudentGradeException(String message){
        super(message);

    }

    /*
    1-Custom Exception Class olusturmak icin Exception class a extend etmeliyiz
        Exception class a extend ederek olusturdugumuz Custom Exception "Compile Time Exception" olur.
        Eger Runtime Exception uretmek istersek o zaman da Runtime Exception classa extend etmeliyiz.

    2- Custom Exception Class olusturuken constructor olusturmaliyiz ve
        bu constructor parent taki constructor ı cagirmalidir.
        Bu message constructor mesaj verecek veya vermeyecek şekilde olusturulacaktir.

    3-Custom Exception Class olusturdugumuzda ismin sonunda Exception kelimesini kullanmalisiniz.
     */

}
