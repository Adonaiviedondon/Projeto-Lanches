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

public class telaBebidas {

	private JFrame frame;
	private JTextField txtLaranja;
	private JTextField txtMaracuj;
	private JTextField txtAcerola;
	private JTextField txtCocacola;
	private JTextField txtFanta;
	private JTextField txtGuaran;
	private JTextField txtSprite;
	private JTextField txtChocolate;
	private JTextField txtMorango;
	private JTextField txtDoceDeLeite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaBebidas window = new telaBebidas();
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
	public telaBebidas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 176, 168));
		frame.setBounds(100, 100, 731, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnGsgs = new JTextPane();
		txtpnGsgs.setText("  suco:\r\nR$ 3,00\r\n");
		txtpnGsgs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnGsgs.setEditable(false);
		txtpnGsgs.setBackground(new Color(255, 176, 168));
		txtpnGsgs.setBounds(107, 148, 50, 36);
		frame.getContentPane().add(txtpnGsgs);
		
		JTextPane txtpnCoxinhaR = new JTextPane();
		txtpnCoxinhaR.setText("refrigerante:\r\n   R$ 6,00\r\n");
		txtpnCoxinhaR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnCoxinhaR.setEditable(false);
		txtpnCoxinhaR.setBackground(new Color(255, 176, 168));
		txtpnCoxinhaR.setBounds(324, 148, 75, 36);
		frame.getContentPane().add(txtpnCoxinhaR);
		
		JTextPane txtpnCachorroQuenteR = new JTextPane();
		txtpnCachorroQuenteR.setText("milkshake:\r\n  R$ 12,00\r\n");
		txtpnCachorroQuenteR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnCachorroQuenteR.setEditable(false);
		txtpnCachorroQuenteR.setBackground(new Color(255, 176, 168));
		txtpnCachorroQuenteR.setBounds(557, 148, 65, 36);
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Niedl\\OneDrive\\Documentos\\GitHub\\Projeto-Lanches\\imagens\\suco.jpg"));
		lblNewLabel.setBounds(64, 51, 129, 86);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Niedl\\OneDrive\\Documentos\\GitHub\\Projeto-Lanches\\imagens\\refri.jpg"));
		lblNewLabel_1.setBounds(296, 51, 129, 86);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Niedl\\OneDrive\\Documentos\\GitHub\\Projeto-Lanches\\imagens\\milkshake.jpg"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(523, 51, 129, 86);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtLaranja = new JTextField();
		txtLaranja.setEditable(false);
		txtLaranja.setHorizontalAlignment(SwingConstants.CENTER);
		txtLaranja.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLaranja.setText("laranja");
		txtLaranja.setBounds(48, 195, 129, 27);
		frame.getContentPane().add(txtLaranja);
		txtLaranja.setColumns(10);
		
		txtMaracuj = new JTextField();
		txtMaracuj.setEditable(false);
		txtMaracuj.setText("maracujá");
		txtMaracuj.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaracuj.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMaracuj.setColumns(10);
		txtMaracuj.setBounds(48, 226, 129, 27);
		frame.getContentPane().add(txtMaracuj);
		
		txtAcerola = new JTextField();
		txtAcerola.setEditable(false);
		txtAcerola.setText("acerola");
		txtAcerola.setHorizontalAlignment(SwingConstants.CENTER);
		txtAcerola.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAcerola.setColumns(10);
		txtAcerola.setBounds(48, 257, 129, 27);
		frame.getContentPane().add(txtAcerola);
		
		txtCocacola = new JTextField();
		txtCocacola.setEditable(false);
		txtCocacola.setText("coca-cola");
		txtCocacola.setHorizontalAlignment(SwingConstants.CENTER);
		txtCocacola.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCocacola.setColumns(10);
		txtCocacola.setBounds(275, 195, 129, 27);
		frame.getContentPane().add(txtCocacola);
		
		txtFanta = new JTextField();
		txtFanta.setEditable(false);
		txtFanta.setText("fanta");
		txtFanta.setHorizontalAlignment(SwingConstants.CENTER);
		txtFanta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFanta.setColumns(10);
		txtFanta.setBounds(275, 226, 129, 27);
		frame.getContentPane().add(txtFanta);
		
		txtGuaran = new JTextField();
		txtGuaran.setText("guaraná");
		txtGuaran.setHorizontalAlignment(SwingConstants.CENTER);
		txtGuaran.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtGuaran.setEditable(false);
		txtGuaran.setColumns(10);
		txtGuaran.setBounds(275, 257, 129, 27);
		frame.getContentPane().add(txtGuaran);
		
		txtSprite = new JTextField();
		txtSprite.setText("sprite");
		txtSprite.setHorizontalAlignment(SwingConstants.CENTER);
		txtSprite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSprite.setEditable(false);
		txtSprite.setColumns(10);
		txtSprite.setBounds(275, 287, 129, 27);
		frame.getContentPane().add(txtSprite);
		
		txtChocolate = new JTextField();
		txtChocolate.setText("chocolate");
		txtChocolate.setHorizontalAlignment(SwingConstants.CENTER);
		txtChocolate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtChocolate.setEditable(false);
		txtChocolate.setColumns(10);
		txtChocolate.setBounds(503, 195, 129, 27);
		frame.getContentPane().add(txtChocolate);
		
		txtMorango = new JTextField();
		txtMorango.setText("morango");
		txtMorango.setHorizontalAlignment(SwingConstants.CENTER);
		txtMorango.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMorango.setEditable(false);
		txtMorango.setColumns(10);
		txtMorango.setBounds(503, 226, 129, 27);
		frame.getContentPane().add(txtMorango);
		
		txtDoceDeLeite = new JTextField();
		txtDoceDeLeite.setText("doce de leite");
		txtDoceDeLeite.setHorizontalAlignment(SwingConstants.CENTER);
		txtDoceDeLeite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDoceDeLeite.setEditable(false);
		txtDoceDeLeite.setColumns(10);
		txtDoceDeLeite.setBounds(503, 257, 129, 27);
		frame.getContentPane().add(txtDoceDeLeite);
	}
}
