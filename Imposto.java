import javax.swing.JOptionPane;

public class Imposto {
    public static void main(String args[]) {
        float maior = 0;
        float valor_imposto, percentual_imposto, valor_venal, valor_transacao;
        String aux;
        try {
            aux = javax.swing.JOptionPane.showInputDialog("Entre com o valor da transação: ");
            maior = valor_transacao = Float.parseFloat(aux);

            aux = javax.swing.JOptionPane.showInputDialog("Ente com o valor venal: ");
            valor_venal = Float.parseFloat(aux);

            aux = javax.swing.JOptionPane.showInputDialog("Entre com o valor da porcentagem: ");
            percentual_imposto = Float.parseFloat(aux);

            if (maior < valor_venal) {
                maior = valor_venal;
            }

            valor_imposto = maior * percentual_imposto / 100;
            javax.swing.JOptionPane.showMessageDialog(null, "Valor da transação: " + valor_transacao);
            javax.swing.JOptionPane.showMessageDialog(null, "Valor venal: " + valor_venal);
            javax.swing.JOptionPane.showMessageDialog(null, "percentual do imposto: " + percentual_imposto);
            javax.swing.JOptionPane.showMessageDialog(null, "Valor a pagar: " + (maior - valor_imposto));
        } catch (NumberFormatException exe) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "erro na conversão, digite apenas caracteres numéricos" + exe.toString());
        }
    }
}