package day25inheritance;

public class TekrarHonda extends TekrarCar {
    public TekrarHonda() {
        this("kj", 45);
        System.out.println("Honda 1");
    }

    public TekrarHonda(String make, int year) {
        this(34);
        System.out.println("Honda 2");
    }
    public TekrarHonda(int age){
        super();
        System.out.println("Honda 3");
    }
}
