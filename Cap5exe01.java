import java.util.Arrays;
import javax.swing.JOptionPane;

public class Cap5exe01 {
    public static void main(String[] args) {

        int[] notas = new int[5];
        //int[] vetAux = new int[5];
        int cont = 1;
        double media = 0, soma = 0;
        for (int k = 0; k < notas.length; k++) {
            notas[k] = Integer.parseInt(JOptionPane.showInputDialog("Informa  a nota " + (k + 1) + " :"));
            soma += notas[k];

        }
        media = soma / 5;

        for (int k = 1; k < notas.length; k++) {
            for (int j = 0; j < k; j++) {
                if (notas[k] > notas[j]) {
                    int temp = notas[k];
                    notas[k] = notas[j];
                    notas[j] = temp;

                }
            }
        }
        /*
         * for (int i = notas.length - 1; i >= 0; i--) { vetAux[cont] = notas[i];
         * cont++; }
         */
        JOptionPane.showMessageDialog(null, "A media das notas foi: " + media);
        System.out.println("Array em ordem decrescente: ");
        for (int k = 0; k < notas.length; k++) {
            System.out.println(notas[k] + " ");
        }

    }
}