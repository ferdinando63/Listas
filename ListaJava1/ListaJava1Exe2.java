package listajava.pkg1.exe.pkg2;

import java.util.Scanner;

public class ListaJava1Exe2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float tempo;
        float distancia;
        float velocidade = 20;
        
        System.out.println("Digite a distância percorrida pelo Tsunami: ");
          distancia = input.nextFloat();
          
        if ( distancia <= 12){
            
            tempo = distancia / velocidade;
            tempo = tempo * 60;
            
            System.out.println("Distância do Tsunami: "+ distancia + "Km");
            System.out.println("Tempo: "+ tempo + "min");
            
        }else if (distancia > 12){
            System.out.println("Impossivel qualcular valor maior que 12Km");
        }
    }
    
}
