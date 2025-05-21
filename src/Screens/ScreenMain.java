package Screens;
import java.awt.*;
import javax.swing.*;

public class ScreenMain extends JFrame {
    private JPanel painel;
    private JTextField fieldNome, fieldEmail, fieldLogradouro, fieldMunicipio, fieldNumero, fieldBairro, fieldTelefone, fieldComplemento, fieldCEP, fieldUF, fieldRG, fieldOrgEx, fieldCPF, fieldPais;
    private JLabel lblNome, lblEmail, lblLogradouro, lblMunicipio, lblNumero, lblBairro, lblTelefone, lblComplemento, lblCEP, lblUF, lblOrgEx, lblCPF, lblRG, lblPais, lblTipo, lblTitulo, lblFornecedor;
    private JButton btnConfirmar, btnExcluir, btnLimpar;
    private JCheckBox ativo, inativo;
    private JComboBox<String> tipoPessoa;

    private int altura = 25;

    public ScreenMain() {
        super("Cadastro de Pessoa");
        Initialization();
    }
    
    private void Initialization(){
        painel = new JPanel();
        painel.setLayout(null);

        //------------------- Titulo --------------------------------//
        lblTitulo = new JLabel("Cadastro de Pessoa");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setForeground(Color.ORANGE);
        lblTitulo.setBounds(10, 10, 400, 30);
        //------------------- 1ª Coluna -----------------------------//
        //Tipo de Pessoa
        lblTipo = new JLabel("Tipo");
        lblTipo.setBounds(20,40,150,altura);
        lblTipo.setBackground(Color.white);
        lblTipo.setOpaque(true);
        lblTipo.setHorizontalAlignment(JLabel.CENTER);
        lblTipo.setVerticalAlignment(JLabel.CENTER);
        String[] tipos = {"Física", "Jurídica"};
        tipoPessoa = new JComboBox<>(tipos);
        tipoPessoa.setBounds(180,40,100,altura);

        //Nome
        lblNome = new JLabel("Nome");
        lblNome.setBounds(20,70,150,altura);
        lblNome.setBackground(Color.white);
        lblNome.setOpaque(true);
        lblNome.setHorizontalAlignment(JLabel.CENTER);
        lblNome.setVerticalAlignment(JLabel.CENTER);
        fieldNome = new JTextField();
        fieldNome.setBounds(180,70,1000,altura);

        //RG
        lblRG = new JLabel("RG/inscrição Estadual");
        lblRG.setBounds(20,100,150,altura);
        lblRG.setBackground(Color.white);
        lblRG.setOpaque(true);
        lblRG.setHorizontalAlignment(JLabel.CENTER);
        lblRG.setVerticalAlignment(JLabel.CENTER);
        fieldRG = new JTextField();
        fieldRG.setBounds(180,100,100,altura);

        //Email
        lblEmail = new JLabel("Email");
        lblEmail.setBounds(20,130,150,altura);
        lblEmail.setBackground(Color.white);
        lblEmail.setOpaque(true);
        lblEmail.setHorizontalAlignment(JLabel.CENTER);
        lblEmail.setVerticalAlignment(JLabel.CENTER);
        fieldEmail = new JTextField();
        fieldEmail.setBounds(180,130,430,altura);

        //País
        lblPais = new JLabel("País");
        lblPais.setBounds(20,160,150,altura);
        lblPais.setBackground(Color.white);
        lblPais.setOpaque(true);
        lblPais.setHorizontalAlignment(JLabel.CENTER);
        lblPais.setVerticalAlignment(JLabel.CENTER);
        fieldPais = new JTextField();
        fieldPais.setBounds(180,160,430,altura);

        //Municipio
        lblMunicipio = new JLabel("Município");
        lblMunicipio.setBounds(20,190,150,altura);
        lblMunicipio.setBackground(Color.white);
        lblMunicipio.setOpaque(true);
        lblMunicipio.setHorizontalAlignment(JLabel.CENTER);
        lblMunicipio.setVerticalAlignment(JLabel.CENTER);
        fieldMunicipio = new JTextField();
        fieldMunicipio.setBounds(180,190,1000,altura);

        //Logradouro
        lblLogradouro = new JLabel ("Logradouro");
        lblLogradouro.setBounds(20, 220, 150, altura);
        lblLogradouro.setBackground(Color.white);
        lblLogradouro.setOpaque(true);
        lblLogradouro.setHorizontalAlignment(JLabel.CENTER);
        lblLogradouro.setVerticalAlignment(JLabel.CENTER);
        fieldLogradouro = new JTextField();
        fieldLogradouro.setBounds(180, 220, 1000, altura);

        //Número
        lblNumero = new JLabel ("Numero");
        lblNumero.setBounds(20, 250, 150, altura);
        lblNumero.setBackground(Color.white);
        lblNumero.setOpaque(true);
        lblNumero.setHorizontalAlignment(JLabel.CENTER);
        lblNumero.setVerticalAlignment(JLabel.CENTER);
        fieldNumero = new JTextField();
        fieldNumero.setBounds(180, 250, 100, altura);

        //Bairro
        lblBairro = new JLabel ("Bairro");
        lblBairro.setBounds(20, 280, 150, altura);
        lblBairro.setBackground(Color.white);
        lblBairro.setOpaque(true);
        lblBairro.setHorizontalAlignment(JLabel.CENTER);
        lblBairro.setVerticalAlignment(JLabel.CENTER);
        fieldBairro = new JTextField();
        fieldBairro.setBounds(180, 280, 100, altura);

        //Botão Confirmar
        btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(20,310,100,altura);
        btnConfirmar.setHorizontalAlignment(JLabel.CENTER);
        btnConfirmar.setVerticalAlignment(JLabel.CENTER);
        btnConfirmar.setBackground(new Color(255, 166, 0));
    //----------------------------------------------------------------------
    //--------------------------- 2ª Coluna ------------------------------//
        //CPF-CNPJ
        lblCPF = new JLabel("CPF/CNPJ");
        lblCPF.setBounds(300,50,150,altura);
        lblCPF.setBackground(Color.white);
        lblCPF.setOpaque(true);
        lblCPF.setHorizontalAlignment(JLabel.CENTER);
        lblCPF.setVerticalAlignment(JLabel.CENTER);
        fieldCPF = new JTextField();
        fieldCPF.setBounds(460,50,200,altura);

        //Orgão Expedidor
        lblOrgEx = new JLabel("Orgão Expedidor");
        lblOrgEx.setBounds(300,100,150,altura);
        lblOrgEx.setBackground(Color.white);
        lblOrgEx.setOpaque(true);
        lblOrgEx.setOpaque(true);
        lblOrgEx.setHorizontalAlignment(JLabel.CENTER);
        lblOrgEx.setVerticalAlignment(JLabel.CENTER);
        fieldOrgEx = new JTextField();
        fieldOrgEx.setBounds(460,100,200,altura);

        //Complemento
        lblComplemento = new JLabel("Orgão Expedidor");
        lblComplemento.setBounds(300,255,150,altura);
        lblComplemento.setBackground(Color.white);
        lblComplemento.setOpaque(true);
        lblComplemento.setOpaque(true);
        lblComplemento.setVerticalAlignment(JLabel.CENTER);
        lblComplemento.setHorizontalAlignment(JLabel.CENTER);
        fieldComplemento = new JTextField();
        fieldComplemento.setBounds(460,255,200,altura);

        //Telefone
        lblTelefone = new JLabel("Telefone");
        lblTelefone.setBounds(300, 285, 150, altura);
        lblTelefone.setBackground(Color.white);
        lblTelefone.setOpaque(true);
        lblTelefone.setOpaque(true);
        lblTelefone.setVerticalAlignment(JLabel.CENTER);
        lblTelefone.setHorizontalAlignment(JLabel.CENTER);
        fieldTelefone = new JTextField();
        fieldTelefone.setBounds(460, 285, 200, altura);
    
    //---------------------------------------------------------------------//
    //--------------------------- 3ª Coluna ------------------------------//
        //CEP
        lblCEP = new JLabel("CEP");
        lblCEP.setBounds(620,130,150,altura);
        lblCEP.setBackground(Color.white);
        lblCEP.setOpaque(true);
        lblCEP.setOpaque(true);
        lblCEP.setVerticalAlignment(JLabel.CENTER);
        lblCEP.setHorizontalAlignment(JLabel.CENTER);
        fieldCEP = new JTextField();
        fieldCEP.setBounds(780,130,430,altura);

        //UF
        lblUF = new JLabel("UF");
        lblUF.setBounds(620,160,150,altura);
        lblUF.setBackground(Color.white);
        lblUF.setOpaque(true);
        lblUF.setOpaque(true);
        lblUF.setVerticalAlignment(JLabel.CENTER);
        lblUF.setHorizontalAlignment(JLabel.CENTER);
        fieldUF = new JTextField();
        fieldUF.setBounds(780,160,200,altura);


    //--------------------------------------------------------------------//
    //--------------------------- 4ª Coluna ------------------------------//
        //Fornecedor
        lblFornecedor = new JLabel("Fornecedor");
        lblFornecedor.setBounds(1000, 40, 150, altura);
        lblFornecedor.setBackground(Color.white);
        lblFornecedor.setOpaque(true);
        lblFornecedor.setVerticalAlignment(JLabel.CENTER);
        lblFornecedor.setHorizontalAlignment(JLabel.CENTER);
        
        

    //----------------------------------------------------------------------//
        //Adicionando no painel
        //----- Titulo ------------/
        painel.add(lblTitulo);
        //----- 1ª coluna --------/
        painel.add(lblTipo);
        painel.add(tipoPessoa);
        painel.add(lblNome);
        painel.add(fieldNome);
        painel.add(lblRG);
        painel.add(fieldRG);
        painel.add(lblEmail);
        painel.add(fieldEmail);
        painel.add(btnConfirmar);
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
        //------------------------//
        //----- 2ª coluna --------//
        painel.add(lblCPF);
        painel.add(fieldCPF);
        painel.add(lblOrgEx);
        painel.add(fieldOrgEx);
        painel.add(lblComplemento);
        painel.add(fieldComplemento);

        //-------------------------//
        //----- 3ª coluna --------//
        painel.add(lblUF);
        painel.add(fieldUF);
        painel.add(lblCEP);
        painel.add(fieldCEP);
        painel.add(lblTelefone);
        painel.add(fieldTelefone);
        //------------------------//
        //----- 4ª coluna --------//
        painel.add(lblFornecedor);

        //Configurando o painel
        this.setContentPane(painel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,350);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

