package listajava.pkg1.exe.pkg9;

import java.util.Scanner;

public class ListaJava1Exe9 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n1;
        int n2;
        
        System.out.println("Digite o primeiro número: ");
         n1 = input.nextInt();
         
        System.out.println("Digite o segundo número: ");
         n2 = input.nextInt();
         
        if (n1 % n2 == 0){
            System.out.println("São primos!");
        }
        
        if (n1 % n2 != 0){
            System.out.println("Não são primos!");
        }
    }
    
}
