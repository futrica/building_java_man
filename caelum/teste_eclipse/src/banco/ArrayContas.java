package banco;

public class ArrayContas {
    private int nElements = 0;
    public Conta contas[] = new Conta[2];
       
    public void insert(Conta c){
        contas[nElements] = c;
        this.nElements ++;
    }
    
    public int getnElements(){
        return this.nElements;
    }
    
}
