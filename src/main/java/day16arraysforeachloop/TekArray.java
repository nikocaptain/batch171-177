package day16arraysforeachloop;

import java.util.Arrays;

public class TekArray {
    public static void main(String[] args) {
        //Ornek: girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden kodu yazınız

        int tekEleman[]=new int[7];
        tekEleman[0]=13;
        tekEleman[1]=124;
        tekEleman[2]=130;
        tekEleman[3]=151;
        tekEleman[4]=78;
        tekEleman[5]=8;
        tekEleman[6]=155;
        System.out.println(Arrays.toString(tekEleman));

            int i=0;
        while( i<tekEleman.length){
            if (tekEleman[i]%2!=0){
                System.out.print(tekEleman[i]+" ");//13 151 155

            }
            i++;
        }


    }
}
