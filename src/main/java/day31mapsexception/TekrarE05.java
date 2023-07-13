package day31mapsexception;

public class TekrarE05 {
    public static void main(String[] args) {
        String s="JAVA";
        int a=12;
        int b=0;
        getCharr(s,a,b);
    }

    private static void getCharr(String s,int a,int b) {
        try {
            int idx=a/b;
            char ch=s.charAt(idx);
        } catch (ArithmeticException e) {
            System.out.println("sifira bölemezsin");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String elemani disi sayi kullandin");
        }
    }
}
