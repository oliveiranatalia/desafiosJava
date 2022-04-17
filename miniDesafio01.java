//Nesse desafio você terá que desenvolver uma calculadora que receba 2 números; exiba um menu de
//operações matemáticas; realize o calculo matemático e exiba o resultado, com opção de sair do programa
import java.util.Scanner;
import java.util.InputMismatchException;
public class miniDesafio01 {
    public static void main(String[]args) {
        System.out.println("\n\n---------------------------------\n          CALCULADORA\n---------------------------------");
        menu();
    }

    public static void retorno() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n      1 - Começar de novo       2 - Sair");
        try {
            do {
                int escolha = leitor.nextInt();
                if (escolha == 1) {
                    menu();
                } else if (escolha == 2) {
                    System.exit(0);
                } else{
                    System.out.println("Opção não identificada");
                    retorno();
                }
            } while (true);
        } catch (InputMismatchException e) {
            System.out.println("Opção não identificada");
            retorno();
        }
    }
    public static void menu(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual operação você quer realizar?\n   1 - Soma\n   2 - Subtração\n   3 - Multiplicação\n   4 - Divisão");
        int escolha = leitor.nextInt();
        try {
            do{
                if (escolha == 1) {
                    adicao();
                } else if (escolha == 2) {
                    subtracao();
                } else if (escolha == 3) {
                    multiplicacao();
                } else if (escolha == 4) {
                    divisao();
                } else if (escolha < 1 || escolha > 4){
                    System.out.println("Opção não identificada");
                    menu();
                }
            } while (true);
        } catch (InputMismatchException e) {
            System.out.println("Digite números.");
            menu();
        }
    }

    public static void adicao() {
        Scanner leitor = new Scanner(System.in);
        do{
            try{
                System.out.println("\nInsira o primeiro número:");
                double num1 = leitor.nextDouble();
                System.out.println("\nInsira o segundo número:");
                double num2 = leitor.nextDouble();
                double resultado = num1 + num2;
                System.out.println("\nResultado: "+resultado+"\n");
                retorno();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite números.");
                adicao();
            }
        } while (true);
    }
    public static void subtracao() {
        Scanner leitor = new Scanner(System.in);
        do{
            try{
                System.out.println("\nInsira o primeiro número:");
                double num1 = leitor.nextDouble();
                System.out.println("\nInsira o segundo número:");
                double num2 = leitor.nextDouble();
                double resultado = num1 - num2;
                System.out.println("\nResultado: "+resultado+"\n");
                retorno();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite números.");
                subtracao();
            }
        } while (true);
    }
    public static void multiplicacao() {
        Scanner leitor = new Scanner(System.in);
        do{
            try{
                System.out.println("\nInsira o primeiro número:");
                double num1 = leitor.nextDouble();
                System.out.println("\nInsira o segundo número:");
                double num2 = leitor.nextDouble();
                double resultado = num1 * num2;
                System.out.println("\nResultado: "+resultado+"\n");
                retorno();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite números.");
                multiplicacao();
            }
        } while (true);
    }
    public static void divisao() {
        Scanner leitor = new Scanner(System.in);
        do{
            try{
                System.out.println("\nInsira o primeiro número:");
                double num1 = leitor.nextDouble();
                System.out.println("\nInsira o segundo número:");
                double num2 = leitor.nextDouble();
                double resultado = num1 / num2;
                System.out.println("\nResultado: "+resultado+"\n");
                retorno();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite números.");
                divisao();
            }
        } while (true);
    }
}
