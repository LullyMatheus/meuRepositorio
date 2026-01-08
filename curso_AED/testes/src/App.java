public class App {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(3);

        try {
            vetor.adiciona("B");
            vetor.adiciona("C");
            vetor.adiciona("D");
        } catch (Exception e) {
            e.printStackTrace();
        }

        int tamanho = vetor.getTamanhoReal();

        System.out.println("O tamanho real do vetor é: " + tamanho);

        // vetor.adiciona("A",0);

        System.out.println(vetor.toString());

        try {
            vetor.adiciona("E");
            vetor.adiciona("F");
            vetor.adiciona("G");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            vetor.adiciona("H");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor.toString());

    }
}
