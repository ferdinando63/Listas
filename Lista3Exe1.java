package lista.pkg3.exe.pkg1;

import java.util.Scanner;

public class Lista3Exe1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        int menor = 0;
        int maior = 0; 
        int x;
         
        for (x = 0; x < 15; x++){
            
        System.out.println("Digite o número: ");
         n = input.nextInt();
         
            if (x == 1){
                menor = n;
                maior = n;
            }
            if (n < menor){
                menor = n; 
            }
            if (n > maior){
                maior = n;
            }
        }
        System.out.println("  ");
        System.out.println("Menor: "+ menor);
        System.out.println("Maior: "+ maior);
    }
    
}
