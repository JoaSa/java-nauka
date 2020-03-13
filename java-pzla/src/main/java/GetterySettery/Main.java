package GetterySettery;

public class Main {
    public static void main (String[]args){

        Uczen u1 = new Uczen(); //obiekt uczeń () konstruktor pusty domyslny

        u1.setNazwisko("Nowak");  //elementy składowe do których możemy sie odwołać ocena i nazwisko z klasy Uczen
        System.out.println(u1.getNazwisko()); //Nowak
        u1.setNazwisko("K"); //nie spełnia sie if, bo jedna litera, ale w przeciwnym razie nic innego ma nie zwracać, więc zwraca poprzednią wartość Nowak
        System.out.println(u1.getNazwisko()); //Nowak, bo K to jedna litera, więc pokazuje poprzednią

        u1.setOcena(4);
        System.out.println(u1.getOcena());// 4
        u1.setOcena(9);
        System.out.println(u1.getOcena()); //4 bo ograniczamy do 6 , więc pokazuje poprzednią 4
    }
}
// get - brać
// set - ustawiać