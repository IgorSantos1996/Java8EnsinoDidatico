import java.util.Date;
import java.awt.event.*;
import javax.swing.*;
import java.text.DateFormat;

public class ManipulacaoDataHora extends JFrame {
    private JTextArea taTexto;
    private JButton btMostrar;
    private Date agora;
    final long MILI_SEGUNDOS_POR_DIA = 1000 * 60 * 60 * 24; // milisegundos equivalentes a um dia;

    public static void main(String[] args) {
        JFrame janela = new ManipulacaoDataHora();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }

    public ManipulacaoDataHora() {
        inicializarComponentes();
        definirEventos();

    }

    public void inicializarComponentes() {
        setTitle("Manipulação de Datas e horas");
        setBounds(100, 100, 300, 200);
        taTexto = new JTextArea();
        btMostrar = new JButton("Mostrar");
        add(taTexto, "Center");
        add(btMostrar, "North");
        agora = new Date();

    }

    public void definirEventos() {
        btMostrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                long tempo = agora.getTime(); // recebe o número de milisegundos decorridos desde 1970 até o momento.
                                              // Isso ocorre quando o botão Mostar for pressionado.
                Date novaData = new Date(agora.getTime() + (MILI_SEGUNDOS_POR_DIA * 10)); // novaData recebe o que já
                                                                                          // está armazenado no objeto
                                                                                          // "agora". É uma maneira de
                                                                                          // acrescentar dez dias a um
                                                                                          // variável já definida.
                taTexto.setText("Milisegundos desde 1970: " + tempo + "\nDias: " + tempo / MILI_SEGUNDOS_POR_DIA
                        + "\nMeses: " + tempo / MILI_SEGUNDOS_POR_DIA / 30 + "\nAnos: "
                        + tempo / MILI_SEGUNDOS_POR_DIA / 365 + "\nData: " + novaData);
            }
        });
    }
}
