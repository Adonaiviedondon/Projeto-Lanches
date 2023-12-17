/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import ConexaoDB.ModuloConexao;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ConexaoDB.ModuloConexao;
/**
 *
 * @author adonai
 */
public class Autenticacao {
    public boolean autenticar(String usuario, String senha) {
        String sql = "select * from tbUsuarios where Login =? and Senha=?";
        try (java.sql.Connection conexao = ModuloConexao.conector();
             java.sql.PreparedStatement pst = conexao.prepareStatement(sql)) {

            pst.setString(1, usuario);
            pst.setString(2, senha);

            try (ResultSet rs = pst.executeQuery()) {
                return rs.next();
                
            }
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}
