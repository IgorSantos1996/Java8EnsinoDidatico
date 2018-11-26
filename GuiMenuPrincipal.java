import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class GuiMenuPrincipal extends JFrame {
    private Container contentPane; // objeto do tipo Container, uma classe que permite que outros componentes sejam
                                   // adicionados a ela. o objeto contentPane vai abrigar objetos do tipo JPanel.
    private JMenuBar mnBarra; 
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao;

    public GuiMenuPrincipal() {
        inicializarComponentes();
        definirEvento();

    }

    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);
        contentPane = getContentPane();
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A'); // define uma tecla de acesso rápido ao menu. Alt + A
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E'); // define uma tecla de acesso rápido ao menu. Alt + E
        miSair = new JMenuItem("Sair", new ImageIcon("sair.jpg")); // cria o objeto miSair com um texto e um ícone.
                                                                   // Assim como o texto, esse ícone também será
                                                                   // adicionado ao menu Sair.
        miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK)); // definem um menu de atalho
                                                                                            // para o item Sair por meio
                                                                                            // do método setAccelerator
        miBotao = new JMenuItem("Botao"); // cria o item de menu miBotao
        mnArquivo.add(miSair); // add o item de menu ao menu correspondente.
        mnExemplos.add(miBotao); // add o item de menu ao menu correspondente.
        mnBarra.add(mnArquivo); // add mnArquivo à barra de menus
        mnBarra.add(mnExemplos); // add mnExemplos à barra de menus
        setJMenuBar(mnBarra); // define o objeto mnBarra como sendo a barra de menus do frame.
    }

    private void definirEvento() {
        miSair.addActionListener(new ActionListener() { // define o evento clique para o item do menu miSair. Quando o
                                                        // usuário escolher essa opção, a aplicação será encerrada.
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        miBotao.addActionListener(new ActionListener() { // define evento clique para o item de menu miBotao.

            @Override
            public void actionPerformed(ActionEvent e) {
                // esse item de menu será o responsável por carregar a aplicação
            }
        });
    }

    public static void abrir() { // responsável por criar um objeto do tipo GuiMenuPrincipal e mostrá-lo
        GuiMenuPrincipal frame = new GuiMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }
}