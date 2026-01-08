public class App {
    public static void main(String[] args) throws Exception {
       Vetor vetor = new Vetor(10);

        try {
            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
            vetor.adiciona("Elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }

        int tamanho = vetor.getTamanhoReal();

        System.out.println("O tamanho real do vetor é: "+tamanho);

        System.out.println(vetor.busca(1));

    }
}
