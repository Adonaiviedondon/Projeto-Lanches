package TelasAdm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.Box;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministradorTelaGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministradorTelaGUI window = new AdministradorTelaGUI();
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
	public AdministradorTelaGUI() {
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
		
		JLabel lblNewLabel = new JLabel("JAVAX LANCHES");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setBounds(53, 11, 466, 72);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ADMIN:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 119, 95, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(343, 145, 95, 130);
		frame.getContentPane().add(verticalBox);
		
		JButton btnNewButton = new JButton("Cadastro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new cadastroFuncionario().frame.setVisible(true); ///abrir tela de cadastro
			}
		});
		verticalBox.add(btnNewButton);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_1);
		
		JButton btnNewButton_1 = new JButton("Estoque");
		
		verticalBox.add(btnNewButton_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		JButton btnNewButton_2 = new JButton("Financeiro");
		verticalBox.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 164, 172, 144);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("informações do admin");
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("Logoff");
		btnNewButton_3.setBounds(349, 315, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
