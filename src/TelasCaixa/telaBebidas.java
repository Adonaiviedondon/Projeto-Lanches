package TelasCaixa;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class telaBebidas {

	private JFrame frame;

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
		
		JPanel panel = new JPanel();
		panel.setBounds(68, 37, 129, 111);
		frame.getContentPane().add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(295, 37, 129, 111);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(524, 37, 129, 111);
		frame.getContentPane().add(panel_1_1_1);
		
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
		
		JButton btnVoltar_1 = new JButton("laranja");
		btnVoltar_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1.setBounds(48, 195, 129, 27);
		frame.getContentPane().add(btnVoltar_1);
		
		JButton btnVoltar_1_1 = new JButton("maracujá");
		btnVoltar_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_1.setBounds(48, 226, 129, 27);
		frame.getContentPane().add(btnVoltar_1_1);
		
		JButton btnVoltar_1_2 = new JButton("acerola");
		btnVoltar_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_2.setBounds(48, 257, 129, 27);
		frame.getContentPane().add(btnVoltar_1_2);
		
		JButton btnVoltar_1_3 = new JButton("coca-cola");
		btnVoltar_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_3.setBounds(275, 195, 129, 27);
		frame.getContentPane().add(btnVoltar_1_3);
		
		JButton btnVoltar_1_1_1 = new JButton("fanta");
		btnVoltar_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_1_1.setBounds(275, 226, 129, 27);
		frame.getContentPane().add(btnVoltar_1_1_1);
		
		JButton btnVoltar_1_2_1 = new JButton("guaraná");
		btnVoltar_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_2_1.setBounds(275, 257, 129, 27);
		frame.getContentPane().add(btnVoltar_1_2_1);
		
		JButton btnVoltar_1_4 = new JButton("chocolate");
		btnVoltar_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_4.setBounds(503, 195, 129, 27);
		frame.getContentPane().add(btnVoltar_1_4);
		
		JButton btnVoltar_1_1_2 = new JButton("morango");
		btnVoltar_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_1_2.setBounds(503, 226, 129, 27);
		frame.getContentPane().add(btnVoltar_1_1_2);
		
		JButton btnVoltar_1_2_2 = new JButton("doce de leite");
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
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(406, 257, 38, 27);
		frame.getContentPane().add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(634, 195, 38, 27);
		frame.getContentPane().add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(634, 226, 38, 27);
		frame.getContentPane().add(spinner_7);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(634, 257, 38, 27);
		frame.getContentPane().add(spinner_8);
		
		JButton btnVoltar_1_2_1_1 = new JButton("sprite");
		btnVoltar_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar_1_2_1_1.setBounds(275, 287, 129, 27);
		frame.getContentPane().add(btnVoltar_1_2_1_1);
		
		JSpinner spinner_5_1 = new JSpinner();
		spinner_5_1.setBounds(406, 287, 38, 27);
		frame.getContentPane().add(spinner_5_1);
	}

}
