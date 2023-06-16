package day26polymorphism;

public class Animal {
    /*
    1)Parent class daki methodu child class içerisinde özelleştirerek kulanmaya overriding denir.
    2)Overriding'de method signuture(method ismi ve parametreler) a dokunulmaz.
    3)private methodlar override edilemezler
    4)child class'taki methodun access modifier 'i parent classdaki override edilmis(overriden Method)
    methodun access modifier'ından dar olamaz.aynısı veya daha genisi olur.
    5)Child classda override edilen methodun return type'i ile parent taki methodun return type i arasinda "IS A Relation ship"
    varsa return type degistirelebilir
    6) Methodun return typei primitive ise Overriding yaparken return type degistirilemez. Cunku return type ya ayni olur veya
    parent tan secilir ama primitiveler arasinda Parent child iliskisi olmadiginidan aynisi olmak zorundadir
    7)child da override edilen methodun return type i ile parent taki methodun return type i arasinda IS A
    Relationship ilişkisi yoksa return typer DEGISTIRILEMEZ. Mesela;
    Integer WRapper classi ile LOng wrapper classi arasinda IS A Relaotionship yoktur o yuzden degistirilemez.
    8) Methodun return type i void ise Overriding yapaken return type degisitirilemez
    9)Static methodlar override edilemezler. Cunku static methodlar tum childler icin ortak methodlardır.Bir child bir
    ortak methodu degistirdiginde diger childler bundan olumsuz etkilenirler. bu yuzden java static methodların
    override edilmesine musade etmezler.
    10)final methodlar override edilemezler.final methodların body si degistirilemez ama override ederken
    method body degistiririz bu yuzden java final methodlarin override edilmesine izin vermez.
        a) final keywordunu variable lar ile kullanabiliriz.
            i)eger variable final ise mutlaka deger atanmalidir
            ii)ilk atanan deger degistirilemez
        b)final keywordunu method lar ile kullanabiliriz.
            i) method final ise body degistirilemez
            ii)degistirilemeyince override yapmak mumkun olmaz
        c)final keywordunu class lar ile kullanabiliriz.
        i)class final ise child i olmaz


   Polymorphism(çokşekilli)=method overloading + method overriding den olusur.


     */
    public void eat(){
        //parent daki override edilmis eat() methoduna Overriden method denir.
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }
    public Animal create(){
        return  new Animal();
    }
    public int add(int a,int b){
        return a+b;
    }
    public Integer multiply(Integer a,Integer b){
        return a*b;
    }

     final int age=13;
    final  double pi=3.14;

    public final double circleArea(double r){
        return  3.14*r*r;
    }


}
