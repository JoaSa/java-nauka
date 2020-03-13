package podstawy;

public class SwitchPrzełącznik {
    public static void main (String[] args){
        int poraRoku = 1;
        switch (poraRoku){
            case 1 :
                System.out.println ("Wiosna");
                break;
            case 2 :
                System.out.println ("Lato");
                break;
            case 3 :
                System.out.println ("Jesień");
                break;
            case 4 :
                System.out.println ("Zima");
                break;
            default :
                System.out.println ("Życie jest piękne");
        }
    }
}
// switch - przełącznik,  case - przypadek,  break -wyłamacz, łamacz,   defaulte - podstawowy

//case - przyjmuje TYLKO int bo swich-przyjmuje int. Jakby switch przyjmował String, to case również. np.  String name = 1;   switch (name){      case "Bartek"

// założenie case są 4 możliwości od 1 do 4, jeśli int(poraRoku) przyjmie liczbe inną niż od 1 do 4, np. 0 lub 5 na ekranie wyświetliśie wartość Deafult czyli //Życie jest piękne