package lista.pkg2.exe.pkg3;

import java.util.Scanner;

public class Lista2Exe3 {

    public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);
    double n1;
    double n2;
    double n3;
    double media;
    
        System.out.println("Digite a primeira nota: ");
         n1 = input.nextDouble();
         
        System.out.println("Digite a segunda nota: ");
         n2 = input.nextDouble();
         
        System.out.println("Digite a segunda nota: ");
         n3 = input.nextDouble();
         
        if (n1 > n2 && n1 > n3)
            System.out.println("Maior nota: " + n1);
        
        else 
            if (n2 > n1 && n2 > n3)
                System.out.println("Maior nota: " + n2);
        
            else
                if (n3 > n1 && n3 > n2)
                    System.out.println("Maior nota: " + n3);
        
        media = n1 + n2 + n3 / 3;
        
        System.out.println("Média: " + media);
    }
    
}
