package listajava.pkg2.exe.pkg5;

public class Data {
    
    private int mes;
    private int dia;
    private int ano;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void mostrar(){
        
      System.out.println(mes + "/" + dia + "/" + ano);
    }
    
}
