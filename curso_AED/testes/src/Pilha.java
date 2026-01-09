public class Pilha<T> {

    private T[] elementos;
    private int tamanhoReal;

    public Pilha(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanhoReal = 0;
    }

    public void empilha(T elemento) throws Exception {

        aumentaCapacidade();

        if (this.tamanhoReal < this.elementos.length) {
            this.elementos[this.tamanhoReal] = elemento;
            this.tamanhoReal++;
        } else {
            throw new Exception("O vetor já está cheio!");
        }

    }

    public int getTamanhoReal() {
        return this.tamanhoReal;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[ ");

        for (int i = 0; i < this.tamanhoReal - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanhoReal > 0) {
            s.append(this.elementos[tamanhoReal - 1]);
            s.append(" ]");
        }

        return s.toString();
    }

    public T busca(int posicao) {

        if (!(posicao >= 0 && posicao < this.tamanhoReal)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];
    }

    private void aumentaCapacidade() {
        if (this.tamanhoReal == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanhoReal; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void pop(){
        tamanhoReal--;
    }



}
