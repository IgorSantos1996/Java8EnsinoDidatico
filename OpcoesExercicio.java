import javax.swing.JOptionPane;

public class OpcoesExercicio {
    public static void main(String[] args) {
        int responder;
        String comparar;
        responder = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção:\n" + "\n1 - Exercicio 1"
                + "\n2 - Exercicio 2" + "\n3 - Exercicio 3" + "\n4 - Exercicio 4"));
        comparar = String.valueOf(responder);
        if (comparar != null) {
            responder = Integer.parseInt(comparar);
            switch (responder) {
            case 1:
                String nome = JOptionPane.showInputDialog("Entre com o nome do produto: ");
                float preco = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor do produto: "));
                float descontado = 0;
                try {
                    if (preco <= 0) {
                        JOptionPane.showMessageDialog(null, "Valor do " + nome + " <= 0!");
                    } else if ((preco >= 50) && (preco < 200)) {
                        descontado = preco;
                        preco = preco * 5 / 100;

                    } else if ((preco >= 200) && (preco < 500)) {
                        descontado = preco;
                        preco = preco * 6 / 100;
                    } else if ((preco >= 500) && (preco < 100)) {
                        descontado = preco;
                        preco = preco * 7 / 100;
                    } else {
                        descontado = preco;
                        preco = preco * 8 / 100;
                    }
                    JOptionPane.showMessageDialog(null, "Nome do produto: " + nome);
                    JOptionPane.showMessageDialog(null, "Valor original do produto: R$" + descontado);
                    JOptionPane.showMessageDialog(null, "Valor do produto com desconto: R$" + (descontado - preco));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Não foi fornecido um número inteiro válido! " + e.toString());
                }
                break;
            case 2:
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
                        "A média das resistências é " + soma + "\nResistencia fornecidas: " + resistencia01 + ", "
                                + resistencia02 + ", " + resistencia03 + ", " + resistencia04 + "\n"
                                + "A maior resistência é: " + maior + "\n" + "A menor resistencia é: " + menor);
                break;
            case 3:
                int qtd = 3;
                boolean foi = false;
                String user;
                String passw;

                while ((qtd > 0) && (foi == false)) {
                    try {
                        user = JOptionPane.showInputDialog("Informe o login ");
                        for (int i = 0; i < user.length(); i++) {
                            Character caractere = user.charAt(i);
                            if (Character.isDigit(caractere)) {
                                throw new Exception("Não pode conter números no seu user!\n");
                            }
                        }
                        passw = JOptionPane.showInputDialog("Informe a senha ");
                        if (!(user.equalsIgnoreCase("java")) && (!(passw.equalsIgnoreCase("java")))) {
                            qtd--;
                            JOptionPane.showMessageDialog(null, "Senha ou usuário inválido");
                            JOptionPane.showMessageDialog(null, "Agora você possui só mais " + qtd + " tentativas!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Login e senha aceitos! Seja bem-bindo");
                            foi = true;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "" + e);

                    }
                }
                break;
            case 4:
                int numero;
                String resultado = "";
                String[] opcao = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
                String resp = (String) JOptionPane.showInputDialog(null, "Selecione a tabuada que deseja: \n ",
                        "Tabuada", JOptionPane.PLAIN_MESSAGE, null, opcao, "1");

                if (resp == null) {
                    JOptionPane.showMessageDialog(null, "Você pressionou o botão de cancel!");

                } else {
                    numero = Integer.parseInt(resp);
                    for (int k = 0; k < 11; k++) {
                        if ((numero > 0) && (numero < 11)) {
                            int produto = numero * k;
                            resultado += numero + " x " + k + " = " + produto + "\n";
                        } else {
                            JOptionPane.showMessageDialog(null, "Numero muito grande ou  muito pequeno!");
                        }
                    }
                    JOptionPane.showMessageDialog(null, resultado);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma opção listada foi digitada! saindo ...");

            }
            System.exit(0);
        } else {
            System.exit(0);
        }
    }
}