import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args) {

        float nota01, nota02, nota_trabalho;
        boolean status = false;
        float media = 0;
        String aux;
        try {
            aux = javax.swing.JOptionPane.showInputDialog("Entre com a primeira nota: ");
            nota01 = Float.parseFloat(aux);
            aux = javax.swing.JOptionPane.showInputDialog("Entre com a segunda nota: ");
            nota02 = Float.parseFloat(aux);

            aux = javax.swing.JOptionPane.showInputDialog("Entre com a nota do trabalho");
            nota_trabalho = Float.parseFloat(aux);

            media = ((nota01 + nota02 + nota_trabalho) / 3);
            if (media >= 6.0) {
                status = true;
            } else {
                status = false;
            }
            if (status == false) {
                javax.swing.JOptionPane.showMessageDialog(null, "Sua média foi abaixo de 6.0, está reprovado! ");
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Sua média foi igual ou acima de 6.0, portanto está aprovado! ");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Entre com caracteres apenas numéricos : " + e.toString());
        }

    }
}