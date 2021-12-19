public class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */
    private int pX, pY, pZ ;
    public int wynik;
    public int x,y,z;
    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;
        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */
    Punkt(int pX, int pY, int pZ){
    }
    public int getpX() {
        return pX;
    }
    public int getpY() {
        return pY;
    }
    public int getpZ() {
        return pZ;
    }
    public int setpX() {
        return pX;
    }
    public int setpY() {
        return pY;
    }
    public int setpZ() {
        return pZ * 10;
    }


    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */
    public int suma() {
        return pX + pY + pZ;
    }
    public int roznica() {
        return pX - pY - pZ;
    }
    public int roznica(int x, int y, int z) {
        return pX * x - pY * y - pZ * z;
    }
    @Override
        public wynik toString() {
        return suma() + roznica() + roznica(int x,int y,int z);

    }
}
