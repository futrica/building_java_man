// exercicio 4 da atividade

import java.util.Scanner;

public class Exercicio4 {

    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("digite um mes - 1 a 12 ");
        int month = kb.nextInt();
        switch (month) {
        case 1:
        case 2:
            System.out.println("1 bimestre");
            break;
        case 3:
        case 4:
            System.out.println("2 bimestre");
            break;
        case 5:
        case 6:
            System.out.println("3 bimestre");
            break;
        case 7:
        case 8:
            System.out.println("4 bismestre");
            break;
        case 9:
        case 10:
            System.out.println("5 bismestre");
            break;
        case 11:
        case 12:
            System.out.println("6 bismestre");
        default:
            System.out.println("mes invalido!");
        }
    }
}
