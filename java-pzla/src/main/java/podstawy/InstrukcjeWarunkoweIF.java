package podstawy;

public class InstrukcjeWarunkoweIF {
    public static void main (String [] args) {

       // if (true){
       //     System.out.println ("Prawda");      //Prawda - waruenk tylko i wyłącznie jest true (), w przypadku false warunek nie jest spełniony
      //      if (false)                          // warunek nie jest spełniony, w () zawsze jest true
       //         System.out.println ("Falsz");
      //  }


       //  int wiek = 16;
       //  if(wiek >= 18){
       //     System.out.println("Pełnoletni");
      //  }
      //  else{                                         // w else -nie wpisuje sie nigdy warunku, warunek jest zawsze w if()
       //     System.out.println ("Niepełnoletni");   // Niepełnoletni
     //   }


        int wiek = 15;
        if(wiek>=18) {
            // I metoda
            // System.out.println("Pełnoletni");  // wykona się jak ma min. 18
            // }
            // else{
            // if(wiek>=16){                            // zagnieżdzenie warunku if() w else - kolejny warunek
            // System.out.println("Może pracować");  // wykona się jak ma min. 16
            // }
            // else{
            // System.out.println("Nie może pracować");   // "Nie może pracować"  wykonała się jak ma mnie lay niż 16
            // }

            // II mateoda

            System.out.println("Pełnoletni");
        }
        else if (wiek>= 16) {                   // krótsze zagnieżdzenie warunku if() w else
            System.out.println("Może pracować");
        }
        else{
            System.out.println("Nie może pracować"); // Nie może pracować
        }
        String imie = wiek >= 18? "Bartek" : "Bartuś";  // operator trój-argumentowy;  [ I argument : wiek >= 18 -zapytanie logiczne];  [II argument: "Bartek" - wartość TRUE];  [ II argument: "Bartuś" - wartość FALSE]
        System.out.println(imie);                       // Bartuś
    }
}
