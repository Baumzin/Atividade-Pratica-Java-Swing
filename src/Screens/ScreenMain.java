package Screens;

import java.awt.*;
import javax.swing.*;

public class ScreenMain extends JFrame {
    private JPanel painel;
    private JTextField fieldNome, fieldEmail, fieldLogradouro, fieldMunicipio, fieldNumero, fieldBairro, fieldTelefone,
            fieldComplemento, fieldCEP, fieldUF, fieldRG, fieldOrgEx, fieldCPF, fieldPais, fieldLadoUF;
    private JLabel lblNome, lblEmail, lblLogradouro, lblMunicipio, lblNumero, lblBairro, lblTelefone, lblComplemento,
            lblCEP, lblUF, lblOrgEx, lblCPF, lblRG, lblPais, lblTipo, lblTitulo, lblFornecedor, lblSit;
    private JButton btnConfirmar, btnExcluir, btnLimpar;
    private JRadioButton ativo, inativo;
    private JCheckBox forn;
    private JComboBox<String> tipoPessoa;
    private JTextField[] listaFields;
    ButtonGroup Situacao = new ButtonGroup();

    private int altura = 25;

    public ScreenMain() {
        super("Cadastro de Pessoa");
        Initialization();
    }

    private void Initialization() {
        painel = new JPanel();
        painel.setLayout(null);

        // ------------------- Titulo --------------------------------//
        lblTitulo = new JLabel("Cadastro de Pessoa");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 60));
        lblTitulo.setForeground(Color.ORANGE);
        lblTitulo.setBounds(20, 30, 600, 60);
        // ------------------- 1ª Coluna -----------------------------//
        // Tipo de Pessoa
        lblTipo = new JLabel("Tipo");
        lblTipo.setBounds(20, 110, 150, altura);
        lblTipo.setBackground(Color.white);
        lblTipo.setOpaque(true);
        lblTipo.setHorizontalAlignment(JLabel.CENTER);
        lblTipo.setVerticalAlignment(JLabel.CENTER);
        String[] tipos = { "Física", "Jurídica" };
        tipoPessoa = new JComboBox<>(tipos);
        tipoPessoa.setBounds(180, 110, 180, altura);

        // Nome
        lblNome = new JLabel("Nome");
        lblNome.setBounds(20, 150, 150, altura);
        lblNome.setBackground(Color.white);
        lblNome.setOpaque(true);
        lblNome.setHorizontalAlignment(JLabel.CENTER);
        lblNome.setVerticalAlignment(JLabel.CENTER);
        fieldNome = new JTextField();
        fieldNome.setBounds(180, 150, 800, altura);

        // RG
        lblRG = new JLabel("RG/inscrição Estadual");
        lblRG.setBounds(20, 190, 150, altura);
        lblRG.setBackground(Color.white);
        lblRG.setOpaque(true);
        lblRG.setHorizontalAlignment(JLabel.CENTER);
        lblRG.setVerticalAlignment(JLabel.CENTER);
        fieldRG = new JTextField();
        fieldRG.setBounds(180, 190, 250, altura);

        // Email
        lblEmail = new JLabel("Email");
        lblEmail.setBounds(20, 230, 150, altura);
        lblEmail.setBackground(Color.white);
        lblEmail.setOpaque(true);
        lblEmail.setHorizontalAlignment(JLabel.CENTER);
        lblEmail.setVerticalAlignment(JLabel.CENTER);
        fieldEmail = new JTextField();
        fieldEmail.setBounds(180, 230, 430, altura);

        // País
        lblPais = new JLabel("País");
        lblPais.setBounds(20, 270, 150, altura);
        lblPais.setBackground(Color.white);
        lblPais.setOpaque(true);
        lblPais.setHorizontalAlignment(JLabel.CENTER);
        lblPais.setVerticalAlignment(JLabel.CENTER);
        fieldPais = new JTextField("BRASIL");
        fieldPais.setBounds(180, 270, 430, altura);
        fieldPais.setBackground(Color.GRAY);

        // Municipio
        lblMunicipio = new JLabel("Município");
        lblMunicipio.setBounds(20, 310, 150, altura);
        lblMunicipio.setBackground(Color.white);
        lblMunicipio.setOpaque(true);
        lblMunicipio.setHorizontalAlignment(JLabel.CENTER);
        lblMunicipio.setVerticalAlignment(JLabel.CENTER);
        fieldMunicipio = new JTextField();
        fieldMunicipio.setBounds(180, 310, 800, altura);
        fieldMunicipio.setBackground(Color.GRAY);

        // Logradouro
        lblLogradouro = new JLabel("Logradouro");
        lblLogradouro.setBounds(20, 350, 150, altura);
        lblLogradouro.setBackground(Color.white);
        lblLogradouro.setOpaque(true);
        lblLogradouro.setHorizontalAlignment(JLabel.CENTER);
        lblLogradouro.setVerticalAlignment(JLabel.CENTER);
        fieldLogradouro = new JTextField();
        fieldLogradouro.setBounds(180, 350, 800, altura);
        fieldLogradouro.setBackground(Color.GRAY);

        // Número
        lblNumero = new JLabel("Numero");
        lblNumero.setBounds(20, 390, 150, altura);
        lblNumero.setBackground(Color.white);
        lblNumero.setOpaque(true);
        lblNumero.setHorizontalAlignment(JLabel.CENTER);
        lblNumero.setVerticalAlignment(JLabel.CENTER);
        fieldNumero = new JTextField();
        fieldNumero.setBounds(180, 390, 150, altura);

        // Bairro
        lblBairro = new JLabel("Bairro");
        lblBairro.setBounds(20, 430, 150, altura);
        lblBairro.setBackground(Color.white);
        lblBairro.setOpaque(true);
        lblBairro.setHorizontalAlignment(JLabel.CENTER);
        lblBairro.setVerticalAlignment(JLabel.CENTER);
        fieldBairro = new JTextField();
        fieldBairro.setBounds(180, 430, 150, altura);
        // ----------------------------------------------------------------------
        // --------------------------- 2ª Coluna ------------------------------//
        // CPF-CNPJ
        lblCPF = new JLabel("CPF/CNPJ");
        lblCPF.setBounds(370, 110, 180, altura);
        lblCPF.setBackground(Color.white);
        lblCPF.setOpaque(true);
        lblCPF.setHorizontalAlignment(JLabel.CENTER);
        lblCPF.setVerticalAlignment(JLabel.CENTER);
        fieldCPF = new JTextField();
        fieldCPF.setBounds(560, 110, 200, altura);

        // Orgão Expedidor
        lblOrgEx = new JLabel("Orgão Expedidor");
        lblOrgEx.setBounds(450, 190, 150, altura);
        lblOrgEx.setBackground(Color.white);
        lblOrgEx.setOpaque(true);
        lblOrgEx.setHorizontalAlignment(JLabel.CENTER);
        lblOrgEx.setVerticalAlignment(JLabel.CENTER);
        fieldOrgEx = new JTextField();
        fieldOrgEx.setBounds(610, 190, 160, altura);

        // Complemento
        lblComplemento = new JLabel("Complemento");
        lblComplemento.setBounds(340, 390, 150, altura);
        lblComplemento.setBackground(Color.white);
        lblComplemento.setOpaque(true);
        lblComplemento.setVerticalAlignment(JLabel.CENTER);
        lblComplemento.setHorizontalAlignment(JLabel.CENTER);
        fieldComplemento = new JTextField();
        fieldComplemento.setBounds(500, 390, 430, altura);

        // Telefone
        lblTelefone = new JLabel("Telefone");
        lblTelefone.setBounds(340, 430, 150, altura);
        lblTelefone.setBackground(Color.white);
        lblTelefone.setOpaque(true);
        lblTelefone.setVerticalAlignment(JLabel.CENTER);
        lblTelefone.setHorizontalAlignment(JLabel.CENTER);
        fieldTelefone = new JTextField();
        fieldTelefone.setBounds(500, 430, 200, altura);

        // ---------------------------------------------------------------------//
        // --------------------------- 3ª Coluna ------------------------------//
        // CEP
        lblCEP = new JLabel("CEP");
        lblCEP.setBounds(620, 230, 150, altura);
        lblCEP.setBackground(Color.white);
        lblCEP.setOpaque(true);
        lblCEP.setVerticalAlignment(JLabel.CENTER);
        lblCEP.setHorizontalAlignment(JLabel.CENTER);
        fieldCEP = new JTextField();
        fieldCEP.setBounds(780, 230, 200, altura);

        // UF
        lblUF = new JLabel("UF");
        lblUF.setBounds(620, 270, 150, altura);
        lblUF.setBackground(Color.white);
        lblUF.setOpaque(true);
        lblUF.setVerticalAlignment(JLabel.CENTER);
        lblUF.setHorizontalAlignment(JLabel.CENTER);
        fieldUF = new JTextField();
        fieldUF.setBounds(780, 270, 40, altura);
        fieldLadoUF = new JTextField("");
        fieldLadoUF.setBounds(830, 270, 150, altura);
        fieldLadoUF.setBackground(Color.GRAY);
        // --------------------------------------------------------------------//
        // --------------------------- 4ª Coluna ------------------------------//
        // Fornecedor
        lblFornecedor = new JLabel("Fornecedor");
        lblFornecedor.setBounds(770, 110, 150, altura);
        lblFornecedor.setBackground(Color.white);
        lblFornecedor.setOpaque(true);
        lblFornecedor.setVerticalAlignment(JLabel.CENTER);
        lblFornecedor.setHorizontalAlignment(JLabel.CENTER);
        forn = new JCheckBox();
        forn.setBounds(930, 110, 150, altura);

        // Situaçao
        lblSit = new JLabel("Situação");
        lblSit.setBounds(720, 430, 150, altura);
        lblSit.setBackground(Color.white);
        lblSit.setOpaque(true);
        lblSit.setVerticalAlignment(JLabel.CENTER);
        lblSit.setHorizontalAlignment(JLabel.CENTER);
        ativo = new JRadioButton("Ativo");
        ativo.setBounds(880, 430, 60, altura);
        inativo = new JRadioButton("Inativo");
        inativo.setBounds(940, 430, 80, altura);
        Situacao.add(ativo);
        Situacao.add(inativo);
        // ------------------ Adicionando os campos ao Array ---------------------//
        listaFields = new JTextField[] {
                fieldNome, fieldEmail, fieldLogradouro, fieldMunicipio,
                fieldNumero, fieldBairro, fieldTelefone, fieldComplemento,
                fieldCEP, fieldUF, fieldRG, fieldOrgEx, fieldCPF, fieldPais,
                fieldLadoUF
        };
        // ----------------------------------------------------------------------//
        // ------------------ Criando os Botoes ---------------------------------//
        // Botão Confirmar
        btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(20, 470, 100, altura);
        btnConfirmar.setHorizontalAlignment(JLabel.CENTER);
        btnConfirmar.setVerticalAlignment(JLabel.CENTER);
        btnConfirmar.setBackground(new Color(255, 166, 0));
        btnConfirmar.addActionListener(e -> Confirmar());

        // Botao Excluir
        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(140, 470, 100, altura);
        btnExcluir.setHorizontalAlignment(JLabel.CENTER);
        btnExcluir.setVerticalAlignment(JLabel.CENTER);
        btnExcluir.setBackground(new Color(255, 166, 0));
        btnExcluir.addActionListener(e -> Excluir());

        // Botao Limpar
        btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(260, 470, 100, altura);
        btnLimpar.setHorizontalAlignment(JLabel.CENTER);
        btnLimpar.setVerticalAlignment(JLabel.CENTER);
        btnLimpar.setBackground(new Color(185, 185, 185));
        btnLimpar.addActionListener(e -> Limpar());

        // ----------------------------------------------------------------------//

        // Adicionando no painel
        // ----- Titulo ------------/
        painel.add(lblTitulo);
        // ----- 1ª coluna --------/
        painel.add(lblTipo);
        painel.add(tipoPessoa);
        painel.add(lblNome);
        painel.add(fieldNome);
        painel.add(lblRG);
        painel.add(fieldRG);
        painel.add(lblEmail);
        painel.add(fieldEmail);
        painel.add(lblPais);
        painel.add(fieldPais);
        painel.add(lblMunicipio);
        painel.add(fieldMunicipio);
        painel.add(lblLogradouro);
        painel.add(fieldLogradouro);
        painel.add(lblNumero);
        painel.add(fieldNumero);
        painel.add(lblBairro);
        painel.add(fieldBairro);
        // ------------------------//
        // ----- 2ª coluna --------//
        painel.add(lblCPF);
        painel.add(fieldCPF);
        painel.add(lblOrgEx);
        painel.add(fieldOrgEx);
        painel.add(lblComplemento);
        painel.add(fieldComplemento);

        // -------------------------//
        // ----- 3ª coluna --------//
        painel.add(lblUF);
        painel.add(fieldUF);
        painel.add(lblCEP);
        painel.add(fieldCEP);
        painel.add(lblTelefone);
        painel.add(fieldTelefone);
        // ------------------------//
        // ----- 4ª coluna --------//
        painel.add(lblFornecedor);
        painel.add(forn);
        painel.add(lblSit);
        painel.add(inativo);
        painel.add(ativo);
        painel.add(fieldLadoUF);
        // ----- Botoes ------------//
        painel.add(btnConfirmar);
        painel.add(btnExcluir);
        painel.add(btnLimpar);

        // Configurando o painel
        this.setContentPane(painel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1050, 550);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    // verificamos se todos os dados necessários foram preenchidos e entao
    // registraamos a nova pessoa cadastrada
    private void Confirmar() {
        // Verificando se os campos foram preenchidos
        if (fieldNome.getText().isEmpty() || fieldComplemento.getText().isEmpty() || fieldMunicipio.getText().isEmpty()
                || fieldBairro.getText().isEmpty() || fieldCEP.getText().isEmpty() || fieldTelefone.getText().isEmpty()
                || fieldEmail.getText().isEmpty() || fieldPais.getText().isEmpty() || fieldOrgEx.getText().isEmpty()
                || fieldLogradouro.getText().isEmpty() || fieldNumero.getText().isEmpty() || fieldUF.getText().isEmpty()
                || fieldCPF.getText().isEmpty() || fieldComplemento.getText().isEmpty()
                || fieldRG.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Pessoa Cadastrada com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            LimparDados();
        }

    }

    // para excluir a pessoa, primeiro identificamos se todos os campos necessários
    // foram preenchidos para só depois deletá-la totalmente
    private void Excluir() {
        if (fieldNome.getText().isEmpty() || fieldComplemento.getText().isEmpty() || fieldMunicipio.getText().isEmpty()
                || fieldBairro.getText().isEmpty() || fieldCEP.getText().isEmpty() || fieldTelefone.getText().isEmpty()
                || fieldEmail.getText().isEmpty() || fieldPais.getText().isEmpty() || fieldOrgEx.getText().isEmpty()
                || fieldLogradouro.getText().isEmpty() || fieldNumero.getText().isEmpty() || fieldUF.getText().isEmpty()
                || fieldCPF.getText().isEmpty() || fieldComplemento.getText().isEmpty()
                || fieldRG.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Pessoa Deletada do Sistema!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            LimparDados();
        }
        
    }

    // reutilizo a funçao limparDados ja criada e apenas dou uma mensagem ao usuário
    private void Limpar() {
        JOptionPane.showMessageDialog(null, "Dados Limpos com Sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        LimparDados();
    }

    private void LimparDados() {
        // para cda campo do JTextField presente na listaFields, iremos setar o texto do
        // campo como vazio
        for (JTextField campo : listaFields) {
            campo.setText("");
        }

        // Aqui irei voltar esses campos em sua configuraçao inicial
        tipoPessoa.setSelectedIndex(0); // setando o campo tipoPessoa para o indice 0
        forn.setSelected(false); // estara desmarcado após a execução da função
        Situacao.clearSelection();
    }
}