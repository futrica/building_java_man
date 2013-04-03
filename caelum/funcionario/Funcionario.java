class Funcionario {
    String nome, departamento, rg;
    Data entrada = new Data();
    double salario;

    void recebeAumento(double aumento){
        salario += aumento;
    }

    void calculaGanhoAnual(){
        System.out.println(salario * 12);
    }

    void mostra(){
        System.out.println(nome);
        System.out.println(departamento);
        System.out.println(rg);
        entrada.mostraData();
        System.out.println(salario);
    }

}
