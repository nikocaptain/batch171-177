package day31mapsexception;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        //Hashmap arkasında çalışan mekanizma nasıl?
        HashMap<String,String> captials=new HashMap<>();
        captials.put("USA","Washington");
        captials.put("Italy","Roma");
        captials.put("Turkiye","Ankara");
        captials.put("Italy","Floransa");
        System.out.println(captials);


    }


}
