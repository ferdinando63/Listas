package lista.pkg3.exe.pkg5;

import java.util.Scanner;

public class Lista3Exe5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int y = 0;
        int x;
        int somap = 0;
        int somai = 0;
        
        while (y <= 1000){
            System.out.println("Digite um número: ");
             y = input.nextInt();
             
            for (x = 0; x <= y; x++){
                if (x % 2 == 0){
                    somap = somap + x;
                }
                else{ 
                    somai = somai + x;
                }
            }
            System.out.println("Soma dos pares: " + somap);
            System.out.println("Soma dos impares: " + somai);
        }
    }
}    

