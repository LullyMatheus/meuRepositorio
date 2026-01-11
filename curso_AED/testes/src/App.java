import lista_encadeada.ListaEncadeada;

public class App {
    public static void main(String[] args) throws Exception {

        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.adiciona(1);
        lista.adiciona(9);
        lista.adiciona(17);
        lista.adiciona(45);
        lista.adiciona(92);
        lista.adiciona(69);

        System.out.println("Lista completa:");
        System.out.println(lista.toString());
        System.out.println("--------------");

        lista.remover(1);
        System.out.println("Remove posição 1: ");
        System.out.println(lista.toString());

        lista.remover(3);
        System.out.println("Remove posição 3: ");
        System.out.println(lista.toString());

        lista.remover(2);
        System.out.println("Remove posição 2: ");
        System.out.println(lista.toString());

    }
}
