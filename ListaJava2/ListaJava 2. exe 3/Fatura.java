package listajava.pkg2.exe.pkg3;

public class Fatura {
    
    
    private String descricao;
    private String numero; 
    private int quantidade;
    private double preco;
    double total;
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void calcFatura(int x, double y){
        
        this.setQuantidade(x);
        this.setPreco(y);
 
        if (this.getQuantidade() < 0){
          total = 0;  
        }
        
        else if (this.getPreco() < 0){
          total = 0;
        }
        
        else
          total = this.preco * this.getQuantidade(); 
        
          System.out.println("Valor da fatura é: " + total);
    }
}
