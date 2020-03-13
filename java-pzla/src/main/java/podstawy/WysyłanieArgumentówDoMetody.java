package podstawy;

public class WysyłanieArgumentówDoMetody {

    public static void main(String[] args) {
// przykład 1 (typ prosty)
        //      int y = 3;
        //     zmien(y); // wywołanie funkcji zmien // referencja
        //   System.out.println(y);  // drukuje wartość y = 3
        // }

        //  public static void zmien(int x) {   // int x = y (argument x zmnienia sie na argument y, czyli wynosci 3 // cały ten wiersz co CIAłO METODY // x=y - zaszła kopia referencji
        //    x += 5;    // x=3, 3+5=8
        //  System.out.println("Metoda :" + x);  // 8

        // przykład 2 (typ prosty) wywołanie metody return w tym przypadku - zwraca referencje
              int y = 3;
            y = zmien(y); // wywołanie funkcji zmien //  return x - zwraca tą funkcje nawet jeśli zmienimy tablice na jakąś inną NOWĄ
           System.out.println(y);  // drukuje wartość y = 8
         }

          public static int zmien(int x) {   // int x = y (argument x zmnienia sie na argument y, czyli wynosci 3 // cały ten wiersz co CIAłO METODY
            x += 5;    // x=3, 3+5=8
          System.out.println("Metoda :" + x);  // 8
           return x;      // return gdy jest int, String ale nie void


        //przykład 3   tablica typ złożony, zachowuje się inaczej, bo jest obiektem (przechowuje referencje)

       // int[] y = {7};       // tablica jednoelementowa o warotości 7,       domyslnie:  int[0], bo tablicza zaczyna się od 0
        // zmien(y);           // wywołanie funkcji zmien// typ złożony zwraca referencje
        //System.out.println(y[0]);   // nie drukuje wartości 7 , zwraca wartość  12 czyli wartość y z indeksu 0, bo   x[0] = y[0], więc też wynosi 12
   // }
   // public static void zmien (int[] x){   // x=y (x zamienia się w y)
      //  x[0] += 5;                       // y[0] = 7+5=12
       // System.out.println("Metoda :" + x[0]);    // 12




        //przykład 4
       // int[] y = {7};       //      tablica jednoelementowa o warotości 7,       domyslnie:  int[0], bo tablicza zaczyna się od 0
      //  zmien(y);           // wywołanie funkcji zmien // referencja// nowa referencja nie zwraca się
      //  System.out.println(y[0]);   //  drukuje wartości 7 , bo referencja int[] y = {7}; zmieniła się na  x = new int[1];
   // }
   // public static void zmien (int[] x){   // x=y (x zamienia się w y)  // przypisanie referencji y do wartości x
      //  x = new int[1];           // nowa tablica   //inna, nowa referencja przypisana do x
      //  x[0] += 20;                // x[0] = o wartości 20, czyli x=x+20=20
       // System.out.println("Metoda :" + x[0]);    // 20    // 20 nie zwraca się do y[0], bo referencja się zmieniła na  x = new int[1];


        //przykład 5
       // int[] y = {5};       //      tablica jednoelementowa o warotości 7,       domyslnie:  int[0], bo tablicza zaczyna się od 0
       // y = zmien(y);           // return x - zwraca tą funkcje nawet jeśli zmienimy tablice na jakąś inną NOWĄ
       //System.out.println(y[0]);   //  drukuje wartości 20 , bo referencja int[] y = {7}; zmieniła się na  x = new int[1]; a return zwraca tą funkcje jako   y = zmien(y);
    //}
    //public static int[] zmien (int[] x){   //   zamiast void jest int, więc wymaga return !
       // x = new int[1];           // nowa tablica  //inna referencja now przypisana do x
       // x[0] += 20;                // x[0] = o wartości 20, czyli x=x+20=20
        //System.out.println("Metoda :" + x[0]);    // 20    // 20 nie zwraca się do y[0], bo referencja się zmieniła na  x = new int[1];
       // return x;
    }
}

//Typ prosty np.  zmienna - przechowywuje wartość,
//Typ złożony np. obiekt - przechowuje referencje