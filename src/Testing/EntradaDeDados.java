package Testing;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        semErroNoBuffer();
    }

    public static void doubleComPonto() {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a sua altura:");
        double altura = scan.nextDouble();
        System.out.println("Altura informada: " + altura);
        scan.close();
    }

    public static void dadosNaMesmaLinha() {
        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        int idade = scan.nextInt();
        double salario = scan.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println("Nome informado: " + nome);
        System.out.println("Idade informada: " + idade);
        System.out.println("Salario informado: " + salario);
        scan.close();
    }

    public static void erroNoBuffer() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();     //consegue ler o numero

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();  //tenta ler, mas... :(

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        scan.close();
    }

    public static void semErroNoBuffer() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        scan.close();
    }
}
