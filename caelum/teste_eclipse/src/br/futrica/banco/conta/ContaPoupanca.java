package br.futrica.banco.conta;


public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
    
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

@Override
	public int compareTo(ContaPoupanca o) {
		if (this.getNome().charAt(0) < o.getNome().charAt(0)) {
			return -1;
		}
		if (this.getNome().charAt(0) > o.getNome().charAt(0)) {
			return 1;
		}

	return 0;
	}
	
}
