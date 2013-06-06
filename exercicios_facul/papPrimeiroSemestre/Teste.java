import java.util.Scanner;

public class Teste{

    public static void main(String []args){
    Scanner scanner = new Scanner(System.in);

     int m[][] = new int[5][5];

    		for ( int i = 0; i < 5; i++ ) {
			for ( int j = 0; j < 5; j++) {
			System.out.print("Digite o elemento da " + (i+1) + "a linha e " + (j+1) + "a coluna da matriz: ");
				m[i][j] = scanner.nextInt();
			}

            }

            System.out.println(determinant(m));
    }

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
      }
      else{
        s=-1;
      }
      sum+=s*matrix[0][i]*(determinant(smaller));
    }
    return(sum);
  }
}
