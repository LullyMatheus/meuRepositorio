package exercicio28;

public class ListaEncadeadaEstatica<T> {

    private No<T>[] elementos;
    private int primeiro;
    private int livre; //indice do primeiro espaco vazio

    public ListaEncadeadaEstatica(int tamanhoMax) {
        this.elementos = new No[tamanhoMax];
        
        for (int i = 0; i < tamanhoMax; i++) {
            elementos[i] = new No();
            // O 0 aponta pro 1, o 1 pro 2...
            elementos[i].setProximo(i+1);
        }
        // O último não aponta pra ninguém (-1 é o nosso null)
        elementos[tamanhoMax - 1].setProximo(-1);

        this.primeiro = -1; // Eh -1 pq no momento nao tem item nenhum (nao tem primeiro)
        this.livre = 0;
    }

    public void inserirInicio(T elemento) {
        // Verificar se tem espaço
        if (this.livre == -1) {
            throw new RuntimeException("Lista Cheia!");
        }

        // Pegar o primeiro livre
        int novoIndice = this.livre;
        
        // Atualizar a lista de livres
        this.livre = elementos[novoIndice].getProximo(); 

        elementos[novoIndice].setElemento(elemento);
        elementos[novoIndice].setProximo(this.primeiro);// Aponta para o antigo primeiro

        this.primeiro = novoIndice;
    }

    public void imprimir() {
        int atual = this.primeiro;
        System.out.print("[ ");
        while (atual != -1) { // Enquanto não for NULL (-1)
            System.out.print(elementos[atual].getElemento() + " ");
            atual = elementos[atual].getProximo(); // Navega usando o índice
        }
        System.out.println("]");
    }

    
}
