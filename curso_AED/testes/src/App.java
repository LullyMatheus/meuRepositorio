public class App {
    public static void main(String[] args) throws Exception {

        // Pilha<Integer> pilha = new Pilha<Integer>(3);

        Fila<String> fila = new Fila<String>(3);

        fila.enfileirar("Primeiro a chegar");
        fila.enfileirar("Segundo a chegar");
        fila.enfileirar("Terceiro a chegar");
        fila.enfileirar("Quarto a chegar");

        System.out.println(fila.toString());

        System.out.println("O primeiro elemento é: "+fila.peek());

        fila.desenfileirar();
        fila.desenfileirar();

        System.out.println(fila.toString());

        System.out.println("O primeiro elemento é: "+fila.peek());

    }
}
