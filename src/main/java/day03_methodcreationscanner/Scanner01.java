package day03_methodcreationscanner;

// java nın util kütüphanesinden scanner class import edildi demek. import=ithal etmek
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1. adım: scanner class tan obje olustur.bundan sonra da zaman zaman yapacağız java kütüphanesinden faydalanacağız.

        Scanner input = new Scanner(System.in);

        //2. adım kullanıcıya ne istediğinize dair mesaj veriniz

        System.out.println("Lütfen yaşınızı giriniz");

        //3. adım: uygun methodu kullanarak kullanıcının verdiği datayı memory yerleştiriniz

        byte age =input.nextByte();
        System.out.println("age = " + age);

    }
    }

