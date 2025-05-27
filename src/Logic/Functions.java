package Logic;

import javax.swing.*;

public class Functions {

    // método construtor padrao
    public Functions() {
    }

    // criamos um método funcional que valida se os campos do usuário foram todos
    // preenchidos (sim ou nao, verdadeiro ou falso == boolean)
    public static boolean validarCampos(JTextField[] campos) {
        // para cada elemento percorrido no array campo:
        for (JTextField campo : campos) {
            // caso o texto (getText()) que nao tera espaço entre o inicio e o fim(.trim())
            // seja igual a "" (isEmpty()):
            if (campo.getText().trim().isEmpty()) {

                // retornará falso, logo, algum campo o usuário esqueceu de preencher
                return false;
            }
        }
        // se passar pela verificaçao, ele retorna como verdadeiro
        return true;
    }

    public static void confirmar(JTextField[] campos, ButtonGroup Situacao, JCheckBox forn, JTextField fieldComplemento, JComboBox<String> tipoPessoa) {
        // se validarCampos for verdadeiro (true), ele irá executar o bloco de código
        // abaixo (avisa o cadastro da pessoa)
        if (validarCampos(campos)) {
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!", "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            // aqui abaixxo estou limpando os campos, mas nao estou passando nada para
            // Situacao e forn que já é manipulada na funçao
            limparCampos(campos, Situacao, forn, fieldComplemento, tipoPessoa);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void excluir(JTextField[] campos, ButtonGroup Situacao, JCheckBox forn, JTextField fieldComplemento, JComboBox<String> tipoPessoa) {

        // se validarCampos for verdadeiro (true), ele irá executar o bloco de código
        // abaixo (avisa o delete da pessoa)
        if (validarCampos(campos)) {
            JOptionPane.showMessageDialog(null, "Pessoa deletada do sistema!", "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            limparCampos(campos, Situacao, forn, fieldComplemento, tipoPessoa);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void limpar(JTextField[] campos, ButtonGroup Situacao, JCheckBox forn, JTextField fieldComplemento, JComboBox<String> tipoPessoa) {
        JOptionPane.showMessageDialog(null, "Dados limpos com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        limparCampos(campos, Situacao, forn, fieldComplemento, tipoPessoa);        
    }

    // passo como parametro as 3 variáveis privadas que quero manipular (campos da
    // tela, grupo de botoes e checkbox)
    private static void limparCampos(JTextField[] campos, ButtonGroup Situacao, JCheckBox forn, JTextField fieldComplemento, JComboBox<String> tipoPessoa) {
        // para cada campo do JTextField presente na variavel campos criada durante a
        // criacao dos parametros, iremos setar o texto do
        // campo como vazio
        // Para cada elemento do JtextField campo...
        for (JTextField campo : campos) {
            campo.setText("");
        }

        // aqui estou limpando o grupo de botao Situacao e o CheckBox do fornecedor e
        // deixando-os desmarcados (caso estejam preenchidos)
        if (fieldComplemento != null) {
            fieldComplemento.setText("");
        }

        if (Situacao != null) {
            Situacao.clearSelection();
        }

        if (forn != null) {
            forn.setSelected(false);
        }
        
        if(tipoPessoa != null){
            tipoPessoa.setSelectedIndex(0);
        }
    }
}