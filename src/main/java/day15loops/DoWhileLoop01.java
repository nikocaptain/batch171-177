package day15loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        /*while loop kalibi
        baslangic degeri

         while(loop calisma kurali ){

            calisacak kodlar

            artirma/azaltma
         }*/
        /*
        baslangic degeri
                do{
                    calisacak kodlar
                    artirma/azaltma
                }while(loop calisma kurali);
        */

        //ornek 1: 5(dahil) den 3(dahil) e kadar tüm tamsayiları konsola yazdırınız

        int a=5;
        do {
            System.out.println(a);
            a--;

        }while (a>2);

        //1 while-loop

        int i=1;
        while (i<1){
            System.out.println("sen bir while loopsun");
            i++;
        }
        //while loop ta zero execution(hiç çalışmama durumu) mumkundur

        //2 do while loop
        int k=1;
        do {
            System.out.println("sen bir do while loopsun");
            k++;
        }while (k<1);

        //do-while-loop kullanıldığında loop body en az 1 kere calisir, zero execution mumkun degildir.


    }
}
