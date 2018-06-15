package listajava.pkg2.exe.pkg2;

import java.util.Scanner;

public class Cliente {
    
    Scanner input = new Scanner(System.in);
    String destino;
    String nome;
    String origem;
    String data;
    String ida;
    String volta;
    long cpf;
    float valor;
    
    public void dados(){ 
        
        System.out.println("Nome do cliente: ");
        nome = input.next();
        this.nome = nome;
        
        System.out.println("CPF do cliente: ");
        cpf = input.nextLong();
        this.cpf = cpf;
        
        System.out.println("Cidade e o estado de origem: ");
        origem = input.next();
        this.origem = origem;
        
        System.out.println("Cidade e o estado destino: ");
        destino = input.next();
        this.destino = destino;
        
        System.out.println("Data de ida e de volta: ");
        ida = input.next();
        volta = input.next();
        
        
        System.out.println("Informe o valor da viagem");
        float valor1 = input.nextFloat();
        this.valor = valor1;
    }
    
    public void mostrar(){
        
        System.out.println("  ");
        System.out.println("Obrigado por escolher a nossa agência aérea");
        System.out.printf ("Origem: %s   Destino: %s\n", origem, destino);
        System.out.println("Valor: R$" + valor);
        System.out.println("Nome do passageiro: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de ida" + ida);
        System.out.println("Data de volta" + volta);
        System.out.println("Desejamos que tenha um execelente vôo!!!");   
    }
}