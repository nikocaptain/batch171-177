package day33exceptionsenumsiterator;

import java.util.Arrays;

public class EnumRunner {

    public static void main(String[] args) {
       Cities ankara= Cities.ANKARA;
        System.out.println(ankara);

       String adanaCityName= Cities.ADANA.getCityName();//ANKARA
        System.out.println(adanaCityName);//Adana
        System.out.println(Cities.ANKARA.getPostalCode());//06000

       int sivasplaka= Cities.SİVAS.getPlateCode();
        System.out.println(sivasplaka);//58
       String sivasposta= Cities.SİVAS.getPostalCode();
        System.out.println(sivasposta);//58000
       String sivasadi= Cities.SİVAS.getCityName();
        System.out.println(sivasadi);
        System.out.println("il adi : "+sivasadi+" plaka kodu: "+sivasplaka+" posta kodu: "+sivasposta);

      //Cities arr[]= Cities.values();
        //System.out.println(Arrays.toString(arr));
       // System.out.println(arr[1]);

    }

}
