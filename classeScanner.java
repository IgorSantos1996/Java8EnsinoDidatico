import java.text.spi.NumberFormatProvider;

import javax.swing.JOptionPane;
//import java.util.Scanner;

public class classeScanner {
    public static void main(String args[]) {
        String aux;
        float number_vits;
        float pontos_lider, pontos_lanterna;
        try {
            aux = javax.swing.JOptionPane.showInputDialog("Entre com o com os pontos do lider:");
            pontos_lider = Float.parseFloat(aux);
            aux = javax.swing.JOptionPane.showInputDialog("Entre com os pontos do lanterna:");
            pontos_lanterna = Float.parseFloat(aux);

            javax.swing.JOptionPane.showMessageDialog(null, "Numero de pontos do lider : " + pontos_lider
                    + ", Numero de pontos do lanterninha: " + pontos_lanterna);

            number_vits = ((pontos_lider - pontos_lanterna) / 3);
            javax.swing.JOptionPane.showMessageDialog(null,
                    "O numero de vitórias necessárias para o lanterna ultrapassar o líder seria: " + number_vits);

        } catch (NumberFormatException erro) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "erro na conversão, digite apenas caracteres numéricos " + erro.toString());
        }
        System.exit(0);

    }
}