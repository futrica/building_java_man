package caelum_funcionarios;

public class Caelum_funcionarios {

    public static void main(String[] args) {

        ArrayFuncionarios fun = new ArrayFuncionarios(10);

            fun.insert("João", "RH", "28.288.288-X", 5500.00);
            fun.insert("José ", "DP", "29.299.299-Y", 5600.00);
            fun.insert("Maria", "VENDAS", "27.277.277-Z", 5700.00);
            fun.insert("Geralda", "COMPRAS", "26.266.266-A", 5600.00);

            fun.displayEmpregados();



            fun.find("28.288.288-X");

            fun.delete("28.288.288-X");



            System.out.println("excluindo");
            fun.displayEmpregados();
            
            System.out.println(Funcionario.getIdentificador());
                       
    }
}


