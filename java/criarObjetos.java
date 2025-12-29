import java.util.ArrayList;
import java.util.List;

public class criarObjetos {

    public static void main(String[] args) {
        /*
         * Eu estava na duvida sobre como automatizar o processo de criar objetos
         * Geralmente, quando criamos objetos, precisamos dar um nome para ele
         * Por ex: Objeto objeto = new Objeto()
         * Essa forma nao eh muito boa para automatizar
         * Mas eh possivel fazer da seguinte forma
         */

        List<String> listaDeStrings = new ArrayList<>();

        // Automação: Loop para criar 1000 objetos
        for (int i = 0; i < 1000; i++) {
            // Criando mil objetos do tipo String (poderia ser qualquer classe)
            // Nos damos um 'new', mas nao damos um nome de variavel!
            // Os objetos podem ser acessados depois por meio do indice
            listaDeStrings.add(new String());
        }
    }

}
