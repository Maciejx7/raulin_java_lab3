import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */
        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Student student = new Student(new Osoba("Bronek", "Malina", 57062), WydziałEnum.PROGRAMOWANIE);
        Student student1 = new Student(new Osoba("Joanna", "Polak", 13253), WydziałEnum.ROBOTYKA);
        Student student2 = new Student(new Osoba("Piotr", "Rudek", 31290), WydziałEnum.SIECI);
        Student student3 = new Student(new Osoba("Kamil", "Kowalski", 59801), WydziałEnum.ROBOTYKA);
        Student student4 = new Student(new Osoba("Kuba", "Wójt", 47395), WydziałEnum.SIECI);
        ArrayList<Student> uczen = new <Student>ArrayList();
        uczen.add(student);
        uczen.add(student1);
        uczen.add(student2);
        uczen.add(student3);
        uczen.add(student4);
        for (Student student5 : uczen) {
            System.out.println(student5.toString());
        }

    }
}