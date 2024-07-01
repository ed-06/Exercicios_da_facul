
import java.util.Random;
import java.util.Scanner;


public class Principal2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int matriz[][] = new int[3][2];
        
        // inserção de valores aleatórios na matriz
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++) {
                matriz[i][j] = random.nextInt(50);
            }
        }
        
        // impressão do conteúdo da matriz
        System.out.println("Valores da matriz:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(matriz + "\t");  // "\t" = tabulação 
            }
            System.out.print("\n");             // "\n" = quebra de linha
        }    
        
    }
}
