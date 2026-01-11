package exercicio29;

public class ListaComTail<T> {
    private No<T> head; // O primeiro (início)
    private No<T> tail; // O último (fim)

    public void adicionarNoFim(T valor) {
        No<T> novoNo = new No<T>();
        novoNo.setElemento(valor);

        // Caso 1: A lista está vazia?
        if (head == null) {
            head = novoNo;
            tail = novoNo;
        } 
        // Caso 2: Já tem gente na lista
        else {
            tail.setProximo(novoNo); // O antigo último aponta para o novo
            tail = novoNo;         // atualizar referencia do ultimo
        }
    }
}