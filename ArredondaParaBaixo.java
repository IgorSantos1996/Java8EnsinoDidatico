import javax.swing.JOptionPane;

public class ArredondaParaBaixo {
    public static void main(String[] args) {
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Nota da prova"));
        JOptionPane.showMessageDialog(null, "Nota original: " + nota + "\nArrendoda para baixo: " + Math.floor(nota));
        System.exit(0);
    }
}