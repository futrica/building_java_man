/**
* Classe utilizada para representar um conjunto de números, em que podemos
* localizar o valor do maior elemento, menor elemento e
* media dos elementos do vetor.
*
*/
public class Numeros {

int valores[] = new int[10];

public void localizarMaior() {
    int maior = valores[0];
    for(int i = 0; i< valores.length; i ++ ){

        if (valores[i] > maior){
        maior = valores[i] ;
        }
    }
   System.out.println(maior);
}


public void localizarMenor() {
    int menor = valores[0];
    for(int i = 0; i< valores.length; i ++ ){

        if (valores[i] < menor){
        menor = valores[i] ;
        }
    }
   System.out.println(menor);
}




public void calcularMedia() {
    int soma = 0;
    for(int i = 0; i< valores.length; i ++ ){
    soma = soma + valores[i];
    }
    System.out.println(soma);
}

}


