package listajava.pkg2.exe.pkg3;

import java.util.Scanner;

public class Faturateste {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Fatura f = new Fatura();
        
        System.out.println("Digite a quantidade do item: ");
        int n1 = input.nextInt();
        
        System.out.println("Digite o valor do item");
        double n2 = input.nextDouble();
        
        f.calcFatura(n1, n2);
    }
    
}
