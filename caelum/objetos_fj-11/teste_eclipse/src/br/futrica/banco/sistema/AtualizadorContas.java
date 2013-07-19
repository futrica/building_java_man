package br.futrica.banco.sistema;

import br.futrica.banco.conta.Conta;


public class AtualizadorContas {
    private double saldoTotal = 0;
    private double selic;
    
    public void AtualizarContas(double selic ){
        this.selic = selic;
    }
    
    public void roda(Conta c ){
        c.atualiza(this.selic);
        saldoTotal = c.getSaldo() + saldoTotal;
    }
    
    public double getSaldoTotal(){
        return this.saldoTotal;
    }
    
}
