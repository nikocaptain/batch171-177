package day23datetimevarargs;

public class TekrarVarargs01 {
    public static void main(String[] args) {
        add(2,6,8,4);
    }


    public static void add(int... a){
        int toplam=0;
        for (int w:a) {
            toplam=toplam+w;
        }
        System.out.println("toplam = " + toplam);
    }
}
