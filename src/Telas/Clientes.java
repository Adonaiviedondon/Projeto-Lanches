/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Telas;

import ConexaoDB.ModuloConexao;
import Formatacao.FormatTft;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author adonai
 */
public class Clientes extends javax.swing.JInternalFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form Cliente
     */
    public Clientes() {
        initComponents();
        txtNomeCliente.setDocument(new FormatTft(50, FormatTft.TipoEntrada.NOME));
        conexao = ModuloConexao.conector();
    }
    
    private void listar() {
        DefaultListModel<String> list = new DefaultListModel<>();
        ListClientes.setModel(list);
        String readCliente = "select * from tbClientes where usuario like '" + txtNomeCliente.getText() + "%'" + "order by usuario";
        try {
            conexao = ModuloConexao.conector();
            pst = conexao.prepareStatement(readCliente);
            rs = pst.executeQuery();
            while (rs.next()) {
                Jclientes.setVisible(true);
                list.addElement(rs.getString(2));
                if (txtNomeCliente.getText().isEmpty()) {
                    Jclientes.setVisible(false);
                }
            }
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void buscar(){
        int busca = ListClientes.getSelectedIndex();
        if(busca >=0){
            String buscaCliente = "select * from tbClientes where cliente like '" + txtNomeCliente.getText() + "%'" + "order by cliente limit" + busca + ",1";
            try{
                conexao =  ModuloConexao.conector();
                pst = conexao.prepareStatement(buscaCliente);
                rs = pst.executeQuery();
                while(rs.next()){
                    Jclientes.setVisible(false);
                    txtIdCliente.setText(rs.getString(1));
                    txtNomeCliente.setText(rs.getString(2));
                    txtClienteCidade.setText(rs.getString(3));
                    txtClienteBairro.setText(rs.getString(4));
                    txtClienteEndereço.setText(rs.getString(5));
                    txtClienteCEP.setText(rs.getString(6));
                    txtClienteEmail.setText(rs.getString(7));
                   }
            } catch (Exception e) {
            }
        }else{
            Jclientes.setVisible(false);
        }
    }
    
    private void adicionar(){
       String sql = "insert into tbClientes(nomeCliente,cidadeCliente,bairroCliente,endCliente,cepCliente,emailCliente) values (?,?,?,?,?,?)";
      try {
            conexao = ModuloConexao.conector();
            pst = conexao.prepareStatement(sql);
            //pst.setString(1,txtIdUsuario.getText());
            pst.setString(1,  txtNomeCliente.getText());
            pst.setString(2, txtClienteCidade.getText());
            pst.setString(3, txtClienteBairro.getText());
            pst.setString(4, txtClienteEndereço.getText());
            pst.setString(5, txtClienteCEP.getText());
            pst.setString(6, txtClienteEmail.getText());
            if (txtNomeCliente.getText().isEmpty() || txtClienteCidade.getText().isEmpty() || txtClienteBairro.getText().isEmpty() || txtClienteEndereço.getText().isEmpty() || txtClienteCEP.getText().isEmpty() || txtClienteEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "há campos vazios preencha todos por favor");

            } else {

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso");
                txtNomeCliente.setText(null);
                txtClienteCidade.setText(null);
                txtClienteBairro.setText(null);
                txtClienteEndereço.setText(null);
                txtClienteCEP.setText(null);
                txtClienteEmail.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o usuário");

        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    private void atualizar() {
        String sql = "update tbClientes set nomeCliente = ?, cidadeCliente = ?, bairroCliente = ?, endCliente = ?, cepCliente = ?, emailCliente = ? where idUser = ? ";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNomeCliente.getText());
            pst.setString(2, txtClienteCidade.getText());
            pst.setString(3, txtClienteBairro.getText());
            pst.setString(4, txtClienteEndereço.getText());
            pst.setString(5, txtClienteCEP.getText());
            pst.setString(6, txtClienteEmail.getText());
            if (txtNomeCliente.getText().isEmpty() || txtClienteCidade.getText().isEmpty() || txtClienteBairro.getText().isEmpty() || txtClienteEndereço.getText().isEmpty() || txtClienteCEP.getText().isEmpty() || txtClienteEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe todos os campos");
            } else {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
                txtIdCliente.setText(null);
                txtNomeCliente.setText(null);
                txtClienteCidade.setText(null);
                txtClienteBairro.setText(null);
                txtClienteEndereço.setText(null);
                txtClienteCEP.setText(null);
                txtClienteEmail.setText(null);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar os dados do usuário");
            System.out.println(e);
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    private void remover(){
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover o usuário?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tbUsuarios where iduser=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtIdCliente.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!");
                txtIdCliente.setText(null);
                txtNomeCliente.setText(null);
                txtClienteCidade.setText(null);
                txtClienteBairro.setText(null);
                txtClienteEndereço.setText(null);
                txtClienteCEP.setText(null);
                txtClienteEmail.setText(null);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClientes = new javax.swing.JLabel();
        lblIdClientes = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        lblClienteCidade = new javax.swing.JLabel();
        lblClienteBairro = new javax.swing.JLabel();
        txtClienteBairro = new javax.swing.JTextField();
        txtClienteCidade = new javax.swing.JTextField();
        lblClienteEnedereço = new javax.swing.JLabel();
        txtClienteEndereço = new javax.swing.JTextField();
        lblClienteCEP = new javax.swing.JLabel();
        txtClienteCEP = new javax.swing.JTextField();
        lblClienteEmail = new javax.swing.JLabel();
        txtClienteEmail = new javax.swing.JTextField();
        BtAdicionar = new javax.swing.JButton();
        BtDeletar = new javax.swing.JButton();
        BtAtualizar = new javax.swing.JButton();
        Jclientes = new javax.swing.JScrollPane();
        ListClientes = new javax.swing.JList<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClientes.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblClientes.setText("Clientes");
        getContentPane().add(lblClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 6, -1, -1));

        lblIdClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIdClientes.setText("Id:");
        getContentPane().add(lblIdClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 69, -1, -1));

        txtIdCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 66, 86, -1));

        lblNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeCliente.setText("Nome:");
        getContentPane().add(lblNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 113, -1, -1));

        txtNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });
        txtNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeClienteKeyReleased(evt);
            }
        });
        getContentPane().add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 110, 520, -1));

        lblClienteCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblClienteCidade.setText("Cidade:");
        getContentPane().add(lblClienteCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 157, -1, -1));

        lblClienteBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblClienteBairro.setText("Bairro:");
        getContentPane().add(lblClienteBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 201, -1, -1));

        txtClienteBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtClienteBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 198, 508, -1));

        txtClienteCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtClienteCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 154, 514, -1));

        lblClienteEnedereço.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblClienteEnedereço.setText("Endereço:");
        getContentPane().add(lblClienteEnedereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 239, -1, -1));

        txtClienteEndereço.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtClienteEndereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 236, 500, -1));

        lblClienteCEP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblClienteCEP.setText("Cep:");
        getContentPane().add(lblClienteCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 291, -1, -1));

        txtClienteCEP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtClienteCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 288, 172, -1));

        lblClienteEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblClienteEmail.setText("Email:");
        getContentPane().add(lblClienteEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 291, -1, -1));

        txtClienteEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtClienteEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 288, 288, -1));

        BtAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/adcionar.png"))); // NOI18N
        BtAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(BtAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 377, 59, 52));

        BtDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deletar.png"))); // NOI18N
        BtDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(BtDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 378, 56, 51));

        BtAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/atualizar.png"))); // NOI18N
        BtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BtAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 379, 56, 50));

        ListClientes.setBorder(null);
        ListClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListClientesMouseClicked(evt);
            }
        });
        Jclientes.setViewportView(ListClientes);

        getContentPane().add(Jclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 136, 520, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeClienteKeyReleased
        listar();
    }//GEN-LAST:event_txtNomeClienteKeyReleased

    private void BtAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAdicionarActionPerformed
        adicionar();
    }//GEN-LAST:event_BtAdicionarActionPerformed

    private void BtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAtualizarActionPerformed
        atualizar();
    }//GEN-LAST:event_BtAtualizarActionPerformed

    private void BtDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeletarActionPerformed
        remover();
    }//GEN-LAST:event_BtDeletarActionPerformed

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void ListClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListClientesMouseClicked
        buscar();
    }//GEN-LAST:event_ListClientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAdicionar;
    private javax.swing.JButton BtAtualizar;
    private javax.swing.JButton BtDeletar;
    private javax.swing.JScrollPane Jclientes;
    private javax.swing.JList<String> ListClientes;
    private javax.swing.JLabel lblClienteBairro;
    private javax.swing.JLabel lblClienteCEP;
    private javax.swing.JLabel lblClienteCidade;
    private javax.swing.JLabel lblClienteEmail;
    private javax.swing.JLabel lblClienteEnedereço;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblIdClientes;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JTextField txtClienteBairro;
    private javax.swing.JTextField txtClienteCEP;
    private javax.swing.JTextField txtClienteCidade;
    private javax.swing.JTextField txtClienteEmail;
    private javax.swing.JTextField txtClienteEndereço;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
