
public class Cap5exe02 {
    public static void main(String[] args) {
        int pos;
        String[] mes = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };
        int numero = (int) (Math.random() * 12);
        System.out.println(numero+1);
        for (int k = 0; k <= mes.length; k++) {
            if (numero == 0) {
                System.out.println(mes[0]);
                break;
            } else if (numero == 1) {
                System.out.println(mes[1]);
                break;
            } else if (numero == 2) {
                System.out.println(mes[2]);
                break;
            } else if (numero == 3) {
                System.out.println(mes[3]);
                break;
            } else if (numero == 4) {
                System.out.println(mes[4]);
                break;
            } else if (numero == 5) {
                System.out.println(mes[5]);
                break;
            } else if (numero == 6) {
                System.out.println(mes[6]);
                break;
            } else if (numero == 7) {
                System.out.println(mes[7]);
                break;
            } else if (numero == 8) {
                System.out.println(mes[8]);
                break;
            } else if (numero == 9) {
                System.out.println(mes[9]);
                break;
            } else if (numero == 10) {
                System.out.println(mes[10]);
                break;
            } else if (numero == 11) {
                System.out.println(mes[11]);
            }

        }
    }
}