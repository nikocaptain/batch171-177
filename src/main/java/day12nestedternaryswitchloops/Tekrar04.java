package day12nestedternaryswitchloops;

public class Tekrar04 {
    public static void main(String[] args) {
        /*
        SwitchSoru5:  gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
   (if kullanmadan)
         */

        String day="saturday";
        switch (day.toLowerCase()){
            case "monday":
            case "tuesday":
                System.out.println("Java ders günleri");
                break;
            case "wednesday":
            case "saturday":
                System.out.println("SQL ders günleri");
                break;
            case "thursday":
            case "friday":
                System.out.println("Selenyum ders günleri");
                break;
            default:
                System.out.println("izin günü");
        }
    }
}
