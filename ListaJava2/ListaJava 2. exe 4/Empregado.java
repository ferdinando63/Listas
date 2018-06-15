package listajava.pkg2.exe.pkg4;

public class Empregado {
    
    private String nome;
    private String sobrenome;
    private double salario;

    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        
        if (salario < 0 ){
            salario = 0;
        }
        
        this.salario = salario;
        
    }
    
    public void status(){
        
        System.out.println(this.getNome() + " " + this.sobrenome);
        System.out.println("R$" + this.getSalario());
    }
}    