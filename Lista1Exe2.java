package lista.pkg1.exe.pkg2;

import java.util.Scanner;

public class Lista1Exe2 
{
    
    public static void main(String[] args) 
    {
     Scanner input = new Scanner (System.in); 
     double c;
     double f;
     
        System.out.println("Digite a temperatura: ");
         c = input.nextDouble();
         
        f = (9 * c + 160) / 5;
        
        System.out.println("Temperatura em Fahrenheit: " + f);
    }
    
}
