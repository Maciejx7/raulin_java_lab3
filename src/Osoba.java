public class Osoba {
    private String Imie, Nazwisko;
    private Integer indeks;

    public Osoba(String imie, String nazwisko, Integer indeks) {
        Imie = imie;
        Nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public Integer getIndeks() {
        return indeks;
    }

    public void setIndeks(Integer indeks) {
        this.indeks = indeks;
    }
}