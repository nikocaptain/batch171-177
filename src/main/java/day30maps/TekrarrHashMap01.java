package day30maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TekrarrHashMap01 {
    public static void main(String[] args) {
        HashMap<String ,Integer> country=new HashMap<>();
        country.put("Germany",83000000);
        country.put("Albania",3000000);
        country.put("USA",400000000);
        country.put("Turkey",83000000);
        country.put("Netherland",18000000);

        // get() methodu key ile çalışır value kısmını verir.

        System.out.println(country.get("Germany"));
        System.out.println(country.get("Albania"));

        //butun keyleri nasıl alabiliriz==>keyset() ile
        Set<String> a=country.keySet();
        System.out.println(a);//[Netherland, USA, Turkey, Germany, Albania]

        //butun value ları nasıl alabiliriz==>values()

       Collection<Integer> b = country.values();
        System.out.println(b);//[18000000, 400000000, 83000000, 83000000, 3000000]

        //Ornek countrypopulation map indeki nufusların ortalamnası nedir.
        Collection<Integer> value=country.values();

        int toplam=0;
        for (Integer w:value) {
            toplam=toplam+w;
        }
        Integer ort=toplam/value.size();
        System.out.println(ort);//117400000

       Set<Map.Entry<String,Integer>> entries= country.entrySet();

        System.out.println(entries);

        //Ornek 2: countrypopulation map indeki ulkelerin karakter sayilarını ve nufuslarının toplamını bulunuz.


        int topla=0;
        for (Map.Entry<String,Integer> w:entries) {
          topla=topla+  w.getKey().length()+w.getValue();
        }
        System.out.println(topla);//587000033




    }


}
