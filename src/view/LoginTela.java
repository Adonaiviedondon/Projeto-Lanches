package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginTela {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	private static final String NomeUsuarioCorreto = "admin";
	private static final String LoginCorreto = "12345";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginTela window = new LoginTela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(113, 298, 144, 39);
		frame.getContentPane().add(btnLogin);

		JButton btnNewButton_1 = new JButton("Cadastro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(321, 298, 144, 39);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("JAVAX LANCHES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setBounds(53, 11, 466, 72);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nome de Usuário(Username):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(24, 94, 222, 24);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(24, 129, 320, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Senha(Password):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(24, 186, 208, 24);
		frame.getContentPane().add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(24, 231, 320, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel mensagemtxt = new JLabel("");
		mensagemtxt.setBounds(24, 260, 441, 24);
		frame.getContentPane().add(mensagemtxt);

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String senha = textField_1.getText();

				if (username.isEmpty() || senha.isEmpty()) {
					mensagemtxt.setText("há campos vazios preencha todos por favor");
				} else if (validarCredenciais(username, senha)) {
					TipoUsuario tipoUsuario = new TipoUsuario();
					TipoUsuario.setVisible(true);

				} else {
					mensagemtxt.setText("login ou usuario incorretos preencha novamente");
				}

				
			}
		});
	}

	private boolean validarCredenciais(String username, String senha) {
		return username.equals(NomeUsuarioCorreto) && senha.equals(LoginCorreto);
	}

}
