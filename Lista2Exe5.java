package lista.pkg2.exe.pkg5;

import java.util.Scanner;

public class Lista2Exe5 {

    public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);
    int n1;
    int n2;
    int n3;
    int soma;
    int media;
    int mult;
    int opcao;
 
         
        System.out.println("1. Soma");
        System.out.println("2. Média");
        System.out.println("3. Multiplicação");
        System.out.println("Escolha a opção!");
         opcao = input.nextInt();
         System.out.println("   ");
    
        System.out.println("Digite os números: ");
         n1 = input.nextInt();
         n2 = input.nextInt();
         n3 = input.nextInt();
         System.out.println("   ");
    
        switch (opcao){
            case 1:{
                soma = n1 + n2 + n3;
                System.out.println("Resultdo: " + soma);
                System.out.println("   ");
                break;
            }    
             
            case 2:{
                media = (n1 + n2 + n3) / 3;
                System.out.println("Resultado: " + media);
                System.out.println("   ");
                break;
            }    
             
            case 3:{
                mult = n1 * n2 * n3;
                System.out.println("Rseultado: " + mult);
                System.out.println("   ");
                break;
            }    
            default:{
                System.out.println("Opção incoreta!");
                System.out.println("   ");
                break;
            }    
        }
            
    }
    
}
