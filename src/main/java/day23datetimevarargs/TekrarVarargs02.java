package day23datetimevarargs;

public class TekrarVarargs02 {
    public static void main(String[] args) {
        //Example 2: Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
        //           Ali Can ==> AC    Kemal Han ==> KH

        ilkharf("Ali Can","Kemal Han","Murat Can");
    }

    private static void ilkharf(String... s) {
        String concat="";
        for (int i=0;i<s.length;i++) {
          concat=concat+ s[i].charAt(0) +s[i].split(" ")[1].charAt(0);
            System.out.println(concat);
            concat="";

        }

    }
}
