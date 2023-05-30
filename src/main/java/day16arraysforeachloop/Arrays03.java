package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //ornek 1: Integer bir array oluşturunz içine 6 tane eleman yerleştiriniz. bu elemanları en küçüğü ile en büyyüğü toplamı ekrana yazdırınız

        int ages[]=new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]


        //1. yol
        //sort() methodu array deki elemanları kucukten buyuge sıralar
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]
        System.out.println(ages[0]+ages[ages.length-1]);//59

        //2. yol
        int toplam=0;
        int maximum=ages[0];
        int minimum=ages[0];
        for (int w: ages){
           minimum= Math.min(minimum,w);
           maximum=Math.max(maximum,w);
           toplam=minimum+maximum;

        }
        System.out.println(minimum);//15
        System.out.println(maximum);//44
        System.out.println(toplam);//59

        //ornek 2:String bir Array oluşturun 6 eleman ekleyiniz yellow dan önceki elemanları yazdırınız

        String colors[]=new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        for (String w: colors){
            if (w.equals("Yellow")){
                break;
            }
            System.out.println(w);
        }


    }
}
