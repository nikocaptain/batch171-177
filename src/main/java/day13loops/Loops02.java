package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        //ornek 1: 21 den 180 e kadar hem  2 hem 3 ile tam bölünebilen tamsayıları ekrana yazdıran kodu yazınız
        for(int i=21;i<181;i++){
            if(i%2==0&&i%3==0){
                System.out.print(i+" ");

            }

        }
        System.out.println("");
        //ornek 2:size verilen kucuk harfle yazılmış stringin index i çift sayı olan
        // karakterleri buyuk harfe donuşturunuz
        String s="ankarali";
        for(int i=0;i<s.length();i++){
            if (i%2==0){
                System.out.println(s.toLowerCase().charAt(i));
            }

        }
        for(int i=0;i<s.length();i++){
            if (i%2==0){
                String ch=s.toUpperCase().substring(i,i+1);
                System.out.println(ch);
            }

        }
        //ornek 3: verilen bir String de ilk a harfinden önceki tüm characterlr i konsola yazdırınız.

        String s1="I Love Java";
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)=='a'){
                break;
            }
            System.out.print(s1.charAt(i));

        }
        System.out.println("");
        //ornek 4:verilen bir string da son 'a' dan sonraki tüm karakterleri ters sırada yazdırın
        //"Germany"==>>yn
        String t="Germany";
        for (int i=t.length()-1;i>=0;i--){
            if (t.charAt(i)=='a'){
                break;
            }

            System.out.print(t.charAt(i));

        }

    }
}
