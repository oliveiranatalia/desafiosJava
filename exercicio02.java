//Crie um algoritmo que leia o salário de um funcionário, reajuste o salário em 7% e mostre o resultado
import java.util.Scanner;
import java.util.InputMismatchException;
public class exercicio02 {
    public static void main(String[] args) {
        System.out.println("\n\n---------------------------------\n   Calcule o reajuste salarial\n---------------------------------");
        reajuste();
    }
    public static void retorno() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n      1 - Começar de novo       2 - Sair");
        try {
            do {
                int escolha = leitor.nextInt();
                if (escolha == 1) {
                    reajuste();
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
    public static void reajuste() {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Insira o salário bruto: ");
            double salario = leitor.nextDouble();
            double reajuste = salario +(salario * 0.07);
            System.out.println("O valor total com reajuste é de "+reajuste+".");
            retorno();
        } catch (InputMismatchException e) {
            System.out.println("------ Digite apenas números  ------\n");
            reajuste();
        }
    }
}
