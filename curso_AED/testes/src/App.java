public class App {
    public static void main(String[] args) throws Exception {

        // Pilha<Integer> pilha = new Pilha<Integer>(3);

        Fila<Integer> fila = new Fila<Integer>(10);

        fila.enfileirar(9);
        fila.enfileirar(8);
        fila.enfileirar(7);
        fila.enfileirar(6);

        System.out.println(fila.toString());

        fila.desenfileirar();
        fila.desenfileirar();

        System.out.println(fila.toString());

    }
}
