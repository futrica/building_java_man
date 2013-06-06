// exercicio 3 da atividade

import java.util.Scanner;

public class Exercicio3 {

    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("a tempetura");
        int temp = kb.nextInt();
        if(temp >= 0 & temp <= 1000){
            System.out.println(temp + " e vermelho itenso ");
        } else if(temp >= 1001 & temp <= 2000) {
            System.out.println(temp + " e luz de velas ");
        } else if(temp >= 2001 & temp <= 4000) {
            System.out.println(temp + " e por do sol ");
        } else if(temp >= 4001 & temp <= 5000) {
            System.out.println(temp + " e lampada fluorescente ");
        } else if(temp >= 5001 & temp <= 6500) {
            System.out.println(temp + " e luz do meio dia ");
        } else if(temp >= 6501 & temp <= 8000) {
            System.out.println(temp + " e ceu azul ");
        } else if(temp >= 8001 & temp <= 9600) {
            System.out.println(temp + " e ceu nublado ");
        } else {
            System.out.println("valor invalido");
        }
    }
}

