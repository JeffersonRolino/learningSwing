package swing;

import javax.swing.*;
import java.awt.*;

public class Tela01 extends JFrame {
    private String nomeJanela;
    private JPanel panel;
    private JLabel label;
    private JButton button;

    // Ação vinculada ao Botão
    BotaoAction action;

    public Tela01(String _nomeJanela, int _width, int _height){
        this.nomeJanela = _nomeJanela;
        this.setTitle(this.nomeJanela);
        this.setSize(_width,_height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new JPanel();
        this.panel.setBackground(Color.black);

        this.label = new JLabel(_nomeJanela);

        this.panel.add(label);


        this.button = new JButton("TROCA TELA");
        this.panel.add(this.button);

        this.add(this.panel);
        this.setVisible(true);
    }

    public JPanel getPanel(){
        return this.panel;
    }

    public JButton getButton(){
        return this.button;
    }
}
