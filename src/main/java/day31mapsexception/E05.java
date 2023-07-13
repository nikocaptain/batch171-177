package day31mapsexception;

public class E05 {
    public static void main(String[] args) {
        int a=12;
        int b=1;
        String s="Java";
        getCharFromString(s,a,b);
    }

    public static void getCharFromString(String s,int a,int b){

        try {
            int idx=a/b;
            char ch=s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");
        }

        /*
        try kısmında birden fazla exception olusturma ihtimali varsa toplu catch kullanabilirsiniz.
        toplu catch kullandıgınızda exceptionlar arasında parent child ilişkisdi yoksa catchlerin sırası onemli degildir.
        Ama koddaki siralamaya uymak tavsiye edilir.

        toplu catch kullandıgınızda exceptionlar arasında parent child ilişkisi varsa catchlerin sırası onemlidir
        child olan class ustte olmalıdır
         */

    }
}
