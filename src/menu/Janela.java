package menu;

import javax.swing.*;
import java.util.jar.JarEntry;

public class Janela extends JFrame {

    // Construtor da Janela
    public Janela() {
        setTitle("Minha Aplicação");
        setSize(600,300);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Trabalhando com Menus
        JMenuBar menu = new JMenuBar();

        // Essa classe representa cada botão no menu principal.
        // No caso, cada barra como File, Edit, etc...
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenu menuEditar = new JMenu("Editar");

        // Adicionando characteres Mnemonicos aos Menus
        menuArquivo.setMnemonic('A');
        menuEditar.setMnemonic('E');

        //Aqui irei adicionar opções dentre de cada botão do menu princial...
        JMenuItem itemNovo = new JMenuItem("Novo");
        itemNovo.setMnemonic('N');

        // Associar a Action SairAction ao MenuItem Sair...
        JMenuItem itemSair = new JMenuItem(new SairAction());
        itemSair.setText("Sair");
        itemSair.setMnemonic('S');

        JMenuItem itemCopiar = new JMenuItem("Copiar");
        itemCopiar.setMnemonic('C');


        //Adicionar os item de menu ao Menu em questão...
        menuArquivo.add(itemNovo);
        menuArquivo.add(itemSair);

        menuEditar.add(itemCopiar);


        menu.add(menuArquivo);
        menu.add(menuEditar);

        // Atrelando o menu ao Frame...
        // Esse método abaixo pertence a classe JFrame, como a janela
        // herda de JFrame, ela pode ser chamda diretamente e no Construtor...
        setJMenuBar(menu);

        setVisible(true);
    }


    public static void main(String[] args) {
        new Janela();
    }
}
