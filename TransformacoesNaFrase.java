import javax.swing.JOptionPane;

public class TransformacoesNaFrase {
    public static void main(String[] arg) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase: ");
        JOptionPane.showMessageDialog(null, "Frase: " + frase + "\nTodas em Maiúsculas: " + frase.toUpperCase()
                + "\nTodas em Minúsculas: " + frase.toLowerCase());
        System.exit(0);
    }
}