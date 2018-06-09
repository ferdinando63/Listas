package listajava.pkg1.exe.pkg6;

import java.util.Scanner;

public class ListaJava1Exe6 {

    public static void main(String[] args) {
        
        int n1;
        int n2;
        int soma;
        int produto;
        int diferença;
        float quociente;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite dois números: ");
         n1 = input.nextInt();
         n2 = input.nextInt();
         
        soma = n1 + n2;
        produto = n1 * n2;
        diferença = n1 - n2;
        quociente = n1 / n2;
        
        System.out.println("Números digitados: "+ n1 + " e "+ n2);
        System.out.println("Soma: "+ soma);
        System.out.println("Produto: "+ produto);
        System.out.println("Diferença: "+ diferença);
        System.out.println("Quociente: "+ quociente);
    }
    
}
