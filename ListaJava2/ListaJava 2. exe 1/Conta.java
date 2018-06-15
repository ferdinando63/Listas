package listajava.pkg2.exe.pkg1;

public class Conta {
    
    private float saldo;
    private float deposito;
    private float saque;
    
    
    public float getDeposito(){
        return this.deposito;
    }
    public void setDeposito(float deposito){
        this.deposito = deposito;
        depositar();
        System.out.println("Deposito de: R$:" + getDeposito() + " foi realizado!");
    }
     
    public float getSaque(){
        return this.saque;
    }
    public void setSaque(float saque){
        this.saque = saque;
        sacar();
    }
     
    private void depositar(){
        saldo = deposito + saldo;
    }     
                
    private void sacar(){
        
        if (saque <= saldo){
            
            saldo = saldo - saque;
        
            System.out.println("Saque de R$:" + getSaque() + " foi realizado!");   
        }
        
        else if (saque > saldo){
            System.out.println("Você não possui essa quantia!");
        }  
    }
    
    public void imprimir(){
        System.out.println("Seu saldo: R$" + this.saldo);
    } 
}