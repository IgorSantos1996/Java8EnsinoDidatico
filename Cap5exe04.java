public class Cap5exe04 {
    public static void main(String[] args) {
        int[] par = new int[10];
        int[] impar = new int[10];
        int[] aux = new int[10];
        int sorteio;
        String mensagem = "";
        for (int k = 0; k < aux.length; k++) {
            sorteio = (int) (Math.random() * 20);
            if ((sorteio % 2 == 0)) {
                par[k] = sorteio;
            } else {
                impar[k] = sorteio;
            }
            
            mensagem += sorteio + " ";
            System.out.println("Os numeros gerados foram: " + mensagem);
        }
        System.out.println("========================Inicio do vetor par======================");

        for (int d = 0; d < par.length; d++) {
            System.out.println(par[d] + ", ");
        }
        System.out.println("========================Inicio do vetor impar======================");
        for (int i = 0; i < impar.length; i++) {
            System.out.println(impar[i] + ", ");
        }

    }
}