package KlasyiObiektyKopiowane;

public class Main {
    public static void main (String []args) {

        int liczba = 50;
        System.out.println("liczba przed " + liczba); //50
        zmien(liczba);
        System.out.println("liczba po " + liczba);  //50

        Liczba oliczba = new Liczba (); // nowy obiekt
        oliczba.liczba = 50;
        System.out.println("Obiekt liczba przed " + oliczba.liczba);  //50
        zmien(oliczba);
        System.out.println("Obiekt liczba po " + oliczba.liczba);  //-1
    }
    public static void zmien (int liczba){
        liczba = -1;
    }
    public static void zmien(Liczba oliczba){
        oliczba.liczba =  -1;

    }
}


//typy proste "liczba" - kopiowanie przez wartość
// typy złozone (obiekty) "oliczba" - kopiowanie poprzez referencje  (do orginału obiektu)