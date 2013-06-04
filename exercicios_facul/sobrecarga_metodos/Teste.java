import java.util.Scanner;

class Teste{
    public static void main(String []args){
        Scanner kb = new Scanner(System.in);
        Pessoa pes = new Pessoa();
        //auxiliares
        String name, idade, pesalt;


        System.out.println("entre com o nome:");
        name = pes.dizerInformacao(kb.nextLine());

        System.out.println("entrre com a idade:");
        idade = pes.dizerInformacao(kb.nextInt());

        System.out.println("entre com o peso e altura:");
        pesalt = pes.dizerInformacao(kb.nextDouble(),kb.nextDouble()) ;

        System.out.println(name);
        System.out.println(idade);
        System.out.println(pesalt);

    }
}
