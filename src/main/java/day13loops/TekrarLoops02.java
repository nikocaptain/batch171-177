package day13loops;

public class TekrarLoops02 {
    public static void main(String[] args) {
        //ornek 1: 21 den 180 e kadar hem  2 hem 3 ile tam bölünebilen tamsayıları ekrana yazdıran kodu yazınız

        for (int i=21;i<180;i++){
            if (i%2==0&&i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");

        //ornek 2:size verilen kucuk harfle yazılmış stringin index i çift sayı olan
        // karakterleri buyuk harfe donuşturunuz
        String s="ankarali";


        for (int i=0;i<s.length();i++){
            if (i%2==0){
               String ch=s.toUpperCase().substring(i,i+1);
                System.out.println(ch);
            }
        }

        //ornek 3: verilen bir String de ilk a harfinden önceki tüm characterler i konsola yazdırınız.

        String str="I love java";
        String st="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){

                break;
            }st=st+str.charAt(i);



        }System.out.print(st);
        System.out.println("");

        //ornek 4:verilen bir string da son 'a' dan sonraki tüm karakterleri ters sırada yazdırın
        //"Germany"==>>yn

        String gr="Germany";
        String grr="";
        for (int i = gr.length()-1; i>=0 ; i--) {
            if (gr.charAt(i)=='m'){
                break;
            }
            grr=grr+gr.charAt(i);

        }
        System.out.print(grr);//yna
        System.out.println("");
        for (int i = grr.length()-1; i >=0 ; i--) {

            System.out.print(grr.charAt(i));
        }
        System.out.println(grr);



    }
}
