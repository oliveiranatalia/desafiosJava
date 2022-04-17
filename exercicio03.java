//Crie um algoritmo que leia dois valores (x e y) representando um intervalo. Em seguida, leia um novo valor
// (z) e verifique se z pertence ao intervalo [x, y]
import java.util.Scanner;
import java.util.InputMismatchException;
public class exercicio03 {
    public static void main(String[] args) {
        System.out.println("\n\n---------------------------------\n          Verificador\n---------------------------------");

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
            int x = leitor.nextInt();
            System.out.println("Insira o segundo número: ");
            int y = leitor.nextInt();
            System.out.println("Insira o terceiro número: ");
            int z = leitor.nextInt();
            if(z >= x ^ z <= y) {
                System.out.println("O "+z+" não está entre "+x+" e "+y+".");
            }else {
                System.out.println("O "+z+" está entre "+x+" e "+y+".");
            }
            retorno();
        } catch (InputMismatchException e) {
            System.out.println("---- Digite apenas números inteiros ----\n");
            verificador();
        }
    }
}
