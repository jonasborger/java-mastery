package Testing;

import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {
        contatenandoComPrintF();
    }

    public static void limitandoCasaDecimal() {
        double valor = 10.231353;
        System.out.printf("%.3f%n", valor); // %n = quebra linha
        System.out.printf("%.2f\n", valor);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f", valor);
    }

    public static void contatenandoComPrintF() {
        String nome = "Jonas";
        int idade = 31;
        System.out.printf("Meu nome é %s e eu tenho %d anos!", nome, idade);
    }
}
