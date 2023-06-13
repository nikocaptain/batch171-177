package day20statickeywordconstructors;

public class car01Runner {
    public static void main(String[] args) {
       Car01 carr1=new Car01("Honda","M6",2021,false) ;
        System.out.println(carr1);//Car01{marka='Honda', modell='M6', yearr=2021, benzinli=false}

        Car01 carr2=new Car01("Mercedes","CLA200",2022,true);
        System.out.println(carr2);//Car01{marka='Mercedes', modell='CLA200', yearr=2022, benzinli=true}

        Car01 carr3=new Car01("Cherolet","cruze",2019);

        System.out.println(carr3);//Car01{marka='Cherolet', modell='cruze', yearr=2019, benzinli=true}
    }
}
