package day25inheritance;

public class TekrarCar extends TekrarVehicle {

    public TekrarCar(){
        this("lk");
        System.out.println("Car 1");
    }
    public TekrarCar(String make){
        super();
        System.out.println("Car 2");
    }
}
