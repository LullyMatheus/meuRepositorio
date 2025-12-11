package ordenacao;

public class Shellsort {

    public static void ordenar(int[] vetor) {
        int n = vetor.length;

        // 1. Escolha do Gap inicial.
        // Existem várias fórmulas. A mais simples é começar com metade do tamanho
        // e ir dividindo por 2 (n/2, n/4, ... 1).
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // --- AQUI COMEÇA O INSERTION SORT (ADAPTADO) ---
            
            // O loop começa do 'gap' e vai até o fim
            for (int i = gap; i < n; i++) {
                
                int itemAtual = vetor[i];
                int j = i;

                // No Insertion Sort normal, seria: while (j >= 1 && vetor[j-1] > itemAtual)
                // No Shell Sort, trocamos '1' por 'gap'.
                // Verificamos o elemento que está 'gap' posições atrás.
                while (j >= gap && vetor[j - gap] > itemAtual) {
                    
                    vetor[j] = vetor[j - gap]; // "Empurra" o maior para a direita (salto longo)
                    j -= gap; // Recua 'gap' posições
                }

                vetor[j] = itemAtual; // Encaixa o item na posição correta
            }
            // --- FIM DO INSERTION SORT ADAPTADO ---
        }
    }

    public static void main(String[] args) {
        int[] lista = { 12, 34, 54, 2, 3 };
        
        System.out.println("Original:");
        imprimir(lista);

        ordenar(lista);

        System.out.println("Ordenado:");
        imprimir(lista);
    }

    private static void imprimir(int[] vetor) {
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}