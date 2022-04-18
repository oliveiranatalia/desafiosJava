//Nesse desafio você terá que desenvolver uma calculadora que receba 2 números; exiba um menu de
//operações matemáticas; realize o calculo matemático e exiba o resultado, com opção de sair do programa
import java.util.Scanner;
import java.util.InputMismatchException;
public class miniDesafio1 {
    public static void main(String[] args) {
        System.out.println("\n\n---------------------------------\n          CALCULADORA\n---------------------------------");
        menu();
    }
    public static void retorno() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n 1 - Começar de novo       2 - Sair ");
        try {
            do {
                int escolha = leitor.nextInt();
                if (escolha == 1) {
                    menu();
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
    public static void menu() {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.print("Insira o primeiro número: ");
            double num1 = leitor.nextDouble();
            System.out.print("Insira o segundo número: ");
            double num2 = leitor.nextDouble();
            System.out.println("Qual operação você quer realizar?\n   1 - Soma\n   2 - Subtração\n   3 - Multiplicação\n   4 - Divisão");
            int escolha = leitor.nextInt();
            do {
                if (escolha == 1) {
                    double resultado = num1 - num2;
                    System.out.println(num1+" + "+num2+" = "+resultado);
                    retorno();
                } else if (escolha == 2) {
                    double resultado = num1 - num2;
                    System.out.println(num1+" - "+num2+" = "+resultado);
                    retorno();
                } else if (escolha == 3) {
                    double resultado = num1 * num2;
                    System.out.println(num1+" x "+num2+" = "+resultado);
                    retorno();
                } else if (escolha == 4) {
                    double resultado = num1 * num2;
                    System.out.println(num1+" ÷ "+num2+" = "+resultado);
                    retorno();
                } else if (escolha < 1 || escolha > 4) {
                    System.out.print("---- Opção não identificada ----");
                    menu();
                }
            } while (true);

        } catch (InputMismatchException e) {
            System.out.print("---- Digite números ----");
            retorno();
        }
    }
}