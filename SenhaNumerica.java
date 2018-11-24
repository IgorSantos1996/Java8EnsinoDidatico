import javax.swing.JOptionPane;

public class SenhaNumerica {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 5 + 5);
        String dinha = "";
        System.out.println(number);
        for (int p = 0; p < number; p++) {
            int k = (int) (Math.random() * 5 + 5);
            dinha += k + " ";
        }
        JOptionPane.showMessageDialog(null, "O numero sorteado foi: " + number + "\nSenha gerada: " + dinha);
    }
}