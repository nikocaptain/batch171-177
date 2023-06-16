package day26polymorphism;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat myCat=new Cat();
        myCat.eat();
        myCat.drink();
        myCat.create();
        Cat cat=new Cat();
        cat.meow();
        cat.drink();
        cat.eat();
        System.out.println(cat.add(5, 8));


    }
}
