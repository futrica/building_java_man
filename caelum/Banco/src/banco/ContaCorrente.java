package banco;

public class ContaCorrente extends Conta {
    
    
    @Override
    public void atualiza(double taxa){ //atualiza a conta de acordo com valor fornecido
        saldo += taxa * 2;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.1;
    }  
    
}
