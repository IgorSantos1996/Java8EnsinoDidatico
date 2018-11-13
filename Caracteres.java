import javax.swing.JOptionPane;

public class Caracteres {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Forneça uma palavra com pelo menos 4 caracteres");
        JOptionPane.showMessageDialog(null,
                "Palavra: " + palavra + "\nCaractere 1: " + palavra.charAt(0) + "\nCaractere 2: " + palavra.charAt(1)
                        + "\nCaractere 3:" + palavra.charAt(2) + "\nCaractere 4: " + palavra.charAt(3));
        System.exit(0);
    }
}