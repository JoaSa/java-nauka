package podstawy;

import java.util.Scanner;

public class Lekcja1 {
    public static void main (String[] args){   //metoda main//
        Scanner scanner = new Scanner( System.in); //import napisanego już wcześniej obiektu, z argumentami w nawiasie////metoda odpowiada  za drukowanie teksu
        String name; //deklaracja zmiennej//
        System.out.print("Podaj swoje imie: ");
        name = scanner.nextLine(); //przypisanie zmiennej// next(wydrukuje tylko imię), nextLine (wydrukuje cały wers np. imię i nazwisko)//
        System.out.print ("Hello " + name); //wydrukuj argumenty//
        //System.out.printf("Hello%s " , name);// //może być równiez takie drukowanie-inne argumenty, to samo drukuje//
    }
}
