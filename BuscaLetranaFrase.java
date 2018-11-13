import javax.swing.JOptionPane;

public class BuscaLetranaFrase {
    public static void main(String[] args) {
        String frase = "Livro Java 8 - Ensino Didático: ";
        char caractere = 'a';
        JOptionPane.showMessageDialog(null, "Frase: " + frase + "\nIndices: " + frase.indexOf(caractere) + ", "
                + frase.indexOf(caractere, 10) + ", " + frase.indexOf("Ensino") + ", " + frase.indexOf("Java", 15));
        System.exit(0);
    }
}