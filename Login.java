import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        int qtd = 3;
        boolean foi = false;
        String user = JOptionPane.showInputDialog("Informe o login ");
        try {

          
            for (int i = 0; i < user.length(); i++) {
                Character caractere = user.charAt(i);
                if (Character.isDigit(caractere)) {
                    throw new Exception("Não pode conter números no seu user!\n");
                }
            }
            String passw = JOptionPane.showInputDialog("Informe a senha ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);
        }
    }
}