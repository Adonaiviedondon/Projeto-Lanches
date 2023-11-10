package TelasCaixa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class digiteSeuNome {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					digiteSeuNome window = new digiteSeuNome();
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
	public digiteSeuNome() {
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
		
		textField = new JTextField();
		textField.setBounds(119, 169, 471, 51);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnDigiteSeuNome = new JTextPane();
		txtpnDigiteSeuNome.setEditable(false);
		txtpnDigiteSeuNome.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtpnDigiteSeuNome.setBackground(new Color(255, 241, 219));
		txtpnDigiteSeuNome.setText("Digite seu nome");
		txtpnDigiteSeuNome.setBounds(216, 73, 294, 55);
		frame.getContentPane().add(txtpnDigiteSeuNome);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(302, 262, 101, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cancelar pedido");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(486, 260, 153, 34);
		frame.getContentPane().add(btnNewButton_1);
	}
}
