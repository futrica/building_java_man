import java.util.Scanner;

public class Menu {
    int opt;
    Matriz menuADC = new Matriz();
    Scanner kb = new Scanner(System.in);
	//
    public void escolheOpcao(){
    System.out.println("Digite sua opção:\n1: Adicionar Matrizes\n2: Calculos com matrizes\n0: Sair");

    opt = kb.nextInt();
    do {

        switch (opt){
            case 1:
                menuADC.adicionaMatrizes();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                    System.out.println("Opção Inválida!");

        }
      }  while(opt != 0 );
    }
}
