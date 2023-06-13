package day19passByValuemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        String name="Tom Hanks";

        System.out.println(addTitle("dr", name));//dr Tom Hanks
        System.out.println(name);//Tom Hanks
        System.out.println(addTitle("DR", name));//DR Tom Hanks
        String str=addTitle("muhendis",name);
        System.out.println(str);
        System.out.println(name);


    }
    public static String addTitle(String unvan,String name){
        name=unvan+ " " +name;
        return name;

    }
}
