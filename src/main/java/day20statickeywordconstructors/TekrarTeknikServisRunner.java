package day20statickeywordconstructors;

public class TekrarTeknikServisRunner {
    public static void main(String[] args) {
        System.out.println("TeknikServis.servisName = " + TekrarTeknikServis.servisName);//static class variable
        TekrarTeknikServis.sorunCozme();//static class variable
        TekrarTeknikServis tnk=new TekrarTeknikServis();
        System.out.println("tnk.yas = " + tnk.yas);//non-static object variable
        TekrarTeknikServis tnk1=new TekrarTeknikServis();//non-static object variable
        tnk1.hiz();//non-static object variable
    }
}
