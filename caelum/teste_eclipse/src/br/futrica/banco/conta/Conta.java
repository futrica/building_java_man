/**
 * Método responsável em moldar um classe de um banco
 * 
 * @author futrica
 */

package br.futrica.banco.conta;

public abstract class Conta {
    protected double saldo;
    protected int numero;
    protected String nome;
    
    //Conta(double saldo){
    //    saldo = this.saldo;
    //}
    
    //public void setSaldo(double saldo){
    //    saldo = this.saldo;
    //}
    
    /**
     * Método que retorna o saldo da conta
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
    
    @Override
    public String toString() {
    	return "conta corrente";
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
}
