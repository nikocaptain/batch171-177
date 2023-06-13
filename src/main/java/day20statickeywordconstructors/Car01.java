package day20statickeywordconstructors;

public class Car01 {
    String marka="Hyundai";
    String modell="i20";
    int yearr=2016;
    boolean benzinli=true;

    public Car01(String marka, String modell, int yearr, boolean benzinli) {
        this.marka = marka;
        this.modell = modell;
        this.yearr = yearr;
        this.benzinli = benzinli;
    }

    public Car01(String marka, String modell, int yearr) {
        this.marka = marka;
        this.modell = modell;
        this.yearr = yearr;
    }

    @Override
    public String toString() {
        return "Car01{" +
                "marka='" + marka + '\'' +
                ", modell='" + modell + '\'' +
                ", yearr=" + yearr +
                ", benzinli=" + benzinli +
                '}';
    }
}
