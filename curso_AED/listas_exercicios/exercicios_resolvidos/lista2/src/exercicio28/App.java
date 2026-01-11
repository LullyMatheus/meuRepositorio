package exercicio28;

public class App {
    public static void main(String[] args) {

        System.out.println("Testeeeee");
        ListaEncadeadaEstatica<Integer> lista = new ListaEncadeadaEstatica<Integer>(10);
        System.out.println("Testeeeee");
        lista.inserirInicio(10);
        lista.inserirInicio(19);
        lista.inserirInicio(47);
        lista.imprimir();
    }
}
