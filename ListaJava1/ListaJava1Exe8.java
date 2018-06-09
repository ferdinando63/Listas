package listajava.pkg1.exe.pkg8;

import java.util.Scanner;

public class ListaJava1Exe8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n1;
        int n2;
        int n3;
        int soma;
        int produto;
        int menor = 1000;
        int maior = 0;
        int media;
        
        System.out.println("Digite a primeiro nota: ");
         n1 = input.nextInt();
         
        System.out.println("Digite a segundo nota: ");
         n2 = input.nextInt();
         
        System.out.println("Digite a terceira nota: ");
         n3 = input.nextInt();
         
        if (n1 < menor){
            menor = n1;
        }
        if (n1 > maior){
            maior = n1;
        }
        
        if (n2 < menor){
            menor = n2;
        }
        if (n2 > maior){
            maior = n2;
        }
        
        if (n3 < menor){
            menor = n3;
        }
        if (n3 > maior){
            maior = n3;
        }
        
        soma = n1 + n2 + n3;
        
        produto = n1 * n2 * n3;
        
        media = (n1 + n2 + n3) / 3;
        
        System.out.println("Maior nota: "+ maior);
        System.out.println("Menor nota: "+ menor);
        System.out.println("Soma: "+ soma);
        System.out.println("Produto: "+ produto);
        System.out.println("Média: "+ media);
    }
    
}
