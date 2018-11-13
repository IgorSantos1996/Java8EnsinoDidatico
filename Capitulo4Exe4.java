import javax.swing.JOptionPane;

public class Capitulo4Exe4 {
    public static void main(String[] args) {
        try {
            String inverso = "";
            String frase = JOptionPane.showInputDialog("Digite sua frase: ");
            for (int i = frase.length() - 1; i >= 0; i--) {
                inverso += frase.charAt(i);
            }
            frase = inverso.replace(" ", "");
            JOptionPane.showMessageDialog(null, "A frase ao contrário é: " + frase);

        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "A frase deve ter pelo menos 10 caracteres \n" + e.toString());
        }
    }
}