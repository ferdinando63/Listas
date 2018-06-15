package listajava.pkg2.exe.pkg4;

import java.util.Scanner;

public class Empregadoteste {

    public static void main(String[] args) {
        
        double a; 
        double b;
        
        Scanner input = new Scanner(System.in);
        Empregado em1 = new Empregado();
        Empregado em2 = new Empregado();
      
        em1.setNome("Ferdinando"); 
        em1.setSobrenome("Garcia"); 
        em1.setSalario(500.00);
      
        em2.setNome("Marcos"); 
        em2.setSobrenome("Sousa"); 
        em2.setSalario(-10);  
      
        em1.status();
        em2.status();
      
        System.out.println("  ");
        System.out.println("Com aumento de 10%");
        
        a = em1.getSalario() * 1.1;
        b = em2.getSalario() * 1.1;
        
        em1.setSalario(a);
        em2.setSalario(b);
        
        em1.status();
        em2.status();
    }
    
}