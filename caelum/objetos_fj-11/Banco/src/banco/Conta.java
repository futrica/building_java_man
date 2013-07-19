package banco;

public class Conta {
    protected double saldo;
    
    //Conta(double saldo){
    //    saldo = this.saldo;
    //}
    
    //public void setSaldo(double saldo){
    //    saldo = this.saldo;
    //}
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void deposita(double valor){
        this.saldo += valor;
    }  
    
    public void saca(double valor ){
        this.saldo -= valor;
    }
    
    public void atualiza(double taxa){ //atualiza a conta de acordo com valor fornecido
        this.saldo += saldo * taxa;
    }
    
}
