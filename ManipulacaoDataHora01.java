import java.util.Date;
import java.awt.event.*;
import javax.swing.*;
import java.text.DateFormat;

public class ManipulacaoDataHora01 extends JFrame {
    private JTextArea taTexto;
    private JButton btMostrar;
    private Date agora;
    final long MILI_SEGUNDOS_POR_DIA = 1000 * 60 * 60 * 24; // milisegundos equivalentes a um dia;

    public static void main(String[] args) {
        JFrame janela = new ManipulacaoDataHora01();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }

    public ManipulacaoDataHora01() {
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
                DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
                taTexto.setText("Data Normal: " + agora + "\nData formatada: " + dateFormat.format(agora));
            }
        });
    }
}
