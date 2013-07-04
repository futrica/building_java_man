package br.futrica.banco.conta;


public class ContaPoupanca extends Conta{
    
   // public void atualiza(double taxa){ //atualiza a conta de acordo com valor fornecido
   //     saldo += saldo * 3* taxa;
   // }
	public void deposita(double valor ) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);			
		} else {
			this.saldo += valor;
		}
	}
	
}
