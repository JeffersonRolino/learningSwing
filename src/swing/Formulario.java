package swing;

import javax.swing.*;

public class Formulario extends JFrame {

    private String nomeJanela;

    // Permite agrupar outros componentes dentro dele
    JPanel panel;

    // Texto qualquer na janela...
    JLabel label;

    // Campo de texto
    JTextField textField;

    // Botão simples
    JButton button;

    // Ação vinculada ao Botão
    BotaoAction action;

    public Formulario(String _nomeJanela){
        this.nomeJanela = _nomeJanela;
        this.setTitle(this.nomeJanela);
        this.setSize(300,200);
        this.setLocation(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new JPanel();
        this.add(this.panel);
        this.label = new JLabel("Digite seu nome:");
        this.panel.add(this.label);
        this.textField = new JTextField(10);
        this.panel.add(this.textField);
        this.button = new JButton("OK");
        this.panel.add(this.button);

        // Vamos registrar um Listener no botão para avisar ao Java
        // quem está ouvindo...
        this.action = new BotaoAction(this.textField);
        button.addActionListener(this.action);

        this.setVisible(true);
    }
}
