package lista.pkg1.exe.pkg4;

import java.util.Scanner;

public class Lista1Exe4 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        
        System.out.println("Digite o valor de A: ");
         a = input.nextInt();
         
        System.out.println("Digite o valor de B: ");
         b = input.nextInt();
         
        c = a;
        a = b;
        b = c;
        
        System.out.println("O valor de A é: " + a);
        System.out.println("O valor de B é: " + b);
        
        
    }
    
}
