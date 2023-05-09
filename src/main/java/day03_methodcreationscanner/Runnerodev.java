package day03_methodcreationscanner;

public class Runnerodev {
    public static void main(String[] args) {

        Day03Homework2 teacher= new Day03Homework2();

        System.out.println("teacher.ogretmeninIsmi = " + teacher.ogretmeninIsmi);
        System.out.println("teacher.memleketi = " + teacher.memleketi);
        System.out.println("teacher.boy = " + teacher.boy);
        System.out.println("teacher.sacrengi = " + teacher.sacrengi);
        System.out.println("teacher.gozrengi = " + teacher.gozrengi);
        teacher.zeka();
        teacher.anlayis();
        teacher.ilgili();
        teacher.sabirli();

    }
}
