package day32xceptions;

public class E01 {
    /*
    1- run button una bastıktan sonra console da alinan Exceptionlara "Runtime Exception" denir.
        AritmeticException,NullPointerException,NumberFormatException,ArrayIndexOutofBoundsException,
        StringIndexOutofBoundsException...RunTime Exception lara ornektir.
        RunTime Exceptionlara Unchecked Exception da denir.

    2-code yazarken kirmizi alt cizgi seklinde alinan Exception lar da vardir, bunlara da "Compile Time Exception" denir
        FileNotFoundException,IOException compile time exception lara ornektir.
     */
    public static void main(String[] args) {
        String s="Java";
        getNumberofChars(s);//4

         String t="";
        getNumberofChars(t);//0

        String u=null;
        getNumberofChars(u);//0

        //String in degeri "null" oldugunda String class daki bazı methodlari kullanmaya çalışırsanız
        // java "NullPointerException" fırlatır.





    }

    public static void getNumberofChars(String s){
        try{
            int numofChars= s.length();
            System.out.println("numofChars = " + numofChars);
        }catch ( NullPointerException e){
            System.out.println("null degeri için bazi methodlar kullanilamaz");
        }

    }
}
