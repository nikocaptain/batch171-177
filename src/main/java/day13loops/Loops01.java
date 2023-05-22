package day13loops;

public class Loops01 {
    public static void main(String[] args) {
        //ornek 1: ekrana 5 kere "Hi" yazdırın
        // Tekrar istenen birşey değildir.dynamic olmalı, değişime açık olmalı
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        /*
        Code Standartları
        1) Tekrar(repetition) olmamalıdır
        2)Dnamic olmalıdır
        3)Tamir(Fix) ve update kolay yapılabilmelidir
         */

        //2. yol
        //Ayni adimlar tekrar tekrar yapılmak istendiğinde "loop" lar kullanılır
        //4 adet "LOOP" vardır 1)for-loop 2) while-loop 3) do-while-loop 4) for-each-lop

        //1)for-loop
        /*
        for (Baslangi degeri  ;loop çalısma sarti ; Artirma-Eksiltme ){
            calisacak kodlar
        }

         */
        // i++ =>  i=i+1 => i+=1
        // for (Baslangi degeri  ;loop çalısma sarti ; Artirma-Eksiltme )
        for    (  int i=1        ;    i<6            ;       i++        ){
            System.out.println("Hi");

        }
        //ornek 2: 11 den 14 e kadar tamsayıları ekrana yazdıran kodu ekrana yazdırınız

        for (int i=11;i<15;i++){
            System.out.println(i);

        }
        //ornek 3: 40 dan 23 e kadar tüm çift sayıları ekrana yazdırınız
        for(int i=40;i>22;i--){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //ornek 4:18 den 56 ya kadar olan tek sayıları yazdıran kodu yaziniz
        for(int i=18;i<57;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
