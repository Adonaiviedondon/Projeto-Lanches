package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JTextField;

public class CadastroTela {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroTela window = new CadastroTela();
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
	public CadastroTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JAVAX LANCHES");
		lblNewLabel.setBounds(53, 11, 466, 72);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Código do Funcionário:");
		lblNewLabel_1.setBounds(20, 81, 218, 33);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(243, 88, 293, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Salário do Funcionário:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(20, 140, 218, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(243, 140, 293, 27);
		frame.getContentPane().add(textField_1);
		
		lblNewLabel_3 = new JLabel("Nome do Funcionário:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(20, 202, 198, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(243, 201, 293, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
