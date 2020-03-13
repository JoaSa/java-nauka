package KlasyObiekty;

public class Ssaki {
    public static void main (String[]args ){
        Zwierze kot = new Zwierze();
        kot.glos = "Miauuu";   //przeciążenie        imie i glos to atrybuty
        kot.imie = "Zuzia";   // przeciążenie
      // System.out.println(kot.imie);  //Zuzia    ale to mozna ułatwić poniższym zapisem, który znaczy to samo co println, jest to wywołanie metody z klasy Ssaki
        kot.przdstawSię();
        kot.dajGlos(3);

        Zwierze pies = new Zwierze();
        pies.glos = "hauw";
        pies.imie = "Bajbus";

        pies.przdstawSię();
        pies.dajGlos(3);
    }
}
