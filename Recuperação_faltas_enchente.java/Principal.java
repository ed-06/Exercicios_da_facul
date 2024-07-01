
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        String vet[] = new String[3];
        Scanner entrada = new Scanner(System.in);
        
        int i = 0;
        System.out.println("Digite uma string:");
        vet[i] = entrada.nextLine();
        
        while (i < 3) {
            System.out.println("Digite uma string:");
            vet[i] = entrada.nextLine();
        }
    }
}
/*
 * Informar o erro nesse código com a ide
 */