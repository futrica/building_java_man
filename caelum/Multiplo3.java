//  Imprima todos os múltiplos de 3, entre 1 e 100.

class Multiplo3 {
    public static void main(String[]args){
        int num = 1;

        while (num <= 100){
            if (num % 3 == 0 ){
                System.out.println(num);
            }
            num = num +1;
        }

    }
}
