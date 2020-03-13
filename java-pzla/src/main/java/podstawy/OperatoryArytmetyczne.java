package podstawy;

import sun.plugin.viewer.context.PluginBeansContext;

public class OperatoryArytmetyczne {
    public static void main (String [] args) {
        double a = 25;
        double b = 10;
       // int wynik = a+b;
      // System.out.print (wynik);// 35

      // int c = 25;
       //int d = 10;
       //int wynik2 = c % d;
       // System.out.print (wynik2); // 5 jak liczyć modulo: 10*2=20, 25-20=5 (reszta)

       // int wynik3 = 2+2*2;
        //System.out.print (wynik3); // 6 najpierw robi się mnożenie potem dodawanie 2+(2*2);

       // int wynik4 = (2+2) * 2; // lub ((2+2)*2); wychodzi na to samo , pamiętać nawiasy ZAWSZE OKRĄGŁE-nawet podwójne, potrójne nawiasy,
        //System.out.print (wynik4);// 8 najpierw robi się dodawanie w nawiasie potem mnożenie;

        //a = a +  b; // to jest to samo co a += b //
        //System.out.print (a); // 35

        // skrócone operatory : a -= b;   a *= b;   a /= b;   a %= b; //

       // a -= b;
        //System.out.print (a); //25

       // a *= b;
        // System.out.print (a); // 250


       // a /= b;
      //  System.out.print (a); // 2.5

        // a %= b;
        // System.out.print (a); // 5,0 (reszta 5)

        // zwiększanie/zmniejszanie o 1 (inkrementacja ++ ); (dekrementacja -- );
        // a ++;
        // a ++;
       // System.out.print (a); // 27  zwiększa a o 2;
       // a --;
       // a --;
       // a --;
        // System.out.print (a); // 22  zmniejsza a 0 3;
        // LUB bez zmiennych:
        //System.out.println (a++); //25
        //System.out.println (a); //26
        // LUB bez zmiennej w jednym zapisie
       // System.out.println (++a); // 26 dodawanie 0 1;
        //System.out.println (--a); // 24 odejmowanie 0 1;


        // Math.pow(2,3); // 2 do potęgi 3 = 2*2 = 4 *2 =8 można bez tych założeń od razu wydrukować komendą:
       // System.out.println (Math.pow(2,3)); (skrót do powyższego);

       // System.out.println (Math.sqrt(9)); // 3 od razu wydruk pierwiasta kwadratowego z 9, czyli 3*3*=9;

       // System.out.println (Math.abs(-50)); // 50 od razu wydruk wartości bezwzględnej (absolutnej) (z -50 jest 50) (z 50 jest 50) - liczby bez znaku;

       // System.out.println (Math.PI); // 3.141592653589793   liczba PI


    }
}
