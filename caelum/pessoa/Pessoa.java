class ContaBancaria{
    String numero;
    int saldo, emprestimo, debito, credito , limite;
    boolean emprestimo;

    void consultaSaldo(){
        System.out.prinln("Seu saldo é: " + saldo + " reais " );
    }

    void consultaLimite(){
       System.out.prinln("Seu limite é: " + limite + " reais " );
    }

    int debitou(){
        saldo = saldo - debito;
    }

    boolean emprestimoAprovado(){
        emprestimo = true;
    }

}



