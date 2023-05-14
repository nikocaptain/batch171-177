package day08stringmanipulationmemoryusageifstatement;

public class Tekrar {
    public static void main(String[] args) {


        //ornek 1: bir stringdeki "java" kelimesinin ilk olarak kacıncı index te kullanıldığını gosteren kodu yazınız.
        //"Ah Java vah Java sensiz olmuyor Java."

        String str = "Ah Java vah Java sensiz olmuyor Java.";
        int ilk=str.indexOf("Java");
        System.out.println("ilk = " + ilk);

    }

}
