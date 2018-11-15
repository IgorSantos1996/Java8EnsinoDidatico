import javax.swing.JOptionPane;

public class Cap5exe03 {
    public static void main(String[] args) {
        int pixel[][] = new int[40][40];
        for (int linha = 0; linha < pixel.length; linha++) {
            for (int coluna = 0; coluna <  pixel[linha].length; coluna++) {
                pixel[linha][coluna] = (int) (Math.random() * 2);
            }
        }
        for (int linha = 0; linha < pixel.length; linha++) {
            for (int coluna = 0; coluna < pixel[linha].length; coluna++) {
                System.out.println("[" + linha + ", " + coluna + pixel[linha][coluna] + "]");
            }

        }

    }
}