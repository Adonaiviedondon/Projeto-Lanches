import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabelaProdutosGUI extends JFrame {
    private JTextField txtNome, txtObs, txtValor;
    private JButton btnAdicionar, btnCalcular;
    private JTable tabela;
    private DefaultTableModel modeloTabela;

    public TabelaProdutosGUI() {
        // Configurar a janela
        setTitle("Lista de Produtos");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Criar componentes
        txtNome = new JTextField("Nome do Produto");
        txtNome.setBounds(20, 20, 150, 20);

        txtObs = new JTextField("Descrição");
        txtObs.setBounds(20, 50, 150, 20);

        txtValor = new JTextField("0.0");
        txtValor.setBounds(20, 80, 150, 20);

        btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(200, 50, 100, 20);

        btnCalcular = new JButton("Calcular Total");
        btnCalcular.setBounds(200, 80, 150, 20);

        // Modelo da tabela
        modeloTabela = new DefaultTableModel();
        modeloTabela.addColumn("Nome");
        modeloTabela.addColumn("Descrição");
        modeloTabela.addColumn("Valor");

        // Tabela
        tabela = new JTable(modeloTabela);
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(20, 120, 450, 100);

        // Adicionar componentes à janela
        add(txtNome);
        add(txtObs);
        add(txtValor);
        add(btnAdicionar);
        add(btnCalcular);
        add(scrollPane);

        // Adicionar ação ao botão Adicionar
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarProduto();
            }
        });

        // Adicionar ação ao botão Calcular Total
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularTotal();
            }
        });
    }

    private void adicionarProduto() {
        // Lógica para adicionar o produto à tabela
        String nome = txtNome.getText();
        String descricao = txtObs.getText();
        double valor = Double.parseDouble(txtValor.getText());

        modeloTabela.addRow(new Object[]{nome, descricao, valor});
    }

    private void calcularTotal() {
        // Lógica para calcular o valor total
        double total = 0.0;
        for (int i = 0; i < modeloTabela.getRowCount(); i++) {
            total += (double) modeloTabela.getValueAt(i, 2);
        }

        JOptionPane.showMessageDialog(this, "O valor total de todos os produtos é: " + total);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TabelaProdutosGUI().setVisible(true);
        });
    }
}