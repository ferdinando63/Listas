package lista.pkg1.exe.pkg5;

import java.util.Scanner;

public class Lista1Exe5 {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner (System.in);
       double n;
       double quadrado;
       
        System.out.println("Digite um número: ");
         n = input.nextInt();
         
        quadrado = Math.pow(n,2);
        
        System.out.println("Resultado: " + quadrado);
    }
    
}
