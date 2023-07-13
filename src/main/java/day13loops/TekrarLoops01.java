package day13loops;

public class TekrarLoops01 {
    public static void main(String[] args) {
        int a=2;
        for (int i=1;i<7;i++){
            a+=i;
        }
        System.out.println(a);

        String str="java";
        for (int i=0;i<3;i++){
            str=str+"a";

        }
        System.out.println(str);
        //ornek 3: 40 dan 23 e kadar tüm çift sayıları ekrana yazdırınız
        int b=0;
        for (int i=40;i>23;i--){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }

    }
}
