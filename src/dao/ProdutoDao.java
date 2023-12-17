/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConexaoDB.ModuloConexao;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author tyago
 */
public class ProdutoDao {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     *
     * @return
     */
    public List<Produto> read() {
        
        conexao = ModuloConexao.conector();
        List<Produto> produtos = new ArrayList<>();
        try {
            
            pst = conexao.prepareStatement("SELECT * FROM tbProduto");
            rs = pst.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();
                produto.setIdProduto(rs.getString("id"));
                produto.setNomeProduto(rs.getString("nome"));
                produto.setDescProduto(rs.getString("descrição"));
                produto.setValorProduto(rs.getString("preço"));
                produto.setImgProduto(rs.getInt("foto"));
                produtos.add(produto);

            }

        } catch (Exception e) {
        }
        return null;

    }

}
