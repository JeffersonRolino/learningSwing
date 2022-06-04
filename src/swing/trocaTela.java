package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trocaTela implements ActionListener {

    JFrame tela01;
    JFrame tela02;

    public trocaTela(JFrame _tela01, JFrame _tela02){
        this.tela01 = _tela01;
        this.tela02 = _tela02;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.tela01.setVisible(false);
        this.tela02.setVisible(true);
    }
}
