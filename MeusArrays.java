public class MeusArrays {
    public static int pesquisar (int []vet1, int []vet2, int k){
        
        for (int i = 0; i < vet1.length; i++) {
            for (int l = 0; i < vet2.length; l++) {
                if ((vet1[i] == k) && (vet2[l] == k)){
                    System.out.println("O elemento  foi achado nos dois vetores");
                    return 2;
                } else if((vet1[i] == k) || (vet2[l] == k)){
                    System.out.println("O elemento  foi achado em um dos vetores");
                    return 1;
                }else{
                    System.out.println("O elemento não foi achado em nenhum dos vetores");
                    return 0;
                }
            }
        }
        return -1;
    }
    public static int[] retornar (int d){
        int[] x = new int [d];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random() * 256);
        }
        return x;
    }

    public static void main(String[] args) {
        int[] vetor = new int[10];
        int[] matrix = new int[10];
        int[] aux = new int [8];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 5);
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = (int) (Math.random() * 5);
        }
        System.out.println(MeusArrays.pesquisar(vetor, matrix, 2));
        System.out.println("\n\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + " posicao do array 01: " + vetor[i] + "]");
        } 
        System.out.println("\n");
        aux = MeusArrays.retornar(8);
        for (int i = 0; i < aux.length; i++) {
            System.out.println("[" + i + " posicao vetor gerado aleatoriamente: " + vetor[i] + "]");
        }
        
    }
}