import java.util.Scanner;

public class ExemploScanner {

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = teclado.next();
        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();
        System.out.println("Digite sua letra favorita");
        char letra = teclado.next().charAt(0);
        System.out.println("O seu nome é" + nome + " sua idade é " + "e sua letra predileta é " + letra);




    }
}

