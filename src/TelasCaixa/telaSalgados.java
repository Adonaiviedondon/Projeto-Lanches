package TelasCaixa;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;

public class telaSalgados {

	private JFrame frame;
	private JTextField txtFrango;
	private JTextField txtQueijos;
	private JTextField txtPresunto;
	private JTextField txtFrango_1;
	private JTextField txtCatupiry;
	private JTextField txtCreamCheese;
	private JTextField txtCharque;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtCalabresa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaSalgados window = new telaSalgados();
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
	public telaSalgados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(253, 191, 143));
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnGsgs = new JTextPane();
		txtpnGsgs.setText("sanduíche:\r\n  R$ 5,00\r\n");
		txtpnGsgs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnGsgs.setEditable(false);
		txtpnGsgs.setBackground(new Color(253, 191, 143));
		txtpnGsgs.setBounds(100, 148, 65, 36);
		frame.getContentPane().add(txtpnGsgs);
		
		JTextPane txtpnCoxinhaR = new JTextPane();
		txtpnCoxinhaR.setText("coxinha:\r\nR$ 4,00\r\n");
		txtpnCoxinhaR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnCoxinhaR.setEditable(false);
		txtpnCoxinhaR.setBackground(new Color(253, 191, 143));
		txtpnCoxinhaR.setBounds(335, 148, 54, 36);
		frame.getContentPane().add(txtpnCoxinhaR);
		
		JTextPane txtpnCachorroQuenteR = new JTextPane();
		txtpnCachorroQuenteR.setText("cachorro quente:\r\n       R$ 6,00\r\n");
		txtpnCachorroQuenteR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnCachorroQuenteR.setEditable(false);
		txtpnCachorroQuenteR.setBackground(new Color(253, 191, 143));
		txtpnCachorroQuenteR.setBounds(545, 148, 102, 36);
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
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_5.setBounds(406, 257, 38, 27);
		frame.getContentPane().add(spinner_5);
		
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
		
		JSpinner spinner_5_1 = new JSpinner();
		spinner_5_1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_5_1.setBounds(406, 287, 38, 27);
		frame.getContentPane().add(spinner_5_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Niedl\\OneDrive\\Documentos\\GitHub\\Projeto-Lanches\\imagens\\sanduiche.jpg"));
		lblNewLabel.setBounds(64, 51, 129, 86);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Niedl\\OneDrive\\Documentos\\GitHub\\Projeto-Lanches\\imagens\\coxinha.jpg"));
		lblNewLabel_1.setBounds(296, 51, 129, 86);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Niedl\\OneDrive\\Documentos\\GitHub\\Projeto-Lanches\\imagens\\cachorro.jpg"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(523, 51, 129, 86);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtFrango = new JTextField();
		txtFrango.setText("frango");
		txtFrango.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrango.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFrango.setEditable(false);
		txtFrango.setColumns(10);
		txtFrango.setBounds(48, 226, 129, 27);
		frame.getContentPane().add(txtFrango);
		
		txtQueijos = new JTextField();
		txtQueijos.setText("4 queijos");
		txtQueijos.setHorizontalAlignment(SwingConstants.CENTER);
		txtQueijos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtQueijos.setEditable(false);
		txtQueijos.setColumns(10);
		txtQueijos.setBounds(48, 195, 129, 27);
		frame.getContentPane().add(txtQueijos);
		
		txtPresunto = new JTextField();
		txtPresunto.setText("presunto");
		txtPresunto.setHorizontalAlignment(SwingConstants.CENTER);
		txtPresunto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPresunto.setEditable(false);
		txtPresunto.setColumns(10);
		txtPresunto.setBounds(48, 257, 129, 27);
		frame.getContentPane().add(txtPresunto);
		
		txtFrango_1 = new JTextField();
		txtFrango_1.setText("frango");
		txtFrango_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrango_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFrango_1.setEditable(false);
		txtFrango_1.setColumns(10);
		txtFrango_1.setBounds(275, 195, 129, 27);
		frame.getContentPane().add(txtFrango_1);
		
		txtCatupiry = new JTextField();
		txtCatupiry.setText("catupiry");
		txtCatupiry.setHorizontalAlignment(SwingConstants.CENTER);
		txtCatupiry.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCatupiry.setEditable(false);
		txtCatupiry.setColumns(10);
		txtCatupiry.setBounds(275, 226, 129, 27);
		frame.getContentPane().add(txtCatupiry);
		
		txtCreamCheese = new JTextField();
		txtCreamCheese.setText("cream cheese");
		txtCreamCheese.setHorizontalAlignment(SwingConstants.CENTER);
		txtCreamCheese.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCreamCheese.setEditable(false);
		txtCreamCheese.setColumns(10);
		txtCreamCheese.setBounds(275, 257, 129, 27);
		frame.getContentPane().add(txtCreamCheese);
		
		txtCharque = new JTextField();
		txtCharque.setText("charque");
		txtCharque.setHorizontalAlignment(SwingConstants.CENTER);
		txtCharque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCharque.setEditable(false);
		txtCharque.setColumns(10);
		txtCharque.setBounds(275, 287, 129, 27);
		frame.getContentPane().add(txtCharque);
		
		textField = new JTextField();
		textField.setText("frango");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(503, 195, 129, 27);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("charque");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(503, 257, 129, 27);
		frame.getContentPane().add(textField_1);
		
		txtCalabresa = new JTextField();
		txtCalabresa.setText("calabresa");
		txtCalabresa.setHorizontalAlignment(SwingConstants.CENTER);
		txtCalabresa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCalabresa.setEditable(false);
		txtCalabresa.setColumns(10);
		txtCalabresa.setBounds(503, 226, 129, 27);
		frame.getContentPane().add(txtCalabresa);
		frame.setBounds(100, 100, 731, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
