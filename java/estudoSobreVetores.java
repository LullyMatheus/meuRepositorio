public class estudoSobreVetores {
    public static void main(String[] args) {
        // Criando um vetor de inteiros com tamanho 5
        int[] vetor = new int[5];

        // Atribuindo valores aos elementos do vetor
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;

        // Acessando e imprimindo elementos do vetor
        System.out.println("Elemento no índice 0: " + vetor[0]);
        System.out.println("Elemento no índice 1: " + vetor[1]);
        System.out.println("Elemento no índice 2: " + vetor[2]);
        System.out.println("Elemento no índice 3: " + vetor[3]);
        System.out.println("Elemento no índice 4: " + vetor[4]);

        // Calculando e imprimindo a soma de todos os elementos do vetor
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("Soma de todos os elementos do vetor: " + soma);
    }
}
