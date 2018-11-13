import java.util.Locale;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConfiguracoesRegionais {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Locale lc = Locale.getDefault();
        double valor = 1370.25;
        if (lc.getCountry().equals("BR")) {
            df.applyPattern("R$ #, ##0.00");
        }
        JOptionPane.showMessageDialog(null,
                "Configuracoes do SO: " + "\nSigla: " + lc.getCountry() + "\nPais: " + lc.getDisplayCountry()
                        + "\nIdioma: " + lc.getDisplayLanguage() + "\nTeclado: " + lc.getDisplayName() + "\nValor: "
                        + df.format(valor));
        System.exit(0);

    }
}