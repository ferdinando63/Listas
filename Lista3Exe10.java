package lista.pkg3.exe.pkg10;

import java.util.Scanner;

public class Lista3Exe10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        int x;
        int i;
        int p;
        
        System.out.println("Digite um número: ");
         num = input.nextInt();
         
        for (x = 0; x < num;){
            p = 0;
            
            for (i = 0; i < x;){
                if (x % i == 0){
                    p = p + 1;
                }
            }
                if (p == 2){
                System.out.println("Primos: "+ x);
            }
        }
    }
    
}
