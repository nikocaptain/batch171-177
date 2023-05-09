package day02datatypesmethodcreation;

public class Variables01 {
    public static void main(String[] args) {

        //ornek 1 : sehir ismi icin bir variable olusturun ve once Ankara sonrada Izmir degeri atayip ekrana yazdirin

        String cityname="Ankara";
        System.out.println(cityname);
        cityname="istanbul";
        System.out.println(cityname);

        cityname= "Izmir";
        System.out.println(cityname);
        //ornek 2: sehir plaka kodu icin bir variable olusturun ve once '34' sonrada '35' degeri atayıp ekrana yazdirin

        byte plakakodu= 34;
        System.out.println(plakakodu);
        plakakodu=58;
        System.out.println(plakakodu);

        //ornek 3 basrilimi sorusu icin bir variable olusturun once false sonrada true degeri atayip ekran yazdirin

        boolean isSuccessful= false;
        System.out.println(isSuccessful);
        isSuccessful=true;
        System.out.println(isSuccessful);
        isSuccessful=false;
        System.out.println(isSuccessful);


    }
}
