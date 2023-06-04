package day19passByValuemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        String name="Tom Hanks";

        System.out.println(addTitle("dr", name));//dr Tom Hanks
        System.out.println(name);//Tom Hanks
        System.out.println(addTitle("DR", name));//DR Tom Hanks


    }
    public static String addTitle(String title,String name){
        name=title+ " " +name;
        return name;

    }
}
