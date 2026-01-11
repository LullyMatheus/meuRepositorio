package lista_encadeada;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    @Override
    public String toString() {

        if(this.tamanho==0){
            return "[]";
        }

        No<T> atual = this.inicio;

        StringBuilder builder = new StringBuilder("[");

        builder.append(atual.getElemento()+", ");

        for(int i=0;i<this.tamanho-2;i++){
            atual = atual.getProximo();
            builder.append(atual.getElemento()+", ");
        }

        atual = atual.getProximo();
        builder.append(atual.getElemento()+"]");


        return builder.toString();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void percorrerLista() {
        No<T> atual = this.inicio;
        System.out.println("Posição 0: "+atual.getElemento());
        int cont = 1;
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            System.out.println("Posição "+cont+": "+atual.getElemento());
            cont++;
        }

    }

    public void limpa(){
        for(No<T> atual = this.inicio; atual!=null;){
            No<T> proximo = atual.getProximo();
            atual.setProximo(null);
            atual.setElemento(null);
            atual=proximo;
        }
    }

}
