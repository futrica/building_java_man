
package caelum_funcionarios;

public class ArrayFuncionarios {
    
    private Funcionario[] empregados;
    private int nElements;
    
    ArrayFuncionarios(int max){
        empregados = new Funcionario[max];
        nElements = 0;
    }
    
    public void find(String rg){
        boolean encontrou = false;
        for (int j = 0; j< nElements; j++){
            if (empregados[j].getRg().equals(rg)){
            encontrou = true;
            break;
            }
        }
        if (encontrou == true){
                System.out.println("O RG " + rg + " foi encontrado na base de dados");
            } else {
                System.out.println("O RG " + rg + " não consta na base de dados");
            }
    }
    
    
    public void insert(String name, String dp, String rg, double salario){
    
        empregados[nElements] = new Funcionario(name, dp, rg, salario);
        nElements++;
    }
    
    public void delete(String rg){
        int j;
        for (j =0; j< nElements; j++){
            if (empregados[j].getRg().equals(rg)){
                for (int k=j; k< nElements; k ++ ){
                    empregados[k] = empregados[k+1];
                }
                nElements--;
            } else if (j == nElements){
                System.out.println("RG não encontrado");
            }
        }
    }   
    
    public void displayEmpregados(){
        for(int j = 0; j <nElements; j++){
            empregados[j].displayFuncionario();
        }
    }

    
}
