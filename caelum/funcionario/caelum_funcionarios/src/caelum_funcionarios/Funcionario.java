package caelum_funcionarios;

class Funcionario {
    private String nome, departamento, rg;
    private double salario;

    Funcionario(String nome, String dp, String rg, double salario){
        this.nome = nome;
        this.departamento = dp;
        this.rg = rg;
        this.salario = salario;
    }
    
    public String getRg(){
        return this.rg;
    }
    void recebeAumento(double aumento){
        salario += aumento;
    }

    void calculaGanhoAnual(){
        System.out.println(salario * 12);
    }

    public void displayFuncionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("RG: " + rg);
        System.out.println("Salário: " + salario);
        System.out.println("    ");
        
    }

}
