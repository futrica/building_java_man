class Teste{
    public static void main(String []args){

        Calculadora calc = new Calculadora();

        double res = calc.operacao(1 ,2.0);
        System.out.println(res);

        res = calc.operacao(5 ,2);
        System.out.println(res);

        res = calc.operacao(2 ,6);
        System.out.println(res);

        res = calc.operacao(3.0 ,2.0);
        System.out.println(res);

        res = calc.operacao(1 ,2.0);
        System.out.println(res);


    }
}
