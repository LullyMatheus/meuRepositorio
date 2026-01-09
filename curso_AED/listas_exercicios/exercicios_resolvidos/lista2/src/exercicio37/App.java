package exercicio37;

public class App {

    public static void main(String[] args) throws Exception {

        /**
         * EXERCÍCIO 37
         * Faça um programa que cadastre em uma pilha vários números. A entrada deles
         * será finalizada com a digitação de um número menor que 0. Posteriormente 
         * o programa deve gerar duas filas, a primeira com os números pares e a 
         * segunda com os números impares. A saída do programa deve apresentar a pilha
         * digitada e as filas geradas. Caso alguma das filas seja vazia, deve-se
         * mostrar a mensagem.
         */

        Pilha<Integer> pilha = new Pilha<Integer>(10);

        Fila<Integer> filaPar = new Fila<Integer>(5);
        Fila<Integer> filaImpar = new Fila<Integer>(5);

        for(int i=0;i<10;i++){
            pilha.empilha(i);
        }

        for(int i=pilha.getTamanhoReal()-1;i>0;i--){
            if(pilha.busca(i)%2==0){
                filaPar.enfileirar(pilha.busca(i));                
            } else {
                filaImpar.enfileirar(pilha.busca(i));
            }
            
        }

        System.out.println("Pilha: "+pilha.toString());

        System.out.println("Fila Ímpar: "+filaImpar.toString());

        System.out.println("Fila Par: "+filaPar.toString());

    }

}
