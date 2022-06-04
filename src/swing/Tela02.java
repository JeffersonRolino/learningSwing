package swing;

import javax.swing.*;
import java.awt.*;

public class Tela02 extends JFrame {

    public Tela02(){
        JFrame f  = new JFrame();
        f.setTitle("Janela");
        f.setSize(800,600);
        f.setLocation(600, 400);
        f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        f.setVisible(false);
    }

}
