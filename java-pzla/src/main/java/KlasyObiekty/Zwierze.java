package KlasyObiekty;

public class Zwierze {
    String imie;
    String glos = "Greee";
    //metoda I
    public void dajGlos(int x){
        for(int i =0; i<x; i++){               //petla for
            System.out.print(glos);
            System.out.print(" ");
        }
        System.out.println();
    }
    //II metoda
    public void przdstawSię(){
        System.out.println("Nazywam się " + imie);

    }
}
