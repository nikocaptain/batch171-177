package day16arraysforeachloop;


import java.util.Arrays;

public class Tekrar_Array02 {
    public static void main(String[] args) {
        String studentName[]=new String[6];
        System.out.println(studentName);
        Arrays.toString(studentName);
        System.out.println(Arrays.toString(studentName));
        studentName[0]="Niyazi";
        System.out.println(Arrays.toString(studentName));
        studentName[1]="Tugba";
        studentName[2]="Inci";
        studentName[3]="Ayla";
        studentName[4]="Sivas";
        studentName[5]="Ardahan";
        System.out.println(Arrays.toString(studentName));

        System.out.println(studentName[1].charAt(0));
        for (int i = 0; i < studentName.length; i++) {

            System.out.print(studentName[i]+"!  ");

        }

    }
}
