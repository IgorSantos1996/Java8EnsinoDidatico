import javax.swing.JOptionPane;

public class Passageiros {
    public static void main(String[] args) {
        final float LOTACAO_ONIBUS = 100;
        int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog("Numero de passageiros: "));
        float qtdOnibus = numeroPassageiros / LOTACAO_ONIBUS;
        JOptionPane.showMessageDialog(null,
                "Quantidade de passgeiros: " + numeroPassageiros + "\nQuantidade Calculada: " + qtdOnibus
                        + "\nQuantidade de onibus necessários: " + (int) Math.ceil(qtdOnibus));
        System.exit(0);
    }

}