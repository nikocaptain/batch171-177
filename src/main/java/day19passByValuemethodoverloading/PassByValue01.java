package day19passByValuemethodoverloading;

public class PassByValue01 {
    //java passByValue dan dolayı daha çok tercih edilir.
    //passByValue: methodlarda orjinal degeri korur kopya deger olusturur.
    public static void main(String[] args) {
        //note: java "passByValue" sayesinde variable ların orjinal değerlerini korur

        int shirtPrice=100;
        discount("student",shirtPrice);
        //java methoda gönderirken orjinal degeri değil kopya degeri gönderir ve değişen deger kopya deger olur.
        System.out.println(discount("student",shirtPrice));//90

        //normalde indirim yaptik discount methodu ile ama buradaki deger hala orjinal
        System.out.println(shirtPrice);//100
        System.out.println(discount("veteran", shirtPrice));//80
        System.out.println("discount(\"senior\",shirtPrice) = " + discount("senior", shirtPrice));//95
        //shirtPrice=discount("veteran",shirtPrice); shirtprice kendimiz değiştirisek orjinal deger artık atadıgımız deger olur
        System.out.println("shirtprice "+shirtPrice);
        System.out.println("shirtPrice: "+shirtPrice);


    }

    //Discount methodu oluşturalim
    public static int discount(String type, int price){
        switch (type){
            case "student":
                price=price-10;
                break;
            case "veteran":
                price=price-20;
                break;
            case "senior":
                price=price-5;
                break;
            default:
                price=price;
        }
        return price;
    }
    /*
    Pass By Value:
    1) Java "pass by value" kullanir
    2) Yani java method larin original degeri degistirmesine musade etmez
    3) Java method lara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi method a yollar.
        Method kopya deger uzerinde degisiklik yapar, boylece original deger korunmus olur.
    4)java esnek bir dildir,istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz
        bakınız line 18..
     Pass By Reference:
    1)pass By reference da methoda referans yollanır.
    2)Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasır ve orjinal degeri değiştirir
    Bu yuzden "C#" gibi pass by reference kullanan dillerde method variable in orjinal degerini degiştir.
     */

}
