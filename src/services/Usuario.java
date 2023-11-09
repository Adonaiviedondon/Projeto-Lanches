package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import Telas.TelaPrincipal;

public class Usuario {
	Connection conexao = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	public void logar(String usario, String senha) {
		String sql = "select * from tbUsuarios where Login =? and Senha=?";
		try {
			pst = conexao.prepareStatement(sql);
			pst.setString(1, usario);
			pst.setString(2, senha);
			rs = pst.executeQuery();
			if(rs.next()){
				TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
                this.dispose();
			}else {
				JOptionPane.showMessageDialog(null, "Usuário ou senha inválido");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco");
		}	
	}
}
