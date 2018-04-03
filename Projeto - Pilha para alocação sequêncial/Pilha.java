/**
 * @class Pilha
 * @author Fernando
 */
public class Pilha {

    private int v[];
    private int topo;
    int tamanho;

    // Construtor da classe pilha 
    Pilha(int tamanho) {
    
        // Atribui tamanho da pilha
        this.tamanho = tamanho;
        // Setta a valor inicial do vetor
        topo = -1;
        // Cria vetor da pilha
        v = new int[tamanho];
    }

    public int getTopo() {
        return topo;
    }

    public int getTamanho() {
        return tamanho;
    }
    
    /*
    * Retorna um determinado valor da pilha
    */
    public int getValor(int pos) {
        return v[pos];
    }
  
    /*
    * Empilha valores no vetor
    * @return pilha +1
    */
    public void empilha(int val) {
        topo++;
        v[topo] = val;
    }
    
    /*
    * Desempilha valores do vetor
    * @return pilha -1 
    */
    public void desempilha() {
        topo--;
    }
  
    /*
    * Verifica se a filha está cheia
    * @return true ou false
    */
    public boolean pilhaCheia() {
        return topo == tamanho - 1;
    }
    
    /*
    * Verifica se a pilha está vazia
    * @return true ou false
    */
    public boolean pilhaVazia() {
        return topo == -1;
    }
}
