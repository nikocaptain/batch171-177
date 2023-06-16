package day26polymorphism;

public class Cat extends Animal {
    public void meow(){
        System.out.println("Cats meow...");
    }

    //override annotation Override kurallarının java tarafından kontrol edilmesini sağlar.
    @Override
    public void eat() {
        //child daki override edilmis eat() methoduna Overrideing method denir
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }


    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }



}
