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

        //mover todos os elementos
        for (int i = this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;


    }

    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }


}
