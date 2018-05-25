package pkg2exe1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int n;
    
    System.out.println("Digite o número: ");
     n = input.nextInt();
     
    if (n % 2 == 0){
      System.out.println("O número é par!");
    }
      if (n % 2 != 0){
        System.out.println("O número é impar!");
      }
        if (n >= 0){
          System.out.println("O número é positivo!"); 
        }  
          if(n < 0){
            System.out.println("O número é negativo!");
          }    
    }
    
}
