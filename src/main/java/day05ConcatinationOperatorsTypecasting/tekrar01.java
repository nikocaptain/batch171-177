package day05ConcatinationOperatorsTypecasting;

public class tekrar01 {
    public static void main(String[] args) {
        int x='a';

        System.out.println("a nin ascii degeri   :  "+x);//97

        //ornek 2: size String olarak verilen iki fiyatın toplamını ekrana yazdırınız.
        String tv="5000";
        String robot="7500";
        int totalprice=Integer.valueOf(tv)+Integer.valueOf(robot);
        System.out.println("totalprice = " + totalprice);//12500

        boolean first=21<25;
        System.out.println("first = " + first);//true
        boolean second =10==11;
        System.out.println("second = " + second);//false
        boolean third= 28>15;
        System.out.println("third = " + third);//true

        boolean fourth=first&&second&&third;
        System.out.println("fourth = " + fourth);//false
        boolean fifth=first||second||third;
        System.out.println("fifth = " + fifth);//true

        String tvv="7000";
        int aa=Integer.valueOf(tvv);
        System.out.println(aa);
        String aaa="melek";
        int mm=234;
        System.out.println(aaa+mm);


    }
}
