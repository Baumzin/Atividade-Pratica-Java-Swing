package Logic;

import javax.swing.*;

public class Functions {


    //criamos um método que valida se os campos do usuário foram todos preenchidos (sim ou nao, verdadeiro ou falso == boolean)
    public static boolean validarCampos(JTextField[] campos) {
        //para cada elemento percorrido no array campo:
        for (JTextField campo : campos) {
            //caso o texto (getText()) que nao tera espaço entre o inicio e o fim(.trim()) seja igual a "" (isEmpty()):
            if (campo.getText().trim().isEmpty()) {

                //retornará falso, logo, algum campo o usuário esqueceu de preencher
                return false;
            }
        }
        //se passar pela verificaçao, ele retorna como verdadeiro
        return true;
    }

    public static void confirmar(JTextField[] campos) {
        if (validarCampos(campos)) {
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            limparCampos(campos);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void excluir(JTextField[] campos) {
        if (validarCampos(campos)) {
            JOptionPane.showMessageDialog(null, "Pessoa deletada do sistema!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            limparCampos(campos);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void limpar(JTextField[] campos) {
        JOptionPane.showMessageDialog(null, "Dados limpos com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        limparCampos(campos);
    }

    private static void limparCampos(JTextField[] campos) {
        // para cada campo do JTextField presente na variavel campos criada durante a criacao dos parametros, iremos setar o texto do
        // campo como vazio
        //Para cada elemento do JtextField campo...
        for (JTextField campo : campos) {
            campo.setText("");
        }
    }
}