package day04_scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //utill:faydalı demek java da bulunan library lerden bir tanesi.
        //scanner class:kullanıcıdan değer alıp içeriye YAZDIRIr

        //ornek 1:kullanıcıdan adını soyadını alıp ikisini ayni satirda yazdırınız.

        //1. adım scanner classtan bir obje oluşturunuz.
        //system.in=dışarıdan içeriye yazdır demek.

        Scanner input= new Scanner(System.in);
        //kullanıcıyı ne istediğimize dair bilgilendirme mesajı

        System.out.println("ilk isminizi giriniz");
        //next() methodu kullanıcıdan "tek kelimeli string" almak için kullanılır
        //3. adım:uygun methodu kullanarak kullanıcını verdiği datayı memory 'e yerleştiriniz.
        String firstname=input.next();
        System.out.println("soy isminizi giriniz");
        String lastname =input.next();
        System.out.println(firstname+ " " +lastname);



    }
}
