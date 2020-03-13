package podstawy;

public class RzutowanieKonwersja {
    public static void main (String [] args){
        // Rzutowanie

       // int a = 25;
      //  int b = a;
       // b = 10; // jest nieistotny
        //System.out.println(a); //25

       // int a = 25;
         // short b = a; pokazuje błąd, bo short jest duzo mniejszy od int dlatego powinno się konwertować czyli jawnie rzutować,  powinno być:
       // short b = (short)a; //rzutowanie jawne - jest wymagane wtedy, kiedy zachodzi obawa przed utratą jakichś danych!
        //System.out.println(a); //25


       // short a = 25;
        //int b = (int)a; //rzutowanie niejawne - zbedne bo shost jest mniejsze od int (nie wychodzi błąd). Sam komplikator dodaje takie rzutowanie, którego my nie widzimy
        //System.out.println(a); //25

        //int a = Integer.MAX_VALUE;
        //short b = (short) a;
        //System.out.println(b); //-1 (odkręcanie licznika - zlicza kilka razy od short max-volue do shosr minvolue w kółko kilka razy w zależnosci jak duzym typem rzutujemy

        // float a = 5.25f; // (0.25 - zawsze jest obcinana - jest strata)
       //  int b = a; powinno byc:
        // int b = (int)a;
       //  System.out.println(b); //5 - liczba przed przecinkiem (końcówka 0,25 ginie. Zmienia sie na liczbe całkowitą int

       // Konwersja:

      //  float a = 7.9f;
        //int b = (int) a;
        // String liczba = b; błąd powinno być
       // String liczba = Integer.toString(b); //Musimy najpierw odwołac sie do Interera (klasy osłonowej), potem zmienc na toString  z klasy Integer
        //System.out.println(liczba); //7

         float a = 7.9f;
         int b = (int) a;
         String liczba = Integer.toString(b); //przekształcenie z Int na String
         int c = Integer.parseInt(liczba); //pezkształcenie ze String na Int
        // parseInt - wymusza by traktować tak, jako integer konwertuje (liczbę) na int - Integer
        System.out.println(c); // 7
        System.out.println(c+2); //9

        //System.out.println(liczba); //7
    }
}
