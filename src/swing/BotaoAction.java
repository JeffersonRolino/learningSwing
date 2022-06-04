package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoAction implements ActionListener {

    private JTextField t;

    public BotaoAction(JTextField _t){
        this.t = _t;
    }

    // Tratar o evento e aplicar ação no evento...
    @Override
    public void actionPerformed(ActionEvent e) {
        // Retorna o texto digitado em uma caixa de texto...
        String nome = t.getText();

        JOptionPane.showMessageDialog(null, "Foi digitado " + nome);
    }
}
