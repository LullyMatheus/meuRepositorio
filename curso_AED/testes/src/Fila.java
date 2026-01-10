public class Fila<T> {

    private T[] elementos;
    private int tamanhoReal;

    public Fila(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // solucao do livro effective Java
        this.tamanhoReal = 0;
    }

    // adiciona item no final da fila
    public void enfileirar(T elemento) {

        aumentaCapacidade();

        this.elementos[this.tamanhoReal]=elemento;
        this.tamanhoReal++;
    }

    // remove do inicio
    public void desenfileirar(){
        if(this.tamanhoReal==0){
            System.out.println("A pilha está vazia!");
        } else{
            for(int i=0;i<this.tamanhoReal;i++){
                this.elementos[i]=this.elementos[i+1];
            }
            this.tamanhoReal--;
        }

    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[ ");
        for(int i=0;i<this.tamanhoReal-1;i++){
            s.append(this.elementos[i]+", ");
        }

        s.append(this.elementos[this.tamanhoReal-1]);
        s.append("]");
        return s.toString();
    }

    private void aumentaCapacidade(){
        if(this.tamanhoReal==this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for(int i=0;i<this.tamanhoReal;i++){
                elementosNovos[i]=this.elementos[i];
            }
            this.elementos=elementosNovos;
            
        }
    }

}
