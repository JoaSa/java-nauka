package podstawy;

public class Zmienne {
    public static void main (String [] args){

        char zmChar = 'B';
        System.out.println (zmChar);
        //lub inaczej char zmChar = 'B'; //

        String zmString = "Bartek";
        System.out.println (zmString);

        boolean zmBoolean = true;
        System.out.println (zmBoolean);

        byte zmByte = Byte.MIN_VALUE;
        byte zmByte2 = Byte.MAX_VALUE;
        System.out.println("Byte; " + zmByte +"-"+ zmByte2);

        short zmShort = Short.MIN_VALUE;
        short zmShort2 = Short.MAX_VALUE;
        System.out.println("Short: " + zmShort + " - " + zmShort2);

        int zmInt = Integer.MIN_VALUE;
        int zmInt2 = Integer.MAX_VALUE;
        System.out.println("Int: " + zmInt + " - " + zmInt2);

        long zmLong = Long.MIN_VALUE;
        long zmLong2 = Long.MAX_VALUE;
        System.out.println("Long: " + zmLong + " - " + zmLong2);

        //przykład:    float zmFloat = 26.97654f (f-typ float)//
        float zmFloat = Float.MIN_VALUE;
        float zmFloat2 = Float.MAX_VALUE;
        System.out.println("Float: " + zmFloat + " - " + zmFloat2);

        double zmDouble = Double.MIN_VALUE;
        double zmDouble2 = Double.MAX_VALUE;
        System.out.println("Double: " + zmDouble + " - " + zmDouble2);
        //przykład:       dauble zmDauble = 5.75      lub      dauble zmDauble = 5.75d     (można na dwa sposoby) //

        // przykład:     final int liczba = 256;    (przypisanie liczy do final - nie mozna jej już zmienić, będzie wartośc niezmienna 256;    final - stała (skończone)    //
        // przykład bez final:   int liczba = 256;   liczba zmByte;   (256 jest wartością zmienną) //




    }
}
