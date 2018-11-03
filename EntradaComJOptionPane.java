import javax.swing.JOptionPane;


public class EntradaComJOptionPane {
    public static void main (String args[]){
        String aux;
        float largura, comprimento, area, perimetro;
        try{
            aux = javax.swing.JOptionPane.showInputDialog("Entre com o comprimento");
            comprimento= Float.parseFloat(aux);

            aux = javax.swing.JOptionPane.showInputDialog("Entre com a largura");
            largura = Float.parseFloat(aux);
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            javax.swing.JOptionPane.showMessageDialog(null,"Area : " + area + ", Perimetro: " + perimetro);

        } catch (NumberFormatException erro) {
            javax.swing.JOptionPane.showMessageDialog(null, "erro na conversão, digite apenas caracteres numéricos" + erro.toString());
        }
        System.exit(0);
    }
}