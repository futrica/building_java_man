import java.util.Scanner;

public class Matriz{
	public static void main(String[] args){
		int opc;

		do {

			Scanner scanner = new Scanner(System.in);
			System.out.println();
			System.out.println("+-------------------------------------------+");
			System.out.println("|      M E N U     D E    O P C O E S       |");
			System.out.println("+-------------------------------------------+");
			System.out.println("| [1] - Realizar Soma de matrizes           |");
			System.out.println("| [2] - Realizar Subtração de matrizes      |");
			System.out.println("| [3] - Realizar comparação de matrizes     |");
			System.out.println("| [4] - Realizar multiplicação de matriz    |");
			System.out.println("|       por um número                       |");
			System.out.println("| [5] - Calcular determinante de uma matriz |");
			System.out.println("+-------------------------------------------+");
			System.out.println("| [6] - S A I R                             |");
			System.out.println("+-------------------------------------------+");
			System.out.print(" Escolha uma opcao: ");
			opc = scanner.nextInt();

			switch( opc ){
				case 1:
					somaMatriz();
					break;
				case 2:
					subtraiMatriz();
					break;
				case 3:
					igualdadeMatriz();
					break;
				case 4:
					multiplicacaoMatriz();
					break;
				case 5:
					determinanteMatriz();
					break;
				case 6:
					break;
				default:
					System.out.print("*********************\n");
					System.out.print("*- Opção Inválida! -*\n");
					System.out.print("*********************\n");
			}

		} while ( opc != 6 );

	}

/////////////////////////////////////////////////////////////////////////////////////

