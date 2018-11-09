import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        int qtd = 3;
        boolean foi = false;
        String user;
        String passw;

        while ((qtd > 0) && (foi == false)) {
            try {
                user = JOptionPane.showInputDialog("Informe o login ");
                for (int i = 0; i < user.length(); i++) {
                    Character caractere = user.charAt(i);
                    if (Character.isDigit(caractere)) {
                        throw new Exception("Não pode conter números no seu user!\n");
                    }
                }
                passw = JOptionPane.showInputDialog("Informe a senha ");
                if (!(user.equalsIgnoreCase("java")) && (!(passw.equalsIgnoreCase("java")))) {
                    qtd--;
                    JOptionPane.showMessageDialog(null, "Senha ou usuário inválido");
                    JOptionPane.showMessageDialog(null, "Agora você possui só mais " + qtd + " tentativas!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login e senha aceitos! Seja bem-bindo");
                    foi = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + e);

            }
        }

    }
}