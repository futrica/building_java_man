// exercicio 1 da atividade

import java.util.Scanner;

public class Exercicio1 {

    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("digite um ano");
        String year = kb.next();
        System.out.println("digite um semestre");
        String semester = kb.next();
        System.out.println("ano: "+ year + " e" + " semestre: " + semester);
    }
}

