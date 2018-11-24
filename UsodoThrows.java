import java.io.*;

import javax.swing.JOptionPane;

public class UsodoThrows {
    public static void main(String[] args) throws IOException {
        String frase = JOptionPane.showInputDialog("Entre com uma frase: ");
        try {
            FileWriter file = new FileWriter("/home/igor/Documentos/a parte/Livros-1-master/JavaPraticidades/exemplo.txt", true);
            PrintWriter out = new PrintWriter(file);
            out.println(frase);
            file.close();
            out.close();
            JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo");

        } catch (FileNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Verifique se a pasta existe!");
        }
    }
}