import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        String mes = (String) JOptionPane.showInputDialog("Forneca o número do mês");
        if (mes != null) {
            switch (mes) {
            case "1":
                mes = "Janeiro";
                break;
            case "2":
                mes = "Fevereiro";
                break;
            case "3":
                mes = "março";
                break;
            // inserir todos os outros meses
            default:
                mes = "Mês Desconhecido! ";
            }
            JOptionPane.showMessageDialog(null, mes);
        }
        System.exit(0);
    }
}