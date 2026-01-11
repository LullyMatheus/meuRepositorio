package exercicio29;

public class No<T> {

    private T elemento;
    private No<T> proximo; // repare que aqui o proximo eh um int, e nao um No<T>

    public No() {
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

}
