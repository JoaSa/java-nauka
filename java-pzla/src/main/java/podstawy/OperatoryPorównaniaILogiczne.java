package podstawy;

public class OperatoryPorównaniaILogiczne {
    public static void main (String [] args) {

        int a = 5, b = 6;
        boolean logiczna = a == b;  // false bo to założenie to nic innego jak x=5 (a i b nie są sobie równe)
        System.out.println (logiczna);


        boolean logiczna2 = a != b; // true sprawdza czy liczby sa rózne od siebie
        System.out.println (logiczna2);

        boolean logiczna3 = a > b; // false
        System.out.println (logiczna3);

        boolean logiczna4 = a < b; // true
        System.out.println (logiczna4);

        boolean logiczna5 = 5 >= 5 && 6 > 1; // true (&& koniukacja "i" dwa (wszystkie) warunki musza być spełnione, gdy jeden jest niespełniony lub dwa (wszystkie) pokaże wynik false),
        System.out.println (logiczna5);

        boolean logiczna6 = 5 >= 5 && 6 > 1 && true; // true (&& koniukacja "i"  (wszystkie) warunki musza być spełnione, gdy jeden jest niespełniony lub dwa (wszystkie) pokaże wynik false),
        System.out.println (logiczna6);

        boolean logiczna7 = 6 >= 5 || 1 > 1 || false; //true ( || alternatywa 'lub' ( daje wynik false tylko wtedy, gdy wszystkie warunki są false)
        System.out.println (logiczna7);

        boolean logiczna8 = 4 >= 5 || 2 > 1 && false; //false ( || alternatywa 'lub' połączona z && koniukacja "i"
        System.out.println (logiczna8);

        boolean logiczna9 = (4 >= 5 || 2 > 3) && false; //false ( || alternatywa 'lub' połączona z && koniukacja "i" nawiasy wskazują działanie pierwsze w kolejności
        System.out.println (logiczna9);

        boolean logiczna10 = !(5 == 5); //false  (boolean logiczna = !True) czyli operator negacji !,  zmienia wartość na przeciwną ( truna false, i false na true)
        System.out.println (logiczna10);

    }
}
