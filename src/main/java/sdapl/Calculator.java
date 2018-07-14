package sdapl;

public class Calculator {


    public static void main(String[] args) {

        Kalkulator Calculator = new Kalkulator();

        int a= 2 ;
        int b= 3 ;
        int akcja = 3 ;


        if (akcja==1)
            System.out.print(Calculator.dodawanie(a, b));
        if (akcja==2)
            System.out.print(Calculator.odejmowanie(a, b));
        if (akcja==3)
            System.out.print(Calculator.mnozenie(a, b));
        if (akcja==4)
            Calculator.dzielenie(a, b);

        if ((akcja!=1)&&(akcja!=2)&&(akcja!=3)&&(akcja!=4))
            System.out.println("Podano nieprawidłowe dane ! ");
        System.out.println("");
    }

}

class Kalkulator{
    int wynik;
    public int dodawanie(int a, int b){
        wynik=a+b;
        return wynik;
    }
    int odejmowanie(int a, int b){
        wynik=a-b;
        return wynik;
    }
    int mnozenie(int a, int b)
    {
        wynik=a*b;
        return wynik;
    }

    void  dzielenie(int a, int b) {
        wynik = a / b;
        System.out.print(wynik);
    }

}
