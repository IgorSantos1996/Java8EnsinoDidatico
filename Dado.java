import javax.swing.JOptionPane;

public class Dado {
    public static void main(String[] args) {
        int soma = 0;
        int numero = 0;
        String espacos = "";
        for (int l = 0; l < 3; l++) {
            numero = (int) (Math.random() * 6);
            espacos += numero + " ";
            soma += numero;
           
        }

        JOptionPane.showMessageDialog(null, "\nNumeros sorteados: \n" + " "+ espacos + "\ntotal: \n" + soma);

    }
}