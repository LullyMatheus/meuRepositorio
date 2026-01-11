package exercicio28;

public class No<T> {

    private T elemento;
    private int proximo; //repare que aqui o proximo eh um int, e nao um No<T>
    
    public No() {
    }

    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public int getProximo() {
        return proximo;
    }
    public void setProximo(int proximo) {
        this.proximo = proximo;
    }
    
}
