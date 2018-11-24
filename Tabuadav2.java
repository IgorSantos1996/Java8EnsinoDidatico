import javax.swing.JOptionPane;

public class Tabuadav2 {

    public static void main(String[] args) {
        int numero;
        String resultado = "";
        String[] opcao = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        String resp = (String) JOptionPane.showInputDialog(null, "Selecione a tabuada que deseja: \n ", "Tabuada",
                JOptionPane.PLAIN_MESSAGE, null, opcao, "1");

        if (resp == null) {
            JOptionPane.showMessageDialog(null, "Você pressionou o botão de cancel!");

        } else {
            numero = Integer.parseInt(resp);
            for (int k = 0; k < 11; k++) {
                if ((numero > 0) && (numero < 11)) {
                    int produto = numero * k;
                    resultado += numero + " x " + k + " = " + produto + "\n";
                } else {
                    JOptionPane.showMessageDialog(null, "Numero muito grande ou  muito pequeno!");
                }
            }
            JOptionPane.showMessageDialog(null, resultado);
        }
    }
}