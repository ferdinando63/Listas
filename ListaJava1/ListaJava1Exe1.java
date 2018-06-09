package listajava.pkg1.exe.pkg1;

import java.util.Scanner;

public class ListaJava1Exe1 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int x;
        double valor = 550;
        double valortotal = 0;
        double valorsemdesconto = 0;
        double valorcomdesconto = 0;
        double desconto;
        double valorpormes;
        double reajuste; 
        
        for (x = 1; x <= 4; x++){
            if (x == 1){
                
                valortotal = valor * 12;
                valorsemdesconto = valortotal + valorsemdesconto;
                
            }else if (x == 2){
                
                reajuste = valor * 0.10;
                valor = reajuste + valor;
                valortotal = valor * 12;
                valorsemdesconto = valortotal + valorsemdesconto;
                
            }else if (x == 3){
                
                reajuste = valor * 0.10;
                valor = reajuste + valor;
                valortotal = valor * 12;
                valorsemdesconto = valortotal + valorsemdesconto;
                
            }else if (x == 4){
                reajuste = valor * 0.10;
                valor = reajuste + valor;
                valortotal = valor * 12;
                valorsemdesconto = valortotal + valorsemdesconto;
            }
        }  
        
        System.out.println("Valor sem desconto: "+ valorsemdesconto);
        System.out.println("Digite o valor do desconto: ");
          desconto = input.nextDouble();
          
          desconto = (valorsemdesconto * desconto) / 100;
          
          valorcomdesconto = valorsemdesconto - desconto;
          
        System.out.println("Valor sem desconto: "+ valorsemdesconto);
        System.out.println("Valor com desconto: "+ valorcomdesconto);
    }
    
}
