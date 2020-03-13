package podstawy;


import java.util.Random;
import java.util.Scanner;

public class ProstaGra {

    public static void main(String[] args) {
        int i = 0; // 0 prób (int licznik = 0 )
        int los; // zmienna, którą wylosuje komputer (bez wartości aby była losowana)
        int odp; // zmienna, którą umieszcza w odpowiedzi uzytkownik (bez warotści)

        Random rnd = new Random();  // klasa odpowiada za udostępnienie metod do licz losowych
        los = rnd.nextInt(10) + 1; //  10 jest maksimum, 1 jest minimum    baund -granica

        Scanner scanner = new Scanner(System.in); //metoda odpowiada za drukowanie teksu
        System.out.println("Zgadnij liczbę od 1 do 10!");
        do {
            i++;
            System.out.println("Podaj liczbę");
            odp = scanner.nextInt();
            if (odp > los) {
                System.out.println("Niestety nie zgadłeś! Moja liczba jest mniejsza");
            } else if (odp < los) {
                System.out.println("Niestety nie zgadłeś! Moja liczna jest większa!");
            }
        } while (odp != los) ; // liczba różna
            System.out.println("Brawo odgadłeś za "+ i +" razem !");


        }
    }
