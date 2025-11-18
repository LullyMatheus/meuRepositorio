import javax.swing.JOptionPane;
public class UsarDialog {
    public static void main(String[] args) throws Exception {
        String nome;
        StringBuilder mensagem = new StringBuilder();

        nome = JOptionPane.showInputDialog("Digite seu nome:");
        mensagem.append("Bem-vindo ").append(nome).append("!");
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
