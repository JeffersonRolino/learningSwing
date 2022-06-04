package swing;

// Classe com o nome errado, na verdade esse seria o Controller,
// Acabei nomeando antes de codar, mas como é só para treino não importa mais...
public class MainView {
    public static void main(String[] args) {
//        Formulario form = new Formulario("Formulario");
        Tela01 primeiraTela = new Tela01("PRIMEIRA TELA", 600, 400);
        Tela02 segundaTela = new Tela02("SEGUNDA TELA", 600, 400);


        primeiraTela.getButton().addActionListener(new trocaTela(primeiraTela, segundaTela));
        segundaTela.getButton().addActionListener(new trocaTela(segundaTela, primeiraTela));


    }
}
