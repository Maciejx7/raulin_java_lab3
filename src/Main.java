import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
    /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        List<Student> studenci= new ArrayList<>();
        Student z = new Student();
        z.imie= "Bolek ";
        z.nazwisko = "Raz ";
        z.a= 29;
        z.b = true;
        studenci.add(z);

        Student x = new Student();
        x.imie = "Andrzej ";
        x.nazwisko = "Dwa ";
        x.a = 21;
        x.b = false;
        studenci.add(x);

        Student c = new Student();
        c.imie = "Mateusz ";
        c.nazwisko = "Trzy ";
        c.a = 34;
        c.b= true;
        studenci.add(c);

        for (Student o : studenci){
            System.out.println(z.imie+z.nazwisko+z.a+z.b+"\n"+x.imie+x.nazwisko+x.a+x.b+"\n"+c.imie+c.nazwisko+c.a+c.b);
        }
    }
}