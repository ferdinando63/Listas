package lista.pkg2.exe.pkg2;

import java.util.Scanner;

public class Lista2Exe2 {
 
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
     int l1;
     int l2;
     int l3;
     
        System.out.println("Digite o L1: ");
        l1 = input.nextInt();
        
        System.out.println("Digite o L2: ");
        l2 = input.nextInt();
        
        System.out.println("Digite o L3: ");
        l3 = input.nextInt();
        
    if (l1 == l2 && l2 == l3){
        System.out.println("O triângulo é equilátero");
    }
    if (l1 != l2 && l1 != l3 && l2 != l3){
        System.out.println("O triângulo é escaleno");
    }
    if (l1 == l2 && l1 != l3 && l2 != l3){
        System.out.println("O triângulo é isósceles");
    
    }
    
    }
    
}
