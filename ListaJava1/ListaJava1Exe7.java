package listajava.pkg1.exe.pkg7;

import java.util.Scanner;

public class ListaJava1Exe7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Digite dois números: ");   
         num1= input.nextInt();
         num2= input.nextInt();
                
        if (num1 > num2){
         
            System.out.println(num1+ " is larger");
        
        }
        
        if (num2 > num1){
            
            System.out.println(num2+ " is larger");                
        
        }
                
        if (num1 == num2){
            
            System.out.println("These numbers are equal "+ num1 +" and "+ num2);
        
        }
    }
    
}
