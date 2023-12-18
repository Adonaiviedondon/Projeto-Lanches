/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Telas;

import ConexaoDB.ModuloConexao;
import Formatacao.FormatTft;
import com.mysql.cj.jdbc.Blob;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author tyago
 */
public class TelaCadastroProdutos extends javax.swing.JInternalFrame {

    private String imagem;
    private boolean fotoCarregada = false;

    public TelaCadastroProdutos() {
        initComponents();
        txtLanche.setDocument(new FormatTft(50, FormatTft.TipoEntrada.NOME));
    }
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    private FileInputStream fis;
    private int tamanho;

    private void carregarFoto() {
        JFileChooser jfoto = new JFileChooser();
        jfoto.setDialogTitle("Selecionar arquivo");
        jfoto.setFileFilter(new FileNameExtensionFilter("Arquivo de imagens(*.PNG, *.JGP,*.JPEG", "png", "jpg", "jpeg"));
        int resultado = jfoto.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(jfoto.getSelectedFile());
                tamanho = (int) jfoto.getSelectedFile().length();
                Image foto = ImageIO.read(jfoto.getSelectedFile()).getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
                lblFoto.setIcon(new ImageIcon(foto));
                lblFoto.updateUI();

            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }

    private void listar() {
        DefaultListModel<String> list = new DefaultListModel<>();
        listNomes.setModel(list);
        String readLista = "select * from tbProduto where nomeLanche like '" + txtLanche.getText() + "%'" + "order by nomeLanche";
        try {
            conexao = ModuloConexao.conector();
            pst = conexao.prepareStatement(readLista);
            rs = pst.executeQuery();
            while (rs.next()) {
                JNomes.setVisible(true);
                list.addElement(rs.getString(2));
                if (txtLanche.getText().isEmpty()) {
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
            String buscaNome = "select * from tbProduto where nomeLanche like '" + txtLanche.getText() + "%'" + "order by nomeLanche";
            try {
                conexao = ModuloConexao.conector();
                pst = conexao.prepareStatement(buscaNome);
                rs = pst.executeQuery();
                while (rs.next()) {
                    JNomes.setVisible(false);
                    IdProduto.setText(rs.getString(1));
                    txtLanche.setText(rs.getString(2));
                    txtDesc.setText(rs.getString(3));
                    txtValor.setText(rs.getString(4));
                    Blob blob = (Blob) rs.getBlob(5);
                    byte[] img = blob.getBytes(1, (int) blob.length());
                    BufferedImage imagem = null;
                    try {
                        imagem = ImageIO.read(new ByteArrayInputStream(img));
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    ImageIcon icone = new ImageIcon(imagem);
                    Icon foto = new ImageIcon(icone.getImage().getScaledInstance(lblFoto.getWidth(),
                            lblFoto.getHeight(), Image.SCALE_SMOOTH));
                    lblFoto.setIcon(foto);
                    lblFoto.updateUI();
                    fotoCarregada = true;

                    btnAdicionar.setEnabled(false);
                }

            } catch (SQLException e) {
                System.out.println(e);
            }

        } else {
            JNomes.setVisible(false);
        }
    }

    private void adicionar() {
        String insert = "insert into tbProduto(nomeLanche,descLanche,valorLanche,foto) values(?,?,?,?)";
        try {
            conexao = ModuloConexao.conector();
            pst = conexao.prepareStatement(insert);
            //pst.setString(1,txtIdUsuario.getText());
            pst.setString(1, txtLanche.getText());
            pst.setString(2, txtDesc.getText());
            pst.setString(3, txtValor.getText());
            pst.setBlob(4, fis, tamanho);

            if (txtLanche.getText().isEmpty() || txtValor.getText().isEmpty() || txtDesc.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe todos os campos");

            } else {

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cadsatro realizado!");

            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar!");
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
        if (fotoCarregada = true) {
        
            String sql = "update tbProduto set nomeLanche = ?, descLanche = ?, valorLanche = ?, foto = ? where idProduto =? ";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtLanche.getText());
                pst.setString(2, txtDesc.getText());
                pst.setString(3, txtValor.getText());
                pst.setBlob(4, fis, tamanho);

                if (txtLanche.getText().isEmpty() || txtValor.getText().isEmpty() || txtDesc.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Informe todos os campos");
                } else {
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");

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
            
        
    }
    

    private void remover() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tbProduto where idProduto=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, IdProduto.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }

    private void limpar() {
        txtLanche.setText(null);
        txtValor.setText(null);
        txtDesc.setText(null);
        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/camera.png")));
        txtLanche.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IdProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLanche = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCarregar = new javax.swing.JButton();
        JNomes = new javax.swing.JScrollPane();
        listNomes = new javax.swing.JList<>();
        lblFoto = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro Produto");
        setPreferredSize(new java.awt.Dimension(640, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Id:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 34, 23, -1));

        IdProduto.setEnabled(false);
        getContentPane().add(IdProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 31, 74, -1));

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 34, -1, -1));

        txtLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLancheActionPerformed(evt);
            }
        });
        txtLanche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLancheKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLancheKeyReleased(evt);
            }
        });
        getContentPane().add(txtLanche, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 31, 395, -1));

        jLabel3.setText("Valor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        try {
            txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 74, -1));

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 174, -1, 119));

        jLabel4.setText("Descrição:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 174, -1, -1));

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/adcionar.png"))); // NOI18N
        btnAdicionar.setToolTipText("Adicionar");
        btnAdicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionar.setMaximumSize(new java.awt.Dimension(70, 70));
        btnAdicionar.setMinimumSize(new java.awt.Dimension(70, 70));
        btnAdicionar.setPreferredSize(new java.awt.Dimension(70, 70));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 381, -1, -1));

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/atualizar.png"))); // NOI18N
        btnAtualizar.setToolTipText("Atulaizar");
        btnAtualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizar.setMaximumSize(new java.awt.Dimension(70, 70));
        btnAtualizar.setMinimumSize(new java.awt.Dimension(70, 70));
        btnAtualizar.setPreferredSize(new java.awt.Dimension(70, 70));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 381, -1, -1));

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deletar.png"))); // NOI18N
        btnDeletar.setToolTipText("Deletar");
        btnDeletar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar.setMaximumSize(new java.awt.Dimension(70, 70));
        btnDeletar.setMinimumSize(new java.awt.Dimension(70, 70));
        btnDeletar.setPreferredSize(new java.awt.Dimension(70, 70));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 381, -1, -1));

        btnCarregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCarregar.setForeground(new java.awt.Color(102, 102, 255));
        btnCarregar.setText("Carregar foto");
        btnCarregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCarregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 217, -1, -1));

        JNomes.setBorder(null);

        listNomes.setBorder(null);
        listNomes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listNomesMouseClicked(evt);
            }
        });
        JNomes.setViewportView(listNomes);

        JNomes.setVisible(false);

        getContentPane().add(JNomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 395, 100));

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/camera.png"))); // NOI18N
        lblFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblFoto.setMaximumSize(new java.awt.Dimension(128, 128));
        lblFoto.setMinimumSize(new java.awt.Dimension(128, 128));
        lblFoto.setPreferredSize(new java.awt.Dimension(128, 128));
        getContentPane().add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 165, -1, -1));

        setBounds(0, 0, 640, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizar();
        limpar();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        carregarFoto();
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        adicionar();
        limpar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLancheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLancheActionPerformed

    private void txtLancheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLancheKeyReleased
        listar();
    }//GEN-LAST:event_txtLancheKeyReleased

    private void listNomesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listNomesMouseClicked
        buscar();
    }//GEN-LAST:event_listNomesMouseClicked

    private void txtLancheKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLancheKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JNomes.setVisible(false);

        }
    }//GEN-LAST:event_txtLancheKeyPressed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        remover();
        limpar();
    }//GEN-LAST:event_btnDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdProduto;
    private javax.swing.JScrollPane JNomes;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JList<String> listNomes;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtLanche;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
