package day04_scannerwrapper;


public class WrapperClass {
    public static void main(String[] args) {
        //primitive     : char      - boolean - byte - short - int   - long - float -double
        //Wrapper Class : Character - Boolean - Byte - Short -Integer- Long - Float -Double

        //Wrapper class lar non-primitive dir. o yuzden memory de cok yer kaplarlar
        //dolayisiyla sart degilse Wrapper Class kullanmayi tercih etmeyiz


        //n yazip nokta koyarsaniz hic method goremezsiniz cunku primitive ler method icermez
        int n = 12;

        // m yazip nokta koyarsaniz bir cok method gorebilirsiniz cunku wrapper classlar method icerir
        Integer m = 12;


        byte p = 33;
        Byte r = 44;

        //Ornek : short data type inin minimum ve maximum degerlerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);//maxShort = 32767

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);//minShort = -32768

        //ornek 2: int data type nin min degeri ile byte data max degerinin toplamı nedir

        byte maxbyte= Byte.MAX_VALUE;
        System.out.println("maxbyte = " + maxbyte);

        int minint= Integer.MIN_VALUE;
        System.out.println("minint = " + minint);
        System.out.println("ttt  :"+minint+maxbyte);


        //ornek 3: primitive int i wrapper Integer a ceviriniz

        int num=33;
        Integer wrapperNum=num;
        //primitiveden non primitive cevirme islemine "Autoboxing" denir.wrapper sarmalama demektir.
        System.out.println("wrapperNum = " + wrapperNum);
        //ornek 4: wrapper byte ı primitive byte a ceviriniz

        Byte num1=33;
        byte primitivenum= num1;
        System.out.println(primitivenum);

        //nun primitive i primitive cevirmeye "unboxıng" denir.

        //ornek 5 primitive char ı wrapper Character e ceviriniz.

        char k='a';
        Character Wrapk=k;
        System.out.println("Wrapk = " + Wrapk);


        //ornek 6: wrapper boolean ı primitive boolean a ceviriniz
        Boolean T=true;
        boolean f=T;
        System.out.println("f = " + f);


    }
}
