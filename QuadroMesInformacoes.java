import javax.swing.JOptionPane;

public class QuadroMesInformacoes {

    public static String getMesPorExtenso(int n, int cod) {
        String idioma = "";
        String aux = "";
        while (true)
            try {
                if ((n == 1) && (cod == 1)) {
                    aux = "Janeiro";
                    idioma = "Portugûes";
                    break;
                } else if ((n == 1) && (cod == 2)) {
                    aux = "Janeiro";
                    idioma = "Inglês";
                    break;
                } else if ((n == 2) && (cod == 1)) {
                    aux = "Fevereiro";
                    idioma = "Portugûes";
                    break;
                } else if ((n == 2) && (cod == 2)) {
                    aux = "Fevereiro";
                    idioma = "Inglês";
                    break;
                } else if ((n == 3) && (cod == 1)) {
                    aux = "Março";
                    idioma = "Portugûes";
                    break;
                } else if ((n == 3) && (cod == 2)) {
                    aux = "Março";
                    idioma = "Inglês";
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Inválido");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Somente numeros, por gentileza! " + e.toString());
            }
        return aux + "\n" + idioma;
    }
}