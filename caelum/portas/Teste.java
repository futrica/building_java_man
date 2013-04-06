class Teste{
    public static void main(String args[]){
        Portas porta1 = new Portas();

        porta1.cor = "verde";
        porta1.aberta = false;

        porta1.fecha();
        System.out.println("a porta " + porta1.cor);
        porta1.estaAberta();

        Portas porta2 = new Portas();
        porta2.cor = "rosa";
        porta2.aberta = false;

        porta2.fecha();
        System.out.println("a porta " + porta2.cor);
        porta2.estaAberta();



    }
}
