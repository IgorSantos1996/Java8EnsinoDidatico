import javax.swing.JOptionPane;

public class Tabuada {
    public static void main(String[] args) {
        int numero;
        String resultado = "";
        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja a tabuada do qual número: "));
            if ((numero > 0) && (numero < 11)) {
                for (int i = 0; i <= 10; i++) {
                    int produto = numero * i;
                    resultado = resultado + numero + " x " + i + " = " + produto + "\n";
                }
                JOptionPane.showMessageDialog(null, resultado);
            }else{
                JOptionPane.showMessageDialog(null, "Número muito grande ou muito pequeno para a tabuada!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informe o número corretamente" + e.toString());
        }
    }
}