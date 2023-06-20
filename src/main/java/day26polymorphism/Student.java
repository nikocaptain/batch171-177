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

    /*
    Encapsulation yaptigimiz datayi istersek diger classlardan nasil degistirebiliriz?
    "set method" olusturarak Encapsulate edilmis datanin degerini degistirecek
    1)set methodlar public olur
    2)set methodların return type'ları hep void olur
    3)set methodlar parametre kullanır.Parametrenin data type'i variable ile ayni olur

    NOT 1: set Method kullanarak varolan object uzerinde degisiklikler yaparak o object'i sanki yeni bir
    object'mis gibi kullanabiliriz

    NOT 2:get  methodların diğer adı getter, set methodların diğer adi setter'dır
            getter ve setter larin ikisine birden "Java Beans" denir.
     */

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
