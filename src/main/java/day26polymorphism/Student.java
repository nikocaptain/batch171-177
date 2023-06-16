package day26polymorphism;

public class Student {

    //Encapsulation==> kapsulleme demektir.variable ve methods lardan olusur yani class lardır

    /*
    Encapsulation nedir? Data Hiding(Veri Saklama)dir
    Data nasil saklanir?
    Access modifier private yapilarak saklanır.diger classlardan gorunmez hale getirilir.
    Encapsulation yaptıgımız datayı diger classlardan istersek okuyabiliriz.
    Nasil okuruz?
    getmethod olusturarak encapsulate edilmis datanın degerini okuyabiliriz.
    1)get methodlar public olur
    2) get methodun return type i okudugu variable in return type i ile aynidir.
    3) get methodu bir boolean variable icin olusturulduysa ismi is ile baslar.
    ornek=>isSuccessful()
     */

    private String stdId="AC202306014";
    public  String stdName="Ali Can";

    public int age=13;

    private double notOrt=3.13;
    private boolean successful=false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccessful() {
        return successful;
    }
}
