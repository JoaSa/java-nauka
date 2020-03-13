package podstawy;

public class FunkceMetody {

    public static void main(String[] args) {

       //     wyswietl();      // metoda
    //}
         //   static void wyswietl(){      // void metoda pust nic nie zwraca dlatego nie uzywamy return - zwróć, ale możeby wydrukować poprzez "napisanie tekstu"
          //  System.out.println("Hello world!");


       //   String h = wyswietl();
       //   System.out.println (h);    // to jest równe zapisowi =  System.out.println(wyswietl());
        // }
        // static String wyswietl(){
        // return "Hello World";

        // przeciążanie funbkcji/metody:  (typ musi być ściśle okreslny np. int, string itd - wszędzie użyty ten sam typ!)

        System.out.println(dodaj ());  // bez argumentu             //0
        System.out.println(dodaj (5)); // jeden argument        //5
        System.out.println(dodaj (5,6)); // dwa argumenty    //11
    }
    static int dodaj () {
        return 0;                // zwróc 0
    }
    static int dodaj (int x) {
        return ++x;             // zwróc x + 1
    }
    static int dodaj (int x, int y) {
        return x + y;                // zwróc x + y
    }
    }


