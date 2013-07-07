/**
 * M�todo respons�vel em moldar um classe de um banco
 * 
 * @author futrica
 */

package br.futrica.banco.conta;

public abstract class Conta {
    protected double saldo;
    
    //Conta(double saldo){
    //    saldo = this.saldo;
    //}
    
    //public void setSaldo(double saldo){
    //    saldo = this.saldo;
    //}
    
    /**
     * M�todo que retorna o saldo da conta
     * @return saldo da conta
     */
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void deposita(double valor) {
        this.saldo += valor;       
    }  
    
    public void saca(double valor ){
        this.saldo -= valor;
    }
    
    public void atualiza(double taxa){ //atualiza a conta de acordo com valor fornecido
        this.saldo += saldo * taxa;
    }
    
}
