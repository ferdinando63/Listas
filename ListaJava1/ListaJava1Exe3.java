package listajava.pkg1.exe.pkg3;

import java.util.Scanner;

public class ListaJava1Exe3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Integer num;
        String entrada;
        String saida;
        
        System.out.println("Digite no mínimo três números: "); 
         num = input.nextInt();
         entrada = num.toString();
        
         saida = ""; 
         
        if (entrada.length()>=3){
            
        for (int i = entrada.length(); i > 0; i--) {
            
            saida += entrada.substring(i - 1, i);
            
        }
        
          System.out.println("Número invertido: "+ saida);
        
        }else{
            
            System.out.println("Não tem 3 dígitos");
        
        }
    }
    
}
