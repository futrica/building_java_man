package banco;

public class Banco {

    public static void main(String[] args) {
        Conta conta = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        ArrayContas ar;
        ar = new ArrayContas();
        
        ar.contas[0] = conta;
        ar.contas[1] = cc;
        ar.contas[2] = cp;
        
        ar.contas[0].deposita(1000);
        ar.contas[1].deposita(1000);
        ar.contas[2].deposita(1000);
        
        AtualizadorContas at = new AtualizadorContas();
        
        at.AtualizarContas(0.2);
        

        
       for (int i = 0; i < ar.contas.length; i++ ){
            at.roda(ar.contas[i]);
            System.out.println(ar.contas[i].getSaldo());
            
       }
        
       
       System.out.println(at.getSaldoTotal());
    }
}
