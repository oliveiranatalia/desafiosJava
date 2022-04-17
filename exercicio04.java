//Crie um algoritmo que leia dois números inteiros, X e Y, e mostre o resultado da multiplicação de x por y
import java.util.Scanner;
import java.util.InputMismatchException;
public class exercicio04 {
    public static void main(String[] args) {
        System.out.println("\n\n---------------------------------\n        Multiplicação\n---------------------------------");
        calculo();
    }
    public static void retorno() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n      1 - Começar de novo       2 - Sair");
        try {
            do {
                int escolha = leitor.nextInt();
                if (escolha == 1) {
                    calculo();
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
    public static void calculo() {
        try {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Insira o primeiro número: ");
            int num1 = leitor.nextInt();
            System.out.println("Insira o segundo número: ");
            int num2 = leitor.nextInt();
            int resultado =  num1 * num2;
            System.out.println(num1+" x "+num2+" = "+resultado);
            retorno();
        } catch (InputMismatchException e) {
            System.out.println("---- Digite apenas números inteiros ----\n");
            calculo();
        }
    }
}
