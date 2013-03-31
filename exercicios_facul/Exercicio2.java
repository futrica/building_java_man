// exercicio 2 da atividade

import java.util.Scanner;

public class Exercicio2 {

    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("digite um ano");
        int year = kb.nextInt();
        if((year % 4) == 0){
            System.out.println("o ano: "+ year + " e bissesto ");
        } else
            System.out.println("o ano: "+ year +  " nao e bissesto ");


    }
}

