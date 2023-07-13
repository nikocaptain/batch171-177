package day32xceptions;

public class E02 {
    public static void main(String[] args) {
        //Birbirine dönüştürülemeyecek dat type larını dönüştürmekte ısrar ederseniz "ClassCastException" atar.
        Object obj=70;


        try {
            String str=(String) obj;
            System.out.println(str);
        } catch (ClassCastException e) {

            System.err.println("Her data type i her data type ina ceviremezsin");//istersek out yerine err yazarız output kırmızı renk olur
        }
    }
}
