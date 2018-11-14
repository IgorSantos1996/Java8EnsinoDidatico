import javax.swing.JOptionPane;

public class Capitulo5Exe5 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Informe a frase para ser analizada: ");
        if (((frase.equalsIgnoreCase("sexual")) || (frase.equalsIgnoreCase("sexo")) || (frase.contains("sexo"))
                || (frase.contains("sexual")))) {
            JOptionPane.showMessageDialog(null, "Conteúdo impróprio");
        } else {
            JOptionPane.showMessageDialog(null, "Liberado!");
        }
    }
}