import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
//import com.sun.media.sound.Toolkit;

public class GUIlogin extends JFrame { // GUIlogin vai utilizar todos os recursos de JFrame
    private JTextField tfLogin;
    private JLabel lbSenha;
    private JLabel lbLogin;
    private JButton btLogar;
    private JButton btCancelar;
    private JPasswordField pfSenha;
    private static GUIlogin frame;

    public GUIlogin() {
        inicializarComponentes(); // características visuais dos componentes gráficos
        definirEventos(); // eventos

    }

    private void inicializarComponentes() {
        setTitle("Login no Sistema"); // define o o títilo "Login no sistema" por meio desse método setTitle na janela
                                      // do sistema
        setBounds(0, 0, 250, 200); // posicionamento,largura e altura
        setLayout(null);
        tfLogin = new JTextField(5); // criação do objeto
        pfSenha = new JPasswordField(5); // criação do objeto o número 5 diz respeito ao cumprimento da caixa de texto
        lbSenha = new JLabel("Senha: "); // criação da label senha
        lbLogin = new JLabel("Login: "); // criação da label Login
        btLogar = new JButton("Logar: "); // criação do botão Logar
        btCancelar = new JButton("Cancelar: "); // criação do botão Cancelar
        tfLogin.setBounds(100, 30, 120, 25); // posição do componente gráfico tflogin
        lbLogin.setBounds(30, 30, 80, 25); // posição do componente gráfico lblogin
        lbSenha.setBounds(30, 75, 80, 25); // posição do componente gráfico lbsenha
        pfSenha.setBounds(100, 75, 120, 25); // posição do componente gráfico pfsenha
        btLogar.setBounds(20, 120, 100, 25); // posição do componente gráfico btlogar
        btCancelar.setBounds(125, 120, 100, 25);// posição do componente gráfico btcancelar

        // Aqui é como montar um quebra cabeça, adicionando os componentes gráficos ao
        // frame com o método add
        add(tfLogin);
        add(lbSenha);
        add(lbLogin);
        add(btLogar);
        add(btCancelar);
        add(pfSenha);
    }

    private void definirEventos() { // definir todos os eventos associados ao usuário.
        // todo evento a ser controlado pela aplicação possui a seguinte estrutura.
        btLogar.addActionListener(new ActionListener() { // adiciona o evento de ação ao botão btLogar e implementa o
                                                         // código referente a esse botão

            @Override
            public void actionPerformed(ActionEvent e) {
                String senha = String.valueOf(pfSenha.getPassword()); // o método getPassword() retorna um vetor de
                                                                      // caracteres, referente a senha que digitamos.
                                                                      // Convertermos para uma String a partir do método
                                                                      // valueOF(). Esse valor convertido será
                                                                      // armazenada na String senha. É preciso fazer
                                                                      // isso para podermos comparar o que o usuário
                                                                      // digitou com a senha definida
                if (tfLogin.getText().equals("java8") && senha.equals("java8")) { // realiza a comparação do que o
                                                                                  // usuário digitou na caixa "tfLogin"
                                                                                  // com o conteúdo "java8"; Para pegar
                                                                                  // o conteúdo texto armazenado num
                                                                                  // JTextField é usado o método
                                                                                  // getText. Também comparamos o
                                                                                  // conteúdo armazenado na variável
                                                                                  // "senha" com "java8". Caso login e
                                                                                  // senha não satisfação as condições,
                                                                                  // pula para a linha 78 e informa que
                                                                                  // foram inválidos
                    frame.setVisible(false);
                    GuiMenuPrincipal.abrir();
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou Senha incorretas: ");
                }
            }
        });

        btCancelar.addActionListener(new ActionListener() { // adicione ao botão cancelar um novo ouvinte de ação
                                                            // chamado ActionListener, uma interface que especifica o
                                                            // método actionPerformed

            @Override
            public void actionPerformed(ActionEvent ax) { // receba a ação disparada por meio de ActionEvent e execute o
                                                          // código implementado no método actionPerformed
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                frame = new GUIlogin();// recebe todas as características definidas no construtor, incluindo a
                                       // inicialização dos componentes e a definição dos eventos
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // encerrar a aplicação quando a janela for
                                                                      // fechada
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize(); // cria uma objeto tela contendo as
                                                                              // dimensões da tela
                frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2); // define
                                                                                                                         // a
                                                                                                                         // localização
                                                                                                                         // que
                                                                                                                         // o
                                                                                                                         // frame
                                                                                                                         // aparecerá
                                                                                                                         // na
                                                                                                                         // tela
                                                                                                                         // do
                                                                                                                         // monitor
                                                                                                                         // por
                                                                                                                         // meio
                                                                                                                         // do
                                                                                                                         // método
                                                                                                                         // setLocation
                frame.setVisible(true);
            }
        });
    }
}