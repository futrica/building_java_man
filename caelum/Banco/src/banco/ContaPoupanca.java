package banco;

public class ContaPoupanca extends Conta{
    
    public void atualiza(double taxa){ //atualiza a conta de acordo com valor fornecido
        saldo += saldo * 3* taxa;
    }
}
