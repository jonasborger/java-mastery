package Testing;

public class Casting {
    public static void main(String[] args) {
        castingOperacoesAritmeticas();
    }

    public static void castingImplicito() {
        int numInt = 10;
        double numDouble = numInt;
        System.out.println(numDouble);
    }

    public static void castingExplicito () {
        double valorDouble = 10.2;
        int valorInt = (int) valorDouble;
        System.out.println(valorInt);
    }

    public static void castingChar() {
        int valorInt  = 185;
        char valorChar = (char) valorInt;
        System.out.println(valorChar);
    }

    public static void castingOperacoesAritmeticas() {
        int valorInt = 5;
        double valorDouble = 2.0;
        double resultado = valorInt / valorDouble; // int convertido automaticamente para double
        System.out.println(resultado); // saida: 2.5
    }
}
