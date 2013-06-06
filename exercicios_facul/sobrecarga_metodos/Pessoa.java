class Pessoa{

    //Crie uma classe chamada Pessoa sem atributo algum. Para trabalharmos os conceitos de sobrecarga de métodos, crie os seguintes métodos:

    public String dizerInformacao(String nome){
        return ("meu nome é " + nome);
        //Deve retornar um texto dizendo: “Meu nome é “+ nome.
    }

    public String dizerInformacao(int idade){
        return("minha idade é " + idade);
        //Deve retornar um texto dizendo: “Minha idade é “ + idade.
    }

    public String dizerInformacao(double peso, double altura){
        return("meu peso é " + peso + " e minha altura é " + altura);
        //Deve retornar um texto dizendo: “Meu peso é“ + peso + “e minha altura é“ + altura.
    }

}
// Munido do retorno de cada um destes métodos, imprima-os em tela.

//Para praticarmos o uso da classe Scanner, leia estas quatro informações que devem ser inseridas pelo usuário.
//(carga horária: 12h40)

