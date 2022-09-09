import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;


    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    public String[] getElementos() {
        return elementos;
    }

    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }

    public void adiciona(String elemento) throws Exception {
        this.aumentaCapacidade();
        if (tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            throw new Exception("Vetor já está cheio!");
        }
    }

    //busca
    public String busca(int posicao){
        if ( !(posicao >= 0 && posicao <= tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento){
        for (int i = 0; i < tamanho; i++){
            if (elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    //adiciona elemento em qualquer posição
    public boolean adicionar(int posicao, String elemento){
        if ( !(posicao >= 0 && posicao <= tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        this.aumentaCapacidade();

        //mover todos os elementos
        for (int i = this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;


    }

    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i<this.elementos.length; i++){
                elementosNovos[i]= elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
//      B C D G F   = POSICAO A SER REMOVIDA 1
    //  0 1 2 3 4   = TAMANHO 5
    //  VETOR[1] = VETOR[2]
    //  VETOR[2] = VETOR[3]
    //  VETOR[3] = VETOR[4]

    public void remove(int posicao){
        if ( !(posicao >= 0 && posicao <= tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        for (int i = posicao; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];

        }
        this.tamanho--;

    }

    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }


}
