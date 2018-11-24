import javax.swing.JOptionPane;
import java.io.IOException;

public class InstrucaoThrows {
    public static void main(String[] args) throws IOException {
        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade"));
            if (idade < 18) {
                throw new Exception("Menor de idade, entrada não permitida!! ");
            } else {
                JOptionPane.showMessageDialog(null, "Idade válida, seja bem vindo!");
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err.toString());
        }
    }
}