import javax.swing.JOptionPane;

public class GetMessageEPrintStackTrace {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número: "));
        try {
            int y = x / 0;

        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
            err.printStackTrace();
        }
    }
}