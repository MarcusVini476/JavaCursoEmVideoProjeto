package Aula4.HoraDoSistema;

import java.awt.*;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimensao = tk.getScreenSize();
        System.out.println("A resolução de sua tela é: altura(" + dimensao.height+"p), largura("+ dimensao.width+"p)" );
    }
}