	public static void somaMatriz(){

		int ordem = 0;
		int[][] matrizA, matrizB, matrizSoma;

		Scanner scanner = new Scanner(System.in);
		while ( ordem < 1 || ordem > 5 ){
			System.out.print("\nDigite a ordem da matriz: ");
			ordem = scanner.nextInt();
			if ( ordem < 1 || ordem > 5 ){
				System.out.println();
				System.out.println("A matriz deve estar entre as ordens 1 e 5!");
			}
		}
		System.out.println();
		matrizA = new int[ordem][];
		matrizB = new int[ordem][];
		matrizSoma = new int[ordem][];

		for ( int i = 0; i < matrizA.length; i++ ) {
			matrizA[i] = new int[ordem];
		}


		for ( int i = 0; i < matrizA.length; i++ ) {
			for ( int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Digite o elemento da " + (i+1) + "a linha e " + (j+1) + "a coluna da matriz A: ");
				matrizA[i][j] = scanner.nextInt();
			}
		}
		System.out.println();

		for ( int i = 0; i < matrizB.length; i++ ) {
			matrizB[i] = new int[ordem];
		}

		for ( int i = 0; i < matrizB.length; i++ ) {
			for ( int j = 0; j < matrizB[i].length; j++ ) {
				System.out.print("Digite o elemento da " + (i+1) + "a linha e " + (j+1) + "a coluna da matriz B: ");
				matrizB[i][j] = scanner.nextInt();
			}
		}
		System.out.println();


// SOMANDO AS MATRIZES

		for ( int i = 0; i < matrizSoma.length; i++ ) {
			matrizSoma[i] = new int[ordem];
		}


		for ( int i = 0; i < matrizA.length; i++ ) {
			for ( int j = 0; j < matrizA[i].length; j++ ) {
				matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}

		System.out.print("\nA soma da matriz A:\n");
		for ( int i = 0; i < matrizA.length; i++ ) {
			for ( int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.print("\ncom a matriz B:\n");
		for ( int i = 0; i < matrizB.length; i++ ) {
			for ( int j = 0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.print("\nResulta na matriz:\n");
		for ( int i = 0; i < matrizSoma.length; i++ ) {
			for ( int j = 0; j < matrizSoma[i].length; j++) {
				System.out.print(matrizSoma[i][j] + "  ");
			}
			System.out.println();
		}


	}


	public static void subtraiMatriz(){
		int ordem = 0;
		int[][] matrizA, matrizB, matrizSubtracao;

		Scanner scanner = new Scanner(System.in);
		while ( ordem < 1 || ordem > 5 ){
			System.out.print("\nDigite a ordem da matriz: ");
			ordem = scanner.nextInt();
			if ( ordem < 1 || ordem > 5 ){
				System.out.println();
				System.out.println("A matriz deve estar entre as ordens 1 e 5!");
			}
		}
		System.out.println();
		matrizA = new int[ordem][];
		matrizB = new int[ordem][];
		matrizSubtracao = new int[ordem][];

		for ( int i = 0; i < matrizA.length; i++ ) {
			matrizA[i] = new int[ordem];
		}


		for ( int i = 0; i < matrizA.length; i++ ) {
			for ( int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Digite o elemento da " + (i+1) + "a linha e " + (j+1) + "a coluna da matriz A: ");
				matrizA[i][j] = scanner.nextInt();
			}
		}
		System.out.println();

		for ( int i = 0; i < matrizB.length; i++ ) {
			matrizB[i] = new int[ordem];
		}

		for ( int i = 0; i < matrizB.length; i++ ) {
			for ( int j = 0; j < matrizB[i].length; j++ ) {
				System.out.print("Digite o elemento da " + (i+1) + "a linha e " + (j+1) + "a coluna da matriz B: ");
				matrizB[i][j] = scanner.nextInt();
			}
		}
		System.out.println();

// SUBTRAINDO AS MATRIZES

		for ( int i = 0; i < matrizSubtracao.length; i++ ) {
			matrizSubtracao[i] = new int[ordem];
		}


		for ( int i = 0; i < matrizA.length; i++ ) {
			for ( int j = 0; j < matrizA[i].length; j++ ) {
				matrizSubtracao[i][j] = matrizA[i][j] - matrizB[i][j];
			}
		}

		System.out.print("\nA subtração entre a matriz A:\n");
		for ( int i = 0; i < matrizA.length; i++ ) {
			for ( int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.print("\ne a matriz B:\n");
		for ( int i = 0; i < matrizB.length; i++ ) {
			for ( int j = 0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.print("\nResulta na matriz:\n");
		for ( int i = 0; i < matrizSubtracao.length; i++ ) {
			for ( int j = 0; j < matrizSubtracao[i].length; j++) {
				System.out.print(matrizSubtracao[i][j] + "  ");
			}
			System.out.println();
		}


	} // FIM DO MÉTODO subtraiMatriz

////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void igualdadeMatriz(){

		int ordem = 0;
		int[][] matrizA, matrizB;

		Scanner scanner = new Scanner(System.in);
		while ( ordem < 1 || ordem > 5 ){
			System.out.print("\nDigite a ordem da matriz: ");
			ordem = scanner.nextInt();
			if ( ordem < 1 || ordem > 5 ){
				System.out.println();
				System.out.println("A matriz deve estar entre as ordens 1 e 5!");
			}
		}

		System.out.println();
		matrizA = new int[ordem][];
		matrizB = new int[ordem][];

		for ( int i = 0; i < matrizA.length; i++ ) {
			matrizA[i] = new int[ordem];
		}


		for ( int i = 0; i < matrizA.length; i++ ) {
			for ( int j = 0; j < matrizA[i].length; j++) {
				System.out.print("Digite o elemento da " + (i+1) + "a linha e " + (j+1) + "a coluna da matriz A: ");
				matrizA[i][j] = scanner.nextInt();
			}
		}
		System.out.println();

		for ( int i = 0; i < matrizB.length; i++ ) {
			matrizB[i] = new int[ordem];
		}

		for ( int i = 0; i < matrizB.length; i++ ) {
			for ( int j = 0; j < matrizB[i].length; j++ ) {
				System.out.print("Digite o elemento da " + (i+1) + "a linha e " + (j+1) + "a coluna da matriz B: ");
				matrizB[i][j] = scanner.nextInt();
			}
		}
		System.out.println();

// VERIFICANDO A IGUALDADE DAS MATRIZES

		boolean ehIgual = false;

		for ( int i = 0; i < matrizA.length; i++ ) {
			for ( int j = 0; j < matrizA[i].length; j++ ) {
				if ( matrizA[i][j] == matrizB[i][j] ) {
					ehIgual = true;
				} else {
					ehIgual = false;
				}
			}
		}

		System.out.print("A matriz A:\n");
		for ( int i = 0; i < matrizA.length; i++ ) {
			for ( int j = 0; j < matrizA[i].length; j++ ) {
				System.out.print(matrizA[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.print("e a matriz B:\n");
		for ( int i = 0; i < matrizB.length; i++ ) {
			for ( int j = 0; j < matrizB[i].length; j++ ) {
				System.out.print(matrizB[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();

		if ( ehIgual ) {
			System.out.print("SÃO iguais!\n");
		} else {
			System.out.print("NÃO SÃO iguais!\n");
		}

	} // FIM DO MÉTODO igualdadeMatriz

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	public static void multiplicacaoMatriz(){

		int ordem = 0, multiplicador;
		int[][] matriz, matrizResultado;

		Scanner scanner = new Scanner(System.in);
		while ( ordem < 1 || ordem > 5 ){
			System.out.print("\nDigite a ordem da matriz: ");
			ordem = scanner.nextInt();
			if ( ordem < 1 || ordem > 5 ){
				System.out.println();
				System.out.println("A matriz deve estar entre as ordens 1 e 5!");
			}
		}

		System.out.print("Digite o número pelo qual a matriz sera multiplicada: ");
		multiplicador = scanner.nextInt();
		System.out.println();
		matriz = new int[ordem][];
		matrizResultado = new int[ordem][];

		for ( int i = 0; i < matriz.length; i++ ) {
			matriz[i] = new int[ordem];
		}


		for ( int i = 0; i < matriz.length; i++ ) {
			for ( int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite o elemento da " + (i+1) + "a linha e " + (j+1) + "a coluna da matriz: ");
				matriz[i][j] = scanner.nextInt();
			}
		}
		System.out.println();

// MULTIPLICANDO A MATRIZ

		for ( int i = 0; i < matrizResultado.length; i++ ) {
			matrizResultado[i] = new int[ordem];
		}


		for ( int i = 0; i < matriz.length; i++ ) {
			for ( int j = 0; j < matriz[i].length; j++ ) {
				matrizResultado[i][j] = matriz[i][j] * multiplicador;
			}
		}

		System.out.print("\nA multilicação da matriz:\n");
		for ( int i = 0; i < matriz.length; i++ ) {
			for ( int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("\npelo numero " + multiplicador);

		System.out.print("\nResulta na matriz:\n");
		for ( int i = 0; i < matrizResultado.length; i++ ) {
			for ( int j = 0; j < matrizResultado[i].length; j++) {
				System.out.print(matrizResultado[i][j] + "  ");
			}
			System.out.println();
		}

	} // FIM DO MÉTODO multiplicacaoMatriz

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int determinant(int[][] matrix){
        int sum=0;
        int s;
        if(matrix.length==1){
            return(matrix[0][0]);
        }
        for(int i=0;i<matrix.length;i++){
            int[][]smaller= new int[matrix.length-1][matrix.length-1];
            for(int a=1;a<matrix.length;a++){
                for(int b=0;b<matrix.length;b++){
                    if(b<i){
                        smaller[a-1][b]=matrix[a][b];
                    }
                    else if(b>i){
                        smaller[a-1][b-1]=matrix[a][b];
                    }
                }
            }
            if(i%2==0){
                s=1;
            } else{
                s=-1;
            }
            sum+=s*matrix[0][i]*(determinant(smaller));
        }

            return(sum);
        }

	public static void determinanteMatriz(){

		int ordem = 0;
		int[][] m;

		Scanner scanner = new Scanner(System.in);
		while ( ordem < 1 || ordem > 5 ){
			System.out.print("\nDigite a ordem da matriz: ");
			ordem = scanner.nextInt();
			if ( ordem < 1 || ordem > 5 ){
				System.out.println();
				System.out.println("A matriz deve estar entre as ordens 1 e 5!");
			}
		}
		m = new int[ordem][];

		for ( int i = 0; i < m.length; i++ ) {
			m[i] = new int[ordem];
		}

		for ( int i = 0; i < m.length; i++ ) {
			for ( int j = 0; j < m[i].length; j++) {
				System.out.print("Digite o elemento da " + (i+1) + "a linha e " + (j+1) + "a coluna da matriz: ");
				m[i][j] = scanner.nextInt();
			}
		}
		System.out.println();

		if ( m.length == 1 ) {
           System.out.println("O valor: " +  determinant(m) + " é ");
		} else if ( m.length == 2 ) {
           System.out.println("O valor: " + determinant(m) + " é ");
		} else if ( m.length == 3 ) {
           System.out.println("O valor: " +  determinant(m) + " é ");
        }  else if ( m.length == 4 ) {
           System.out.println("O valor: " +  determinant(m) + " é ");
        } else if (m.length == 5) {
           System.out.println("O valor: " +  determinant(m) + " é ");
        } else {
			System.out.println("***INVÁLIDO***");
			return;
		}
		System.out.println("o determinante da matriz abaixo:");
		for ( int i = 0; i < m.length; i++ ) {
			for ( int j = 0; j < m[i].length; j++ ) {
				System.out.print(m[i][j]+ "  ");
			}
			System.out.println();
		}
	}
    // FIM DO MÉTODO determinanteMatriz

} // FIM DA CLASSE PrincipalMatriz
