public class Student {
    private Osoba osoba;

    private WydziałEnum wydzial;

    public Student(Osoba osoba, WydziałEnum wydzial) {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }


    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public WydziałEnum getWydzial() {
        return wydzial;
    }

    public void setWydzial(WydziałEnum wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        return "Student{" + osoba +
                ", wydzial=" + wydzial +
                '}';
    }
}