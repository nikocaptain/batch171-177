package day25inheritance;

public class TekrarAnimalRunner {
    public static void main(String[] args) {
        TekrarCat cat=new TekrarCat();
        TekrarDog dog=new TekrarDog();
        TekrarBird bird=new TekrarBird();
        cat.eat();
        cat.drink();
        cat.meow();
        dog.eat();
        dog.drink();
        dog.bark();
        bird.eat();
        bird.drink();
        bird.tweet();
       int a= bird.sayi;
        System.out.println(a);
    }
}
