import lista_encadeada.ListaEncadeada;

public class App {
    public static void main(String[] args) throws Exception {

        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.adiciona(1);
        lista.adiciona(9);
        lista.adiciona(17);

        //lista.percorrerLista();

        System.out.println(lista.toString());

        

    }
}
