import java.util.Scanner;

public class Cap5exe05 {
    public static void main(String[] args) {
        String[] placa = new String[10];
        int[] vaga = new int[10];
        int escolha = 0;
        int op = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("======================Simulador de estacionamento======================");

        do {
            System.out.println("1 - Entrada de veículos");
            System.out.println("2 - Saida de veículos");
            System.out.println("3 - Listar situação");
            System.out.println("4 - Encerrar");
            System.out.println("Sua opção:");
            op = scan.nextInt();
            switch (op) {
            case 1:
                System.out.println("Informe o número da vaga: temos 10 vagas disponíveis ");
                escolha = scan.nextInt();
                System.out.println("Informe a placa do carro: ");
                placa[escolha] = scan.next();
                for (int i = 0; i < vaga.length; i++) {
                    if (vaga[escolha] == 0) {
                        vaga[escolha] = escolha;
                        break;
                    } else {
                        System.out.println("vaga ocupada ou inexistente");
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("Qual a vaga do carro?: ");
                escolha = scan.nextInt();
                for (int i = 0; i < vaga.length; i++) {
                    if (vaga[escolha] != 0) {
                        vaga[escolha] = 0;
                        break;
                    } else {
                        System.out.println("Vaga inexistente ou ocupada");
                        break;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < vaga.length; i++) {
                    System.out.println("[    " + vaga[i] + "   ]");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
            }
        } while (op != 4);
    }
}