// exercicio 5 da atividade

import java.util.Scanner;

public class Exercicio5 {

    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("digite um ano");
        int year = kb.nextInt();
        System.out.println("digite um mes - 1 a 12");
        int month = kb.nextInt();
        switch(month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("no ano: "+ year + " o mes " + month + " tem: 31 dias ");
            break;

        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("no ano: "+ year + " o mes " + month + " tem: 30 dias ");
            break;

        case 2:
            if((year % 4) == 0){
                System.out.println("no ano: "+ year + " o mes " + month + " tem 29 dias");
            }   else
                System.out.println("no ano: "+ year +  " o mes "+ month + " tem 28 dias ");
       }
    }
}


