import javax.swing.JOptionPane;

public class TestaContagem {
    public static void main(String[] args) {
        Contagem.contar();
        Contagem.contar(10);
        Contagem.contar(4, 14);
        try {
            Contagem.contar(4, 10, 2000);
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, "Exceção gerada por causa da thread" + e.toString());
        }

    }
}