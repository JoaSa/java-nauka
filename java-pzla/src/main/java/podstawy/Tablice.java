package podstawy;

public class Tablice {
    public static void main(String[] args) {
        // String uczen1 = "Ania";
        // String uczen2 = "Henio"; // zamiast 20 takich zmiennych tworzymy tablice

       // String[] tab = new String[20]; // nowy obiekt [] tablica z [20] 20 elementami;
      //  tab[0] = "Ania"; //przypisanie elementu Ania do indeksu 0
        // tab[1] = "Bartek"; //przypisanie elementu Bartek do indeksu 1

        // System.out.println( tab[0]); // wyświetla Ania;
        // System.out.println (tab.length); // lenght- długość tablicy, wyświetla dłuość tablicy czyli 20,

        // pętla for


       // for(int i = 0; i < tab.length; i++){ // int = 0, bo tablice numerujemy od 0 // Ania, Bartek  i Null 18 razy
         //   System.out.println(tab[i]); //

          //  }

        // inny przykład z wartością int
        int [] tab = new int [5];  // obiekt tablica o wrtośći int- liczby całkowite [5 elementów],
        tab[0] = 2; // indeks pierwszy czyli 0
        for(int i = 0; 1< tab.length; i++){
            System.out.println(tab[i]);  // 2,0,0,0,0 wyświetla 5 elementów tablicy, nieprzypisane jako 0
        }
    }
    }

