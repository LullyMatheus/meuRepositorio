package lista_encadeada;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    // adiciona no final
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

    public void adiciona(int posicao, T elemento) {

        if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        No<T> novoNo = new No<T>(elemento);

        if (posicao == this.getTamanho()) {
            this.adiciona(elemento);
        }

        if (posicao == 0) {
            if (this.getTamanho() == 0) {
                this.inicio = novoNo;
                this.ultimo = novoNo;
            } else {
                novoNo.setProximo(this.inicio);
                this.inicio = novoNo;
            }

        } else {
            No<T> noAnterior = buscaNo(posicao - 1);
            No<T> aux = buscaNo(posicao);
            novoNo.setProximo(aux);
            noAnterior.setProximo(novoNo);
        }

        this.tamanho++;

    }

    @Override
    public String toString() {

        if (this.tamanho == 0) {
            return "[]";
        }

        No<T> atual = this.inicio;

        StringBuilder builder = new StringBuilder("[" + atual.getElemento());

        for (int i = 0; i < this.tamanho - 2; i++) {
            atual = atual.getProximo();
            builder.append(", "+atual.getElemento());
        }
        if ((atual.getProximo()) != null) {
            atual = atual.getProximo();
            builder.append(", "+atual.getElemento() + "]");
        } else{
            builder.append("]");
        }

        return builder.toString();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void percorrerLista() {
        No<T> atual = this.inicio;
        System.out.println("Posição 0: " + atual.getElemento());
        int cont = 1;
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            System.out.println("Posição " + cont + ": " + atual.getElemento());
            cont++;
        }

    }

    public void limpa() {
        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setProximo(null);
            atual.setElemento(null);
            atual = proximo;
        }
    }

    public T buscaPosicao(int posicao) {

        if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        No<T> atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual.getElemento();
    }

    public int buscaElemento(T elemento) {
        No<T> atual = this.inicio;
        if (atual.getElemento().equals(elemento)) {
            return 0;
        } else {
            int cont = 1;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
                if (atual.getElemento().equals(elemento)) {
                    return cont;
                }
                cont++;
            }
        }

        return -1;
    }

    public No<T> buscaNo(int posicao) {

        if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    public void remover(int posicao) {

        if (!(posicao >= 0 && posicao < this.getTamanho())) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        if (posicao == 0) {
            this.inicio = this.inicio.getProximo();
            this.tamanho--;
            return;
        } else if (posicao == this.getTamanho() - 1) {
            No<T> penultimo = buscaNo(posicao - 1);
            penultimo.setProximo(null);
            this.tamanho--;
            this.ultimo = penultimo;
            return;
        }

        No<T> proximo = buscaNo(posicao + 1);
        No<T> anterior = buscaNo(posicao - 1);

        anterior.setProximo(proximo);
        this.tamanho--;
    }

}
