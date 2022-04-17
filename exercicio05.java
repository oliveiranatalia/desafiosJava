//Escreva um algoritmo que leia um número inteiro (de 1 a 7) representando o dia da semana e informe o nome do
// dia correspondente
import java.util.Scanner;
import java.util.InputMismatchException;
public class exercicio05 {
    public static void main(String[] args) {
        System.out.println("\n\n---------------------------------\n         Dias da semana\n---------------------------------");
        semana();
    }
    public static void retorno() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n      1 - Começar de novo       2 - Sair");
        try {
            do {
                int escolha = leitor.nextInt();
                if (escolha == 1) {
                    semana();
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
    public static void semana() {
        try {
            Scanner leitor = new Scanner(System.in);
            String dia[] = new String[8];
            dia[0] = "";
            dia[1] = "domingo";
            dia[2] = "segunda-feira";
            dia[3] = "terça-feira;";
            dia[4] = "quarta-feira";
            dia[5] = "quinta-feira";
            dia[6] = "sexta-feira";
            dia[7] = "sábado";
            System.out.println("Insira um número de 1 a 7 ");
            int i = leitor.nextInt();
            if(i < 1 ^ i > 7) {
                semana();
            } else {
                System.out.println(i + " é " + dia[i] + ".");
            }
            retorno();
        } catch (InputMismatchException e) {
            System.out.println("---- Digite apenas números inteiros ----\n");
            semana();
        }
    }
}
