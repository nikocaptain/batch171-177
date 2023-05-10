package day05ConcatinationOperatorsTypecasting;

public class Operators {

    /*
    1)+,-,*,/ işlemleri java da matematikte kullanıldığı gibi kullanılır.
    note 1: int/int==>int olur
    note 2: double+int==>double olur
    cunku java da matematiksel işlemlerde farklı data type lar kullanılırsa sonuc her zaman buyuk data type olur
    2) java da "logical operator" lar vardır. AND ve OR işlemleri logical operatörlerdir.
      i)AND işleminde true alabilmek için herşey true olmalıdır.
        AND işlemi "perfectionist"tir
        AND işleminde bir tane false sonucu false yapar

      ii) OR işleminde bir tane true sonucu true yapmaya yeter.
      OR işleminde sonucun false olması için herşey false olmalıdır.
      OR işlemi "POLYANNA" gibidir.

      iii)NOT operator(!) true olanı FALSE yapar false olanı TRUE yapar
      !true==>false
      !false==>true
      !!true==>true
      !!false==>false

     3)Comparison(karşılaştırma) operatörü
     <,>,>=,<=,==,!=
     NOTE: Karşılaştırma operatörünü kullandığınızda kesinlikle (true veya false) alırsınız
     NOTE: biz AND işlemi için && kullanırız ama & kullnımda geçerlidir
     Farkları nelerdir
     && kullanım da ilk ifade false ise digerlerini kontrol etmez dolayısıyla hızlı calısır. cunku AND işleminde ilk ifade
     false ise diğerlerinin ne oldugunun önemi yoktur.
     & kullanım ilk ifade ne olursa olsun digerlerini de kontrol eder ve dolayısıyla yavas calısır. bu yüzden biz hep && kullanırız.
     */
    public static void main(String[] args) {
       boolean first= 3<5;
        System.out.println(first);//true
        boolean second= 2+3!=5;
        System.out.println(second);//false
        boolean third=2+3*5>=19;
        System.out.println(third);//false
        System.out.println(first && second);//false
        System.out.println(first||second||third);//true
        System.out.println(second && third && first);//false





    }
}
