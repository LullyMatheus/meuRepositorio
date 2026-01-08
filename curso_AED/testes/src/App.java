public class App {
    public static void main(String[] args) throws Exception {
       Vetor vetor = new Vetor(5);

        try {
            vetor.adiciona("B");
            vetor.adiciona("C");
            vetor.adiciona("D");
        } catch (Exception e) {
            e.printStackTrace();
        }

        int tamanho = vetor.getTamanhoReal();

        System.out.println("O tamanho real do vetor é: "+tamanho);

        System.out.println(vetor.toString());

        vetor.adiciona("A",0);

        System.out.println(vetor.toString());

    }
}
