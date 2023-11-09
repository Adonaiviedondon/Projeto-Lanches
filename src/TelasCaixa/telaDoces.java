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

public class telaDoces {

	private JFrame frame;

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
		
		JButton btnVoltar_1 = new JButton("chocolate");
		btnVoltar_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1.setBounds(48, 195, 129, 27);
		frame.getContentPane().add(btnVoltar_1);
		
		JButton btnVoltar_1_1 = new JButton("morango");
		btnVoltar_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_1.setBounds(48, 226, 129, 27);
		frame.getContentPane().add(btnVoltar_1_1);
		
		JButton btnVoltar_1_2 = new JButton("cenoura");
		btnVoltar_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_2.setBounds(48, 257, 129, 27);
		frame.getContentPane().add(btnVoltar_1_2);
		
		JButton btnVoltar_1_3 = new JButton("tradicional");
		btnVoltar_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_3.setBounds(275, 195, 129, 27);
		frame.getContentPane().add(btnVoltar_1_3);
		
		JButton btnVoltar_1_1_1 = new JButton("morango");
		btnVoltar_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_1_1.setBounds(275, 226, 129, 27);
		frame.getContentPane().add(btnVoltar_1_1_1);
		
		JButton btnVoltar_1_4 = new JButton("chocolate");
		btnVoltar_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_4.setBounds(503, 195, 129, 27);
		frame.getContentPane().add(btnVoltar_1_4);
		
		JButton btnVoltar_1_1_2 = new JButton("morango");
		btnVoltar_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_1_2.setBounds(503, 226, 129, 27);
		frame.getContentPane().add(btnVoltar_1_1_2);
		
		JButton btnVoltar_1_2_2 = new JButton("banana");
		btnVoltar_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_2_2.setBounds(503, 257, 129, 27);
		frame.getContentPane().add(btnVoltar_1_2_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(179, 195, 38, 27);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(179, 226, 38, 27);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(179, 257, 38, 27);
		frame.getContentPane().add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(406, 195, 38, 27);
		frame.getContentPane().add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(406, 226, 38, 27);
		frame.getContentPane().add(spinner_4);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(634, 195, 38, 27);
		frame.getContentPane().add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(634, 226, 38, 27);
		frame.getContentPane().add(spinner_7);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(634, 257, 38, 27);
		frame.getContentPane().add(spinner_8);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Niedl\\OneDrive\\Documentos\\GitHub\\Projeto-Lanches\\imagens\\bolo.jpg"));
		lblNewLabel.setBounds(64, 51, 129, 86);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Niedl\\OneDrive\\Documentos\\GitHub\\Projeto-Lanches\\imagens\\pudim.jpg"));
		lblNewLabel_1.setBounds(296, 51, 129, 86);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Niedl\\OneDrive\\Documentos\\GitHub\\Projeto-Lanches\\imagens\\brownie.jpg"));
		lblNewLabel_2.setBounds(523, 51, 129, 86);
		frame.getContentPane().add(lblNewLabel_2);
		
		ImageIcon imagem = new ImageIcon(getClass().getResource("bolo.jpg"));
		
		frame.setBounds(100, 100, 731, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
