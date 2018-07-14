package sdapl;

import java.util.Arrays;
import java.util.Random;

public class mediana {



    public static double mediana(int[] tablica)
    {
        double mediana=0;
        double srednia = 0.0;
        Arrays.sort(tablica);
        if (tablica.length % 2 == 0 )
        {
            srednia = tablica[tablica.length/2] + tablica[(tablica.length/2)-1];

            mediana = srednia/2.0;

        }
        else
        {
            mediana = tablica[tablica.length/2];
        }

        return mediana;
    }


    public static void main(String[] args)
    {
        int w = 10000;
        int[] tab = new int[w];
        Random r = new Random();

        for (int i = 0 ; i < tab.length ; i++)
        {
            tab[i] = r.nextInt(10);
        }
        System.out.println(mediana(tab));
    }
}

