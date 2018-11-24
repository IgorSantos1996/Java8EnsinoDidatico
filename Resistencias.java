import javax.swing.JOptionPane;

public class Resistencias {
    public static void main(String[] args) {
        int resistencia01, resistencia02, resistencia03, resistencia04;
        int soma = 0, maior, menor;

        resistencia01 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a primeira resistencia: "));
        resistencia02 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a segunda resistencia: "));
        resistencia03 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a terceira resistencia: "));
        resistencia04 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quarta resistencia: "));

        maior = resistencia01;
        menor = 0;
        if (maior < resistencia01) {
            maior = resistencia01;
        } else {
            menor = resistencia01;
        }
        if (maior < resistencia02) {
            maior = resistencia02;

        } else {
            menor = resistencia02;
        }
        if (maior < resistencia03) {
            maior = resistencia03;

        } else {
            menor = resistencia03;
        }
        if (maior < resistencia04) {
            maior = resistencia04;

        } else {
            menor = resistencia04;
        }
        soma = resistencia01 + resistencia02 + resistencia03 + resistencia04 / 4;
        JOptionPane.showMessageDialog(null,
                "A média das resistências é " + soma + "\nResistencia fornecidas: " + resistencia01 + ", " + resistencia02
                        + ", " + resistencia03 + ", " + resistencia04 + "\n" + "A maior resistência é: " + maior + "\n"
                        + "A menor resistencia é: " + menor);
    }
}