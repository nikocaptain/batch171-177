package day20statickeywordconstructors;

public class CarRunner {
    public static void main(String[] args) {
        //siz kendi constructor'inizi olusturdugunuzda java default constructor'ı siler
        Car c1=new Car("BMW","M4",2023,false);
        Car c2=new Car("AUDI","R8",2022,true);
        Car c3=new Car("Honda","Civic",1999,false);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        Car c4=new Car("Mercedes","C300");
        System.out.println("c4 = " + c4);
        Car c5=new Car("Hyundai",2015);
        System.out.println("c5 = " + c5);


    }
}
