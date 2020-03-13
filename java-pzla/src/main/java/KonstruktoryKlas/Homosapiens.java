package KonstruktoryKlas;

public class Homosapiens {
    public static void main (String[] args){
        Człowiek jan = new Człowiek();
       jan.imie = "Jan";
        System.out.println(jan.imie);
        System.out.println(Człowiek.liczebność);

        Człowiek daniel = new Człowiek(); // dostepne dwa konstruktory pusty () lub imie, wybieramy pusty a imie tworzymy sami poniżej
        daniel.imie = "Daniel";
        System.out.println(daniel.imie);
        System.out.println(Człowiek.liczebność);
    }
}
