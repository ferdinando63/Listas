package lista.pkg1.exe.pkg1;

import java.util.Scanner;

public class Lista1Exe1 
{
 
    public static void main(String[] args) 
    {
         
    Scanner input = new Scanner (System.in); 
        double soma;
        double produto;
        double n;
        double m;
        double diferenca;
        double media;
        
        System.out.println("Digite o pimeiro número: ");
         n = input.nextInt();
        
        System.out.println("Digite o segundo número: ");
         m = input.nextInt();
         
         
        soma = n + m;
        produto = n * m;
        diferenca = n - m;
        media = (n + m) / 2;
        
        System.out.println("Soma: "+ soma);
        System.out.println("Produto: "+ produto);
        System.out.println("Diferença: "+ diferenca);
        System.out.println("Média: "+ media);
    }
    
}
