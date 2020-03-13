package KonstruktoryKlas;

public class Człowiek {
    Człowiek(){        // konstruktor - pusty
        liczebność ++;
    }
    Człowiek (String imie){    //konstruktor przeciążony  argumentem imie o typie String
        this.imie = imie;
        liczebność ++;
    }
    public String imie;
    static int liczebność = 0; // liczebność dla całej klasy jak wpiszemy przed int static
}
