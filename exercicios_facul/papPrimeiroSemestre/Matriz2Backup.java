import java.util.Scanner;
//classe padrão para matrizes
public class Matriz{
    //Menu menuIni = new Menu();
    Scanner kb = new Scanner(System.in);
    int mat2x2[][] = new int[2][2];
    int mat3x3[] = new int[3];
    int mat4x4[] = new int[4];
    int mat5x5[] = new int[5];
    int num;


    void adicionaMatrizes(){
        System.out.println("Só são permitidas criar matrizes quadradas!\nDigite sua opção:\n2: Criar matriz 2x2\n3: Criar matriz 3x3\n4: Criar matriz 4x4\n5: Criar matriz 5x5\n0: Voltar ao menu inicial");

        num = kb.nextInt();
        switch (num){
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
     //           menuIni.escolheOpcao();
                break;
            default:
                System.out.println("Número Inválido");
        }
    }

    void mostraMatrizes(){
        for(int i = 0; i< mat2x2.length; i ++ ){
            for(int j = 0; j< mat2x2.length; j ++ ){
            System.out.println( mat2x2[i][j] + "  "   );
            }
        }
    }

    void somarMatrizes(){

    }

    void subtrairMatrizes(){

    }

    void multiplicaMatrizes(){

    }
    // operaçẽos uma matriz
    void  determinanteMatriz(){
        // determinantes


    }

    void multiplicaMatriz(){

    }


}
