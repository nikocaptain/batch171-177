package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {


        //ornek
        int a = 10;
        int b = 20;

        int r1 = b<a ? a++ : ++b;
        System.out.println(r1);//21
        System.out.println(a);//10
        System.out.println(b);//21

        //ornek 2: verilen bir sayının mutlak degerini hesaplayan kodu yazınız

        int c=-4;
       int r2= c<0 ? -1*c : c ;
        System.out.println(r2);
        int c1=4;
        int r21= c1<0 ? -1*c1 : c1 ;
        System.out.println(r21);

        //ornek 3:iki sayının işareti aynı ise bu sayıları carpan işaretleri farklı ise
        //"farklı işaretli sayıları çarpamıyorum" mesajı veren kodu yazınız

        int m=5;
        int n=-6;

        Object r3=(m>0 && n>0) || (m<0&&n<0) ?  m*n  : "farklı işaretli sayıları çarpamıyorum";
        System.out.println(r3);

        Object r4 =m*n>0 ?  m*n  : "farklı işaretli sayıları çarpamıyorum";
        System.out.println(r4);

        //ornek 4: size verilen sayının 3 basamaklı olup olmadığını kontrol eden kodu yazınız.

        int p=-125;
        p=Math.abs(p);

        String str=p>99&&p<1000  ?  "3 basamaklıdır... "  :" 3 basamaklı değildir...";
        System.out.println(str);



    }
}
