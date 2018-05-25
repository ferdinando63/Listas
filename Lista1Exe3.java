package lista.pkg1.exe.pkg3;

import java.util.Scanner;

public class Lista1Exe3 {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    double raio;
    double altura;
    double volume;
    double pi = 3.14;
    
    
        System.out.println("Digite o raio da lata: ");
         raio = input.nextDouble();
         
        System.out.println("Digite a altura da lata; ");
         altura = input.nextDouble();
         
        volume = pi * Math.pow(raio,2) * altura;
        
        System.out.println("Volume da lata: " + volume);
    }
    
}
