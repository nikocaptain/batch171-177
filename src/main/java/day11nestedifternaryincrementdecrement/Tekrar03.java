package day11nestedifternaryincrementdecrement;

public class Tekrar03 {
    public static void main(String[] args) {
        //ornek 3:iki sayının işareti aynı ise bu sayıları carpan işaretleri farklı ise
        //"farklı işaretli sayıları çarpamıyorum" mesajı veren kodu yazınız

        int a=-5;
        int b=-4;

       Object str= a*b>0 ? a*b : "farklı işaretli sayıları çarpamıyorum";
        System.out.println(str);
    }
}
