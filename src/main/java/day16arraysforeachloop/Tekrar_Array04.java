package day16arraysforeachloop;

public class Tekrar_Array04 {
    public static void main(String[] args) {
        //ornek 2:String bir Array oluşturun 6 eleman ekleyiniz yellow dan önceki elemanları yazdırınız

        String colors[]=new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        for (String w : colors){
            if (w.equals("Yellow")){
                break;
            }
            System.out.println(w);

        }


    }
}
