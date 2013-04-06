class Portas{
    boolean aberta;
    String cor;

    boolean abre(){
        return aberta = true;
    }

    void fecha(){
        aberta = false;
    }

    void estaAberta(){
        if(aberta = true){
            System.out.println("a porta está aberta");
        } else
            System.out.println("a porta está fechada");


    }
}
