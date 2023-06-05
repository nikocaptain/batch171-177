package day20statickeywordconstructors;

public class TekrarDaire {
    int binaYasi;
    int odaSayisi;
    String mahalle;

    @Override
    public String toString() {
        return "TekrarDaire{" +
                "binaYasi=" + binaYasi +
                ", odaSayisi=" + odaSayisi +
                ", mahalle='" + mahalle + '\'' +
                '}';
    }

    public TekrarDaire(int binaYasi) {
        this.binaYasi = binaYasi;
    }

    public TekrarDaire(int binaYasi, int odaSayisi, String mahalle) {
        this.binaYasi = binaYasi;
        this.odaSayisi = odaSayisi;
        this.mahalle = mahalle;





    }
}
