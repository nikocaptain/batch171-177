package day31mapsexception;

public class TekrarE04 {
    public static void main(String[] args) {
        String arr[] = {"J", "A", "V", "A"};
        getElement(arr, 4);
        getElement(arr, 1);//A
    }

    //Araylerde olmayan bir index kullanıldıgında java ArrayIndexOutOfBoundsException fırlatır
    private static void getElement(String[] a, int idx) {
        try {
            String element = a[idx];
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getCause());//null
            System.out.println(e.getMessage());//Index 4 out of bounds for length 4

        }
    }
}
