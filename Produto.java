import javax.swing.JOptionPane;

public class Produto {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Entre com o nome do produto: ");
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor do produto: "));
        float descontado = 0;
        try {
            if (preco <= 0) {
                JOptionPane.showMessageDialog(null, "Valor do " + nome + " <= 0!");
            } else if ((preco >= 50) && (preco < 200)) {
                descontado = preco;
                preco = preco * 5 / 100;

            } else if ((preco >= 200) && (preco < 500)) {
                descontado = preco;
                preco = preco * 6 / 100;
            } else if ((preco >= 500) && (preco < 100)) {
                descontado = preco;
                preco = preco * 7 / 100;
            } else {
                descontado = preco;
                preco = preco * 8 / 100;
            }
            JOptionPane.showMessageDialog(null, "Nome do produto: " + nome);
            JOptionPane.showMessageDialog(null, "Valor original do produto: R$" + descontado);
            JOptionPane.showMessageDialog(null, "Valor do produto com desconto: R$" + (descontado - preco));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Não foi fornecido um número inteiro válido! " + e.toString());
        }

    }
}