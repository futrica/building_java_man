import java.util.Scanner;
public class ExemploIf {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("digite uma temperatura");
        double temp = tec.nextDouble();
        if(temp < 18){
            System.out.println("está muito frio");
        } else if(temp > 18 ){
            System.out.println("ameno");
        } else {
            System.out.println("calor");
        }
        System.out.println("fim");
    }
}
