//Nesse desafio você terá que desenvolver um programa que leia um valor e apresente o número de Fibonacci correspondente
import java.util.Scanner;
import java.util.InputMismatchException;
public class miniDesafio02 {
    public static void main(String[] args) {
        System.out.println("\n\n-------------------------------\n     Sequência de Fibonacci\n-------------------------------");
        fibonacci();
    }
    public static void retorno() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n      1 - Começar de novo       2 - Sair");
        try {
            do {
                int escolha = leitor.nextInt();
                if (escolha == 1) {
                    fibonacci();
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
    public static void fibonacci() {
        Scanner leitor = new Scanner(System.in);
        try{
            System.out.println("Insira um número: ");
            int fn = leitor.nextInt();
            int a = 0, b = 1, c = 0;
            for (int i = 0; i <= fn - 3; i++){  // fn=fn-1+fn-2
                c=a+b; a=b; b=c;
            }
            System.out.println("A posição "+fn+" equivale ao valor "+c+".");
            retorno();
        } catch (InputMismatchException e) {
            System.out.println("---- Digite apenas números inteiros ----\n");
            fibonacci();
        }
    }
}
