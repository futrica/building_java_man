// exercicios imprimir a soma de 1 até 1000
class NumUmAteMil {
    int num, div, som, resultado, sub;

    void somaUmAteMil(){
        int num = 0;
        int parc = 0;
        while (num <= 1000){
            parc = parc + num;
            System.out.println(parc );
        num = num +1;
        }

    }

    void dividirNum(){
        resultado = num / div;
    }

    void somarNum(){
        resultado = num + som;
    }

    void subtrairNUm(){
        resultado = num - sub;
    }
}

