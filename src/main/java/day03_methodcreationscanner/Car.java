package day03_methodcreationscanner;

public class Car {

    //variable lar olusturalım
    public String model = "Tesla";
    public int fiyat = 20000;

    //methodları olusturalım
    //note: "return type" void oldugunda method icinde "return keyword" kullanılmaz

    public void hareket(){
        System.out.println("Tesla cok hizli hareket eder..");
    }

    public void dur(){

        System.out.println("cok guvenli bir sekilde durur..");
    }
}
