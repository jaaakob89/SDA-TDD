package sdapl;

import java.util.Arrays;

public class medianaa {

    private static int liczby[] = {5,2,1,4,3};

    public static void main(String args[]) {

        srednia();
        mediana();


    }

    private static void srednia() {

        int suma = 0;
        int średnia = 0;
        for (int liczba : liczby) {
            suma = suma + liczba;
        }

        średnia = suma / liczby.length;

        System.out.println("Średnia liczb w tablicy to: " + średnia);
    }

    private static void mediana() {
        double mediana = 0;
        Arrays.sort(liczby);
        if (liczby.length % 2 == 0) {
            mediana = (liczby[liczby.length / 2] + liczby[(liczby.length / 2) + 1]) / 2.0;
        } else {
            mediana = liczby[liczby.length / 2];
        }

        System.out.println("Mediana liczb w tablicy to: " + mediana);
    }
}