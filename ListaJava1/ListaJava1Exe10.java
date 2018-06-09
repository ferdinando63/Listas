package listajava.pkg1.exe.pkg10;

import java.util.Scanner;

public class ListaJava1Exe10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int raio;
        int diametro;
        float area;
        float circun; 
        
       System.out.println("Digite o valor do raio: ");
        raio = input.nextInt();
        
        area = (float) Math.pow(Math.PI,2);
        
        diametro = 2 * raio;
        
        circun = (float) (2 * Math.PI * raio);
        
        System.out.println("Diâmetro: "+ diametro);
        System.out.println("Circunferência: "+ circun);
        System.out.println("Área: "+ area);
       
    }
    
}
