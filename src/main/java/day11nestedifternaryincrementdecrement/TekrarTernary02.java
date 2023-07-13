package day11nestedifternaryincrementdecrement;

public class TekrarTernary02 {
    public static void main(String[] args) {
        //ornek 2: verilen bir sayının mutlak degerini hesaplayan kodu yazınız

        int num=6;

        int mutlakDeger=num<0?num*-1:num;

        System.out.println(mutlakDeger);

        //ornek 3:iki sayının işareti aynı ise bu sayıları carpan işaretleri farklı ise
        //"farklı işaretli sayıları çarpamıyorum" mesajı veren kodu yazınız

        int num1=-10;
        int num2=20;
       String isaret= num1*num2>0? String.valueOf(num1*num2) :"farklı işaretli sayiları carpamıyorum";

        System.out.println(isaret);

        //ornek 4: size verilen sayının 3 basamaklı olup olmadığını kontrol eden kodu yazınız.

        int num3=-999;
       num3= Math.abs(num3);

       String result= num3>=100&&num3<1000?"sayi 3 basamaklidir":"sayi 3 basamakli degildir";

        System.out.println(result);
    }


}
