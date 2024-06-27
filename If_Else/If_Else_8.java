package Facul.If_Else;
import java.util.Scanner;
public class If_Else_8{
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Escreva as notas dos alunos abaixo:");
       System.out.println("Primeira nota:");
       float nota1 = scanner.nextFloat();
       System.out.println("Segunda nota:");
       float nota2 = scanner.nextFloat();
       System.out.println("Terceira nota:");
       float nota3 = scanner.nextFloat();
       float nota4 = (nota1 + nota2 + nota3) / 3;
       if (nota4 >= 9.0 && nota4 <= 10) {
           System.out.println("A");
       } else if (nota4 >= 7.5 && nota4 < 9.0) {
           System.out.println("B");
       } else if (nota4 >= 6.0 && nota4 < 7.5) {
           System.out.println("C");
       } else if (nota4 < 6) {
       System.out.println("Reprovado");}
       scanner.close();
       }
    }
