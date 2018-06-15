package listajava.pkg2.exe.pkg5;

import java.util.Scanner;

public class ListaJava2Exe5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Data d = new Data();
        System.out.println("informe o mês: ");
        int mes = input.nextInt(); 
        
        System.out.println("Informe o dia: ");
        int dia = input.nextInt();
        
        System.out.println("Informe o ano: ");
        int ano = input.nextInt();
        
        d.setDia(dia);
        d.setMes(mes);
        d.setAno(ano);
        System.out.println("  ");
        d.mostrar();
    }
    
}
