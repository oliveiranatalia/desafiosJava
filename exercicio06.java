//Escreva um algoritmo que calcule a soma dos números de 1 a 15.
public class exercicio06 {
    public static void main(String[] args) {
        System.out.println("\n\n---------------------------------\n           Somatório\n---------------------------------");
        somatorio();
    }
    public static void somatorio() {
       for(int i = 0; i < 15; i++){
           int num = 1;
           System.out.println(i+"+"+num+"="+(i+1));
        }
    }
}
