package recursividade;

public class matrizRecursiva {

    /*Eu fiz um programa que cria uma matriz de forma recursiva. 
    Decidi salvar esse algoritmo porque achei ele muito legal, 
    apesar de que na verdade nem era o que meu exercício estava pedindo. */

    static void gerarMatriz(int w, int h, int cor, int tamanhoPartes, int aux, int aux2) {
        if (aux2 >= (tamanhoPartes + 1)) {
            cor = cor + 1;
            aux2 = 0;
        }
        if (h > 0) {
            if (w > 0) {
                System.out.print(cor + " ");
                aux = aux + 1;
                aux2 = aux2 + 1;
                gerarMatriz(w - 1, h, cor, tamanhoPartes, aux, aux2);
            } else {
                System.out.println();
                gerarMatriz(aux, h - 1, cor, tamanhoPartes, 0, aux2);
            }
        } else {
            return;
        }
    }

}
