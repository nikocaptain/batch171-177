package day30maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TekrarHashMap01 {
    public static void main(String[] args) {
        //Map nasıl oluşturulur
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);

        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000}

        // get() methodu key ile çalışır value kısmını verir.key yoksa null verir.
        System.out.println(countryPopulation.get("Germany"));//83000000

        //butun keyleri nasıl alabiliriz==>keyset() ile
        Set<String> a = countryPopulation.keySet();
        System.out.println(a);//[Netherland, USA, Turkey, Germany, Albania]

        //butun value ları nasıl alabiliriz==>values()
        Collection<Integer> b=countryPopulation.values();
        System.out.println(b);//[18000000, 400000000, 83000000, 83000000, 3000000]

        //Ornek countrypopulation map indeki nufusların ortalamnası nedir.

        int sum=0;
        for (Integer w:b) {
            sum+=w;
        }
        int ortalama=sum/b.size();
        System.out.println(ortalama);//117400000

        //Loop'lar map ler ile kullanılamaz bunun için entrySet() methodunu kullanırız.
        //entrySet() maptaki entry'leri kalıp halinde alıp bize set'in içine koyarak verir.
        Set<Map.Entry<String,Integer>> entries=countryPopulation.entrySet();
        System.out.println(entries);//[Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]

        //Ornek 2: countrypopulation map indeki ulkelerin karakter sayilarını ve nufuslarının toplamını bulunuz.

        int toplam=0;
        for (Map.Entry<String,Integer> w:entries) {
            toplam+=w.getKey().length() +w.getValue();
        }
        System.out.println(toplam);//587000033


    }
}
