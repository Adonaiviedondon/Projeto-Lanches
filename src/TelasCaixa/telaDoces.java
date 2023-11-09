package TelasCaixa;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class telaDoces {

	private JFrame frame;
	private JTextField txtChocolate;
	private JTextField textField;
	private JTextField txtMorango;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtCenoura;
	private JTextField txtTradicional;
	private JTextField txtBanana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaDoces window = new telaDoces();
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
	public telaDoces() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 207, 227));
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnGsgs = new JTextPane();
		txtpnGsgs.setText("  bolo:\r\nR$ 5,00\r\n");
		txtpnGsgs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnGsgs.setEditable(false);
		txtpnGsgs.setBackground(new Color(255, 207, 227));
		txtpnGsgs.setBounds(107, 148, 50, 36);
		frame.getContentPane().add(txtpnGsgs);
		
		JTextPane txtpnCoxinhaR = new JTextPane();
		txtpnCoxinhaR.setText(" pudim:\r\nR$ 3,00\r\n");
		txtpnCoxinhaR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnCoxinhaR.setEditable(false);
		txtpnCoxinhaR.setBackground(new Color(255, 207, 227));
		txtpnCoxinhaR.setBounds(338, 148, 50, 36);
		frame.getContentPane().add(txtpnCoxinhaR);
		
		JTextPane txtpnCachorroQuenteR = new JTextPane();
		txtpnCachorroQuenteR.setText("brownie:\r\n R$ 4,00\r\n");
		txtpnCachorroQuenteR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnCachorroQuenteR.setEditable(false);
		txtpnCachorroQuenteR.setBackground(new Color(255, 207, 227));
		txtpnCachorroQuenteR.setBounds(562, 148, 55, 36);
		frame.getContentPane().add(txtpnCachorroQuenteR);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar.setBounds(10, 330, 75, 27);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnSacola = new JButton("sacola");
		btnSacola.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSacola.setBounds(630, 334, 75, 27);
		frame.getContentPane().add(btnSacola);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner.setBounds(179, 195, 38, 27);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_1.setBounds(179, 226, 38, 27);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_2.setBounds(179, 257, 38, 27);
		frame.getContentPane().add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_3.setBounds(406, 195, 38, 27);
		frame.getContentPane().add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_4.setBounds(406, 226, 38, 27);
		frame.getContentPane().add(spinner_4);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_6.setBounds(634, 195, 38, 27);
		frame.getContentPane().add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_7.setBounds(634, 226, 38, 27);
		frame.getContentPane().add(spinner_7);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_8.setBounds(634, 257, 38, 27);
		frame.getContentPane().add(spinner_8);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Niedl\\OneDrive\\Documentos\\GitHub\\Projeto-Lanches\\imagens\\bolo.jpg"));
		lblNewLabel.setBounds(64, 51, 129, 86);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Niedl\\OneDrive\\Documentos\\GitHub\\Projeto-Lanches\\imagens\\pudim.jpg"));
		lblNewLabel_1.setBounds(296, 51, 129, 86);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Niedl\\OneDrive\\Documentos\\GitHub\\Projeto-Lanches\\imagens\\brownie.jpg"));
		lblNewLabel_2.setBounds(523, 51, 129, 86);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtChocolate = new JTextField();
		txtChocolate.setText("chocolate");
		txtChocolate.setHorizontalAlignment(SwingConstants.CENTER);
		txtChocolate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtChocolate.setEditable(false);
		txtChocolate.setColumns(10);
		txtChocolate.setBounds(48, 195, 129, 27);
		frame.getContentPane().add(txtChocolate);
		
		textField = new JTextField();
		textField.setText("chocolate");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(503, 195, 129, 27);
		frame.getContentPane().add(textField);
		
		txtMorango = new JTextField();
		txtMorango.setText("morango");
		txtMorango.setHorizontalAlignment(SwingConstants.CENTER);
		txtMorango.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMorango.setEditable(false);
		txtMorango.setColumns(10);
		txtMorango.setBounds(275, 226, 129, 27);
		frame.getContentPane().add(txtMorango);
		
		textField_1 = new JTextField();
		textField_1.setText("morango");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(503, 226, 129, 27);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("morango");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(48, 226, 129, 27);
		frame.getContentPane().add(textField_2);
		
		txtCenoura = new JTextField();
		txtCenoura.setText("cenoura");
		txtCenoura.setHorizontalAlignment(SwingConstants.CENTER);
		txtCenoura.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCenoura.setEditable(false);
		txtCenoura.setColumns(10);
		txtCenoura.setBounds(48, 257, 129, 27);
		frame.getContentPane().add(txtCenoura);
		
		txtTradicional = new JTextField();
		txtTradicional.setText("tradicional");
		txtTradicional.setHorizontalAlignment(SwingConstants.CENTER);
		txtTradicional.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTradicional.setEditable(false);
		txtTradicional.setColumns(10);
		txtTradicional.setBounds(275, 195, 129, 27);
		frame.getContentPane().add(txtTradicional);
		
		txtBanana = new JTextField();
		txtBanana.setText("banana");
		txtBanana.setHorizontalAlignment(SwingConstants.CENTER);
		txtBanana.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtBanana.setEditable(false);
		txtBanana.setColumns(10);
		txtBanana.setBounds(503, 257, 129, 27);
		frame.getContentPane().add(txtBanana);
		
		frame.setBounds(100, 100, 731, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
