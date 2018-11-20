import javax.swing.JOptionPane;

public class Contagem  {

    public static void contar() {
        for (int i = 1; i < 11; i++) {
            JOptionPane.showMessageDialog(null, i);
        }
    }

    public static void contar(int fim) {
        for (int i = 0; i <= fim; i++) {
            JOptionPane.showMessageDialog(null, i);
        }
    }

    public static void contar(int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            JOptionPane.showMessageDialog(null, i);
        }
    }
    public static void contar (int inicio, int fim, int pausa) throws InterruptedException {
        for (int i = inicio; i <= fim; i++) {
            JOptionPane.showMessageDialog(null, i);
            Thread.sleep(pausa);
        }
    }

}