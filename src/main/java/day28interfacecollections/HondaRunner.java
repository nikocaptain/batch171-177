package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCİvic=new Civic();
        myCİvic.cool();//Civic cools perceftly
        myCİvic.run();//AC runs super
        myCİvic.eco();//Uses gas less
        Engine.stop();//Stops securely


        Accord myAccord=new Accord();
        myAccord.cool();//Accord cools super
        myAccord.run();//Engine runs super
        System.out.println("Ac.price = " + Ac.price);//Ac.price = 2000
        System.out.println("Engine.price = " + Engine.price);//Engine.price = 3000
        System.out.println("Security.price = " + Security.price);//Security.price = 5000


    }
}
