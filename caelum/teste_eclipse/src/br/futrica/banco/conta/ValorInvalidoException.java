package br.futrica.banco.conta;

public class ValorInvalidoException extends RuntimeException {
	
	ValorInvalidoException(double valor){
		super("valor inv�lido " + valor);
	}
}
