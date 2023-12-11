/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Telas;

import ConexaoDB.ModuloConexao;
import Formatacao.FormatTft;
import java.awt.HeadlessException;

import java.sql.*;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author tyago
 */
public class TelaClientes extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaClientes() {
        initComponents();
        txtNome.setDocument(new FormatTft(50, FormatTft.TipoEntrada.NOME));
        txtCidade.setDocument(new FormatTft(50, FormatTft.TipoEntrada.NOME));
        txtBairro.setDocument(new FormatTft(50, FormatTft.TipoEntrada.NOME));
        txtEndereço.setDocument(new FormatTft(50, FormatTft.TipoEntrada.NOME));
        txtEmail.setDocument(new FormatTft(50, FormatTft.TipoEntrada.EMAIL));
        conexao = ModuloConexao.conector();
    }

    private void listar() {
        DefaultListModel<String> list = new DefaultListModel<>();
        listNomes.setModel(list);
        String readLista = "select * from tbClientes where nomeCliente like '" + txtNome.getText() + "%'" + "order by nomeCliente";
        try {
            conexao = ModuloConexao.conector();
            pst = conexao.prepareStatement(readLista);
            rs = pst.executeQuery();
            while (rs.next()) {
                JNomes.setVisible(true);
                list.addElement(rs.getString(2));
                if (txtNome.getText().isEmpty()) {
                    JNomes.setVisible(false);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
    }

    private void buscar() {
        int busca = listNomes.getSelectedIndex();
        if (busca >= 0) {
            String buscaNome = "select * from tbClientes where nomeCliente like '" + txtNome.getText() + "%'" + "order by nomeCliente";
            try {
                conexao = ModuloConexao.conector();
                pst = conexao.prepareStatement(buscaNome);
                rs = pst.executeQuery();
                while (rs.next()) {
                    JNomes.setVisible(false);
                    idCliente.setText(rs.getString(1));
                    txtNome.setText(rs.getString(2));
                    txtCidade.setText(rs.getString(3));
                    txtBairro.setText(rs.getString(4));
                    txtEndereço.setText(rs.getString(5));
                    txtNum.setText(rs.getString(6));
                    jFormattedCep.setText(rs.getString(7));
                    txtEmail.setText(rs.getString(8));
                    jFormattedFone.setText(rs.getString(9));
                    btAdicionar.setEnabled(false);
                }

            } catch (SQLException e) {
                System.out.println(e);
            }
        } else {
            JNomes.setVisible(false);
        }
    }

    private void adicionar() {
        String sql = "insert into tbClientes(nomeCliente,cidadeCliente,bairroCliente,endCliente,numCliente,cepCliente,emailCLiente,foneCliente) values(?,?,?,?,?,?,?,?)";
        try {
            conexao = ModuloConexao.conector();
            pst = conexao.prepareStatement(sql);
            //pst.setString(1,txtIdUsuario.getText());
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtCidade.getText());
            pst.setString(3, txtBairro.getText());
            pst.setString(4, txtEndereço.getText());
            pst.setString(5, txtNum.getText());
            pst.setString(6, jFormattedCep.getText());
            pst.setString(7, txtEmail.getText());
            pst.setString(8, jFormattedFone.getText());
            if (txtNome.getText().isEmpty() || txtCidade.getText().isEmpty() || txtBairro.getText().isEmpty() || txtEndereço.getText().isEmpty() || txtNum.getText().isEmpty() || jFormattedCep.getText().isEmpty() || txtEmail.getText().isEmpty() || jFormattedFone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe todos os campos");

            } else {

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso");
                txtNome.setText(null);
                txtCidade.setText(null);
                txtBairro.setText(null);
                txtEndereço.setText(null);
                txtNum.setText(null);
                jFormattedCep.setText(null);
                txtEmail.setText(null);
                jFormattedFone.setText(null);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o usuário");
            System.out.println(ex);

        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }

    private void atualizar() {
        String sql = "update tbClientes set nomeCliente = ?, cidadeCliente = ?, bairroCliente = ?, endCliente = ?, cepCliente = ?, emailCLiente = ?,foneCliente = ? where idCliente = ? ";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtCidade.getText());
            pst.setString(3, txtBairro.getText());
            pst.setString(4, txtEndereço.getText());
            pst.setString(5, txtNum.getText());
            pst.setString(6, jFormattedCep.getText());
            pst.setString(7, txtEmail.getText());
            pst.setString(8, jFormattedFone.getText());
            if (txtNome.getText().isEmpty() || txtCidade.getText().isEmpty() || txtBairro.getText().isEmpty() || txtEndereço.getText().isEmpty() || txtNum.getText().isEmpty() || jFormattedCep.getText().isEmpty() || txtEmail.getText().isEmpty() || jFormattedFone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe todos os campos");
            } else {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
                txtNome.setText(null);
                txtCidade.setText(null);
                txtBairro.setText(null);
                txtEndereço.setText(null);
                txtNum.setText(null);
                jFormattedCep.setText(null);
                txtEmail.setText(null);
                jFormattedFone.setText(null);
            }

        } catch (HeadlessException | SQLException e) {
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

    private void remover() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover o usuário?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tbClientes where idCliente=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, idCliente.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!");
                idCliente.setText(null);
                txtNome.setText(null);
                txtCidade.setText(null);
                txtBairro.setText(null);
                txtEndereço.setText(null);
                txtNum.setText(null);
                jFormattedCep.setText(null);
                txtEmail.setText(null);
                jFormattedFone.setText(null);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jnomeCliente = new javax.swing.JLabel();
        jBairro = new javax.swing.JLabel();
        jCidade = new javax.swing.JLabel();
        jendereço = new javax.swing.JLabel();
        jCep = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();
        txtBairro = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEndereço = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        JNomes = new javax.swing.JScrollPane();
        listNomes = new javax.swing.JList<>();
        jFormattedCep = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedFone = new javax.swing.JFormattedTextField();
        idCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jNumero = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Clientes");
        setPreferredSize(new java.awt.Dimension(640, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jnomeCliente.setText("Nome:");
        getContentPane().add(jnomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 85, -1, -1));

        jBairro.setText("Bairro:");
        getContentPane().add(jBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 251, -1, -1));

        jCidade.setText("Cidade:");
        getContentPane().add(jCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 253, -1, -1));

        jendereço.setText("Endereço:");
        getContentPane().add(jendereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 290, -1, -1));

        jCep.setText("CEP:");
        getContentPane().add(jCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 211, -1, -1));

        jEmail.setText("Email:");
        getContentPane().add(jEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 323, -1, -1));

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/atualizar.png"))); // NOI18N
        btAtualizar.setPreferredSize(new java.awt.Dimension(60, 60));
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 379, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deletar.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 379, -1, -1));

        btAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/adcionar.png"))); // NOI18N
        btAdicionar.setPreferredSize(new java.awt.Dimension(60, 60));
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 379, -1, -1));

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        getContentPane().add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 248, 266, -1));

        txtNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 80, 492, -1));
        getContentPane().add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 250, 162, -1));
        getContentPane().add(txtEndereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 287, 276, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 320, 276, -1));

        JNomes.setBorder(null);

        listNomes.setBorder(null);
        listNomes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listNomesMouseClicked(evt);
            }
        });
        JNomes.setViewportView(listNomes);

        JNomes.setVisible(false);

        getContentPane().add(JNomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 100, 492, 70));

        try {
            jFormattedCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 208, 94, -1));

        jLabel7.setText("Fone:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 325, -1, -1));

        try {
            jFormattedFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 322, 94, -1));

        idCliente.setEnabled(false);
        getContentPane().add(idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 73, -1));

        jLabel8.setText("Id:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jNumero.setText("N°");
        getContentPane().add(jNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 292, -1, -1));
        getContentPane().add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 289, 133, -1));

        setBounds(0, 0, 640, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        remover();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        listar();
    }//GEN-LAST:event_txtNomeKeyReleased

    private void listNomesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listNomesMouseClicked
        buscar();
    }//GEN-LAST:event_listNomesMouseClicked

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        adicionar();
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        atualizar();
    }//GEN-LAST:event_btAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JNomes;
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAtualizar;
    public javax.swing.JTextField idCliente;
    private javax.swing.JLabel jBairro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jCep;
    private javax.swing.JLabel jCidade;
    private javax.swing.JLabel jEmail;
    private javax.swing.JFormattedTextField jFormattedCep;
    private javax.swing.JFormattedTextField jFormattedFone;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JLabel jNumero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jendereço;
    private javax.swing.JLabel jnomeCliente;
    private javax.swing.JList<String> listNomes;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereço;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
