package day30maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
        //hash dersek ==> benzersiz ıd oluşturma tekniği
        //map dersek ==> sözlük aklımıza gelsin

        /*
        1)Map lerde sözlüklerdeki gibi kelime ve manası şeklinde bir kullanım vardır.
        2)Key kısmı tekrarsızdır,Value kısmı tekrarlı olabilir.
        3)Map lerdeki her bir elemana entry(key,value) denilir,tamamına entrySet denir
        4)entry ler tekrarsız oldugu için entrySet denir.
        5)key ve value'lar ayrı ayrı data type larında olabilir.
        6)Map'ler collection değildir farklı bir yapıdır.
        7)HaspMap ler entry leri rastgele sıralar bu yuzden en hızlı map tir.
         */

        //Map nasıl oluşturulur

        HashMap<String,Integer> countryPopulation=new HashMap<>();
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania",3000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkey",83000000);
        countryPopulation.put("Netherland",18000000);
        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=30000000}

       // get() methodu key ile çalışır value kısmını verir.
        Integer usaPopulation=countryPopulation.get("USA");
        System.out.println(usaPopulation);//400000000

        //butun keyleri nasıl alabiliriz==>keyset() ile
       Set<String> keys= countryPopulation.keySet();
       System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

        //butun value ları nasıl alabiliriz==>values()
       Collection<Integer> value= countryPopulation.values();
        System.out.println(value);//[18000000, 400000000, 83000000, 83000000, 30000000]

        //Ornek countrypopulation map indeki nufusların ortalamnası nedir.

        Collection<Integer> values= countryPopulation.values();
        int sum=0;
        for (Integer w:values) {
            sum=sum+w;

        }
        System.out.println(sum/values.size());//117400000

        //Loop'lar map ler ile kullanılamaz bunun için entrySet() methodunu kullanırız.
        //entrySet() maptaki entry'leri kalıp halinde alıp bize set'in içine koyarak verir
        Set<Map.Entry<String,Integer>> entries= countryPopulation.entrySet();
        System.out.println(entries);//[Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]

        //Ornek 2: countrypopulation map indeki ulkelerin karakter sayilarını ve nufuslarının toplamını bulunuz.

        int toplam=0;
        for (Map.Entry<String,Integer> w:entries) {
           toplam=toplam+ w.getKey().length()+w.getValue();

        }
        System.out.println(toplam);//587000033


    }
}
