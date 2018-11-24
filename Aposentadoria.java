import javax.swing.JOptionPane;

public class Aposentadoria {
    public static void main(String args[]) {
        int qtd_contribuicao, idade;
        String aux2, sexo;

        sexo = javax.swing.JOptionPane.showInputDialog("Informe o seu sexo: ");

        aux2 = javax.swing.JOptionPane.showInputDialog("Informe a idade: ");

        idade = Integer.parseInt(aux2);

        aux2 = javax.swing.JOptionPane.showInputDialog("Informe o tempo de contribuição: ");
        qtd_contribuicao = Integer.parseInt(aux2);

        if (sexo.equalsIgnoreCase("masculino")) {
            if ((idade >= 65) | (qtd_contribuicao >= 35)) {
                javax.swing.JOptionPane.showMessageDialog(null, "Já possui direito a aposentadoria");

            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Faltam: " + (65 - idade) + " anos para a sua aposentadoria"
                        + "ou faltam" + (35 - qtd_contribuicao) + " anos de contribuição para a sua aposentadoria");
            }

        } else if (sexo.equalsIgnoreCase("feminino")) {
            if ((idade >= 60) | (qtd_contribuicao >= 30)) {
                javax.swing.JOptionPane.showMessageDialog(null, "Já possui tempo de contribuição");

            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Faltam: " + (60 - idade) + " anos para a sua aposentadoria "
                        + "ou faltam " + (30 - qtd_contribuicao) + " anos de contribuição para a sua aposentadoria");
            }
        }

    }

}