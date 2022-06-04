package swing;

import javax.swing.*;
import java.awt.*;

public class Tela02 extends JFrame {

    private String nomeJanela;
    private JPanel panel;
    private JLabel label;
    private JButton button;

    // Ação vinculada ao Botão
    BotaoAction action;

    public Tela02(String _nomeJanela, int _width, int _height){
        this.nomeJanela = _nomeJanela;
        this.setTitle(this.nomeJanela);
        this.setSize(_width,_height);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        this.panel = new JPanel();
        this.panel.setBackground(Color.blue);

        this.button = new JButton("TROCA TELA");
        this.panel.add(this.button);

        this.label = new JLabel(_nomeJanela);


        this.panel.add(label);

        this.add(this.panel);
        this.setVisible(false);
    }

    public JButton getButton(){
        return this.button;
    }

}
