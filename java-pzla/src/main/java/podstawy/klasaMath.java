package podstawy;

public class klasaMath {
    public static void main (String[] args){

        int a = 5;
        int b = 11;

        // funkcje MATH
        // Math. - ctrl po wciśnięciu tego hlawisza robi się hiperłącze i można przejść do definicji klasy Math i sprawdzic za co odpowiada- opis po angielsku

        System.out.println(Math.max(a,b)); //wartość maksymalna 11
        System.out.println(Math.min(a,b));// wartoś minimalna 5
        System.out.println(Math.abs(a));//wartośc całkowita dodatnia 5
        System.out.println(Math.pow(2,3));//potęgowanie 8
        System.out.println(Math.sqrt(16));//pierwiastek kwadratowy 4
        System.out.println(Math.round(5.5));// zaokraglanie wartości od 0do4 w dó, od 5 w górę//6
        System.out.println(Math.ceil(5.6));//zaookraganie ceil- sufit zawsze w górę oprócz 0//6
        System.out.println(Math.floor(5.9999));//zaokrąglanie w dół floor-podłoga //5

        //Zmienne Math - z dużej litery

        System.out.println(Math.PI);//liczba PI
        System.out.println(Math.E);//liczba E
    }
}
