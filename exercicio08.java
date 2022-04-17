//Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares
import java.util.Scanner;
import java.util.InputMismatchException;
public class exercicio08 {
    public static void main(String[] args) {
        System.out.println("\n\n---------------------------------\n          Verificador\n---------------------------------");
        System.out.println("     Digite apenas números\n---------------------------------");
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
            int lista[] = new int[20];
            for(int i = 0; i < lista.length; i++){
                System.out.println("Insira o "+(i+1)+"º número: ");
                lista[i] = leitor.nextInt();
            }
            for(int i = 0; i < lista.length; i++){
                if(lista[i] % 2 == 0){
                    System.out.println(lista[i]+" é par.");
                }
            }
            retorno();
        } catch (InputMismatchException e) {
            System.out.println("---- Digite apenas números inteiros ----\n");
            verificador();
        }
    }
}
