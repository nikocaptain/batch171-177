package day03_methodcreationscanner;

public class runner {
    public static void main(String[] args) {
        //obje nasıl olusturulur

        //"new" keyword sıfırdan yeni bir obje olusturmak icin kullanılır.
        //conctructor(bakkal amca) java da objeleri olusturmak icin kullanılan ozel bir method dur
        //class ismi + obje ismi + assignment operator + "new"  keyword + constructor
        Car myCar = new Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);
        myCar.hareket();
        myCar.dur();
        myCar.dur();
        System.out.println("myCar.fiyat = " + myCar.fiyat);







        //homework
        //icinde isim ve yas variable lari ile teach methodu bulunan teacher objesi olusturun ve obje uzerinde bu ozellikleri kullanın


    }
}
