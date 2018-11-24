import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class Farmacia {
    public static void main(String[] args) {
        float valor = 1;
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0. 00");
        while (valor != 0) {
            valor = Float.parseFloat(JOptionPane.showInputDialog("Informa o valor do produto: "));
            valor += valor * 12 / 100;
            Math.round(valor);
            JOptionPane.showMessageDialog(null, "O valor do produto com acréscimo é: " + df.format(valor)
                    + "\ne o valor arredondado é:  " + df.format(Math.round(valor)));
        }

    }
}