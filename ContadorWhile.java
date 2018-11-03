import javax.swing.JOptionPane;

public class ContadorWhile {
    public static void main(String[] args) {// throws Exception{
        try {
            int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
            int contador = limite;

            while (contador < 0) {
                // Thread.sleep(100000);
                System.out.println(contador);
                contador--;
            }
            System.out.println("Fim do contador regressivo\n");
            contador = 0;

            do {
                System.out.println(contador);
                contador++;
            } while (contador <= limite);
            System.out.println("Fim fo contador progressivo");
        } catch (NumberFormatException err) {
            System.out.println("Não foi fornecido um numero inteiro válido! \n" + err.toString()); // se o argumento for
                                                                                                   // inválido
        }
        System.exit(0);
    }
}