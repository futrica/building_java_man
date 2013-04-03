class Teste {
    public static void main(String[]args){
        Funcionario fun = new Funcionario();

        fun.nome = "Joao";
        fun. departamento = "caixa";
        fun.rg = "31232";
        fun.salario = 1000;
        fun.entrada.dia = 02;
        fun.entrada.mes = 04;
        fun.entrada.ano = 2013;

        fun.recebeAumento(200);

        System.out.println(fun.salario);

        fun.calculaGanhoAnual();

        fun.mostra();
    }
}
