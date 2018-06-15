package listajava.pkg2.exe.pkg1;

import java.util.Scanner;

public class ListaJava2Exe1 {

    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in);
        int escolha;
        float saque;
        float deposito;
        
        Conta con = new Conta();
        
        do{
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Impressão do saldo");
            System.out.println("O que deseja fazer: ");
            escolha = input.nextInt();
            
            switch(escolha){ 
            case 1:
                System.out.println("Quanto quer sacar: ");
                saque = input.nextFloat();
                
                con.setSaque(saque);
                break;
                    
            case 2:
                System.out.println("Quanto quer depositar: ");
                deposito = input.nextFloat();
                
                con.setDeposito(deposito);
                break;
                    
            case 3:
                con.imprimir();
                break;
            }
        }while(escolha <= 3); 
    }
}