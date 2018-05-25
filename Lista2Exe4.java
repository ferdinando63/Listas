package lista.pkg2.exe.pkg4;

import java.util.Scanner;

public class Lista2Exe4 {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int n1;
    int n2;
    int n3;
    char c;
    char d;
    char opcao;
    
        System.out.println("Escolha a opção (c)Crescente ou (d)Decrescente: ");
         opcao = input.nextLine().charAt(0);
         System.out.println("   ");
         
        System.out.println("Digite os números: ");
         n1 = input.nextInt();
         n2 = input.nextInt();
         n3 = input.nextInt();
         System.out.println("   ");
        
      switch (opcao){
          case 'c':
              if (n1 < n2 && n2 < n3){
                  System.out.println(n1 + "  " + n2 + "  " + n3);
              }
              if (n1 < n3 && n3 < n2){
                  System.out.println(n1 + "  " + n3 + "  " + n2);
              }
              if (n2 < n1 && n1 < n3){
                  System.out.println(n2 + "  " + n1 + "  " + n3);
              }
              if (n2 < n3 && n3 < n1){
                  System.out.println(n2 + "  " + n3 + "  " + n1);
              }
              if (n3 < n1 && n1 < n2){
                  System.out.println(n3 + "  " + n1 + "  " + n2);
              }
              if (n3 < n2 && n2 < n1){
                  System.out.println(n3 + "  " + n2 + "  " + n1);
              }
              break;
              
                  
          case 'd':
              if (n1 > n2 && n2 > n3){
                  System.out.println(n1 + "  " + n2 + "  " + n3);
              }
              if (n1 > n3 && n3 > n2){
                  System.out.println(n1 + "  " + n3 + "  " + n2);
              }
              if (n2 > n1 && n1 > n3){
                  System.out.println(n2 + "  " + n1 + "  " + n3);
              }
              if (n2 > n3 && n3 > n1){
                  System.out.println(n2 + "  " + n3 + "  " + n1);
              }
              if (n3 > n1 && n1 > n2){
                  System.out.println(n3 + "  " + n1 + "  " + n2);
              }
              if (n3 > n2 && n2 > n1){
                  System.out.println(n3 + "  " + n2 + "  " + n1);
              }
              break;
                           
        }  
    }
    
}
