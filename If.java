import javax.swing.JOptionPane;

public class If {
    public static void main(String[] args) {
        Object[] op = { "Masculino", "Feminino" };
        String resp = (String) JOptionPane.showInputDialog(null, "Selecione o sexo: \n", "Pesquisa",
                JOptionPane.PLAIN_MESSAGE, null, op, "Masculino");
        /* O 1º parâmetro se refere em que local a caixa de saida será exibida, no caso está 'null' então será no centro.
         O 2º parâmetro se a mensagem que será exibida ao usuário, no caso "selecione o sexo". 
         O 3º se refere ao titulo da janela
         o 4º se refere à um valor inteiro que define qula ícone será exibido por na caixa de mensagem.
         O 5º se refere a um ícone externo que pode ser usado, isto é, pode ser definida uma imagem que será exibida na caixa de diálogo.
         O 6º se refere à lista de opções que será exibidas para o usuário selecionar, no caso definido pela variável 'op'
         O 7º se refere a opção que aparecerá seleciona por default. Esse texto deve ser igual à uma das opções possíveis de ser selecionada.
        */
        if (resp == null) {
            JOptionPane.showMessageDialog(null, "Você pressionou Cancel");
        }
        if (resp == "Masculino") {
            JOptionPane.showMessageDialog(null, "Você é homem.");
        }
        if (resp == "Feminino") {
            JOptionPane.showMessageDialog(null, "Você é mulher.");
        }
        System.exit(0);
    }
}