package GetterySettery;

public class Uczen {
    private String nazwisko;

    String getNazwisko() {  // uzyskanie dostepu do zmiennej nazwisko
        return "Nazwisko: " + this.nazwisko; // zwracaj to nazwisko- dostep z klasy Uczeń
    }

    void setNazwisko(String nazwisko) { //  metoda set nic nie zwraca
        if (nazwisko.length() >= 2) { //sprawdzenie czy nazwisko jest dłuższe/wieksze  niz dwuliterowe
            this.nazwisko = nazwisko; // jesli ma wiecej niz 2 lub =2 litery wtedy dopiero sie drukuje
        }
    }
    private int ocena;
    int getOcena(){
        return this.ocena;
        }
        void setOcena (int ocena){
        if (ocena >= 1 && ocena <=6){ /// ograniczenie ocen od 1 do 6
            this.ocena = ocena;

        }
    }
}
