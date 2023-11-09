package TelasAdm;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministradorTela {

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
					AdministradorTela window = new AdministradorTela();
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
	public AdministradorTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 241, 219));
		frame.setBounds(100, 100, 731, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Entrar");
		btnLogin.setBounds(221, 298, 144, 39);
		frame.getContentPane().add(btnLogin);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(487, 298, 144, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("JAVAX LANCHES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setBounds(10, 11, 695, 72);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(45, 111, 222, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(45, 146, 320, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(45, 196, 208, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(45, 231, 320, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		 btnLogin.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String username = textField.getText();
	                String senha = textField_1.getText();

	                if (username.isEmpty() || senha.isEmpty()) {
	                    JOptionPane.showMessageDialog(frame, "Existe campos vazios.");
	                } else if (validarCredenciais(username, senha)) {
	                    JOptionPane.showMessageDialog(frame, "Login bem-sucedido!");
	                    
	                } else {
	                    JOptionPane.showMessageDialog(frame, "nome de usuario ou senha incorretos");
	                }

	               
	                textField_1.setText("");
	            }
	        });
	    }

	    private boolean validarCredenciais(String username, String senha) {
	        return username.equals(NomeUsuarioCorreto) && senha.equals(LoginCorreto);
	    }
	
		
		
	}
