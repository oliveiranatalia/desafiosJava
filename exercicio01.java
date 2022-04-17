//Crie um algoritmo que leia dois valores (x e y) e informe se eles são iguais
import java.util.Scanner;
import java.util.InputMismatchException;
public class exercicio01 {
    public static void main(String[] args) {
        System.out.println("\n\n-------------------------------\n   Verificador de igualdade\n-------------------------------");
        verificador();
    }
    public static void retorno() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n      1 - Começar de novo       2 - Sair");
        try {
            do {
                int escolha = leitor.nextInt();
                if (escolha == 1) {
                    verificador();
                } else if (escolha == 2) {
                    System.exit(0);
                } else {
                    System.out.println("Opção não identificada");
                    retorno();
                }
            } while (true);
        } catch (InputMismatchException e) {
            System.out.println("Opção não identificada");
            retorno();
        }
    }
    public static void verificador() {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Insira o primeiro número: ");
            int valor1 = leitor.nextInt();
            System.out.println("Insira o segundo número: ");
            int valor2 = leitor.nextInt();
            if(valor1 == valor2) {
                System.out.println("O "+valor1+" é igual ao "+valor2+".");
            }else {
                System.out.println("O " + valor1 + " é diferente de " + valor2 + ".");
                retorno();
            }
        } catch (InputMismatchException e) {
            System.out.println("---- Digite apenas números inteiros ----\n");
            verificador();
        }
    }
}