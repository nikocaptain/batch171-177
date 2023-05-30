package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a=13;
        //Bu yapinin icinde sadece bir tane data depolanabilir.
        // Ama biz kod yazarken bir yapinin icinde coklui data depolama ihtiyaci hissederiz.
        //Bir yapinin icinde coklu data depolayabilmek icin java Array yapisini olusturmustur.
        //ayni data type'da birden fazla datanin saklandigi yapidir

        String stdNames []=new String[5];
        System.out.println(stdNames);
        Arrays.toString(stdNames);
        System.out.println(Arrays.toString(stdNames));

        //SuperFasttir kullanilacak eleman sayisi belli ise
        // arrayler tercih edilir haftanin gunleri aylar vb gibidatalar icin.
        //Yazdirmak icin herzamanArray.toString(Variable Name) olarak kullanilir sout icinde

        //Array e eleman nasıl eklenir?

        stdNames[0]="Niyazi";
        System.out.println(Arrays.toString(stdNames));
        stdNames[1]="Inci";
        System.out.println(Arrays.toString(stdNames));
        stdNames[2]="Tugba";
        System.out.println(Arrays.toString(stdNames));
        stdNames[3]="Ayla";
        System.out.println(Arrays.toString(stdNames));
        stdNames[4]="Türkiye";
        System.out.println(Arrays.toString(stdNames));

        //Array den spesifik bir elemanı nasıl alırız.
        System.out.println(stdNames[4]);//Türkiye
        System.out.println(stdNames[3]);//Ayla

        //ornek 1:Array deki her elemanın sonuna '!'  işareti koyunuz.
        //length() string lerde method parantezli, array lerde ise parantezsiz yazilir(cunku method degil)
        //  0       1       2       3       4
        //[Ekim, Ailana, Benna, Abdullah, Recep]

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i]+'!');
            
        }
    }
}
