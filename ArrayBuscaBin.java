import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArrayBuscaBin {
    public static void main(String[] args) {
        int[] n = new int[1000]; // vetor com 1000 posições
        for (int k = 0; k < n.length; k++) { // laço para iterar o vetor
            n[k] = (int) (Math.random() * 1000); // povoar o vetor com 1000 elementos
        }
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número: ")); // input
        String r = "Valor não encontrado";
        for (int i = 0; i < n.length; i++) { // percorre o vetor
            if (n[i] == valor) { // testa se o valor de i atual é igual ao numero que digitamos, no vetor n[]
                r = "Valor encontrado na posição " + i;
                break; // se achou sai
            }
        }
        System.out.println(r);
        Arrays.sort(n); // ordena
        int pos = Arrays.binarySearch(n, valor); // acha a posição do elemento que digitamos com o método bynarySearch
        System.out.println("Nova posição ordenada: " + pos);
    }
}