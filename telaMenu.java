package javaxLanches;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class telamenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telamenu window = new telamenu();
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
	public telamenu() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(124, 22, 129, 111);
		frame.getContentPane().add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(297, 22, 129, 111);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(124, 180, 129, 111);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(471, 180, 129, 111);
		frame.getContentPane().add(panel_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(297, 180, 129, 111);
		frame.getContentPane().add(panel_2_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(471, 22, 129, 111);
		frame.getContentPane().add(panel_1_1_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBlockIncrement(100);
		scrollBar.setMinimum(80);
		scrollBar.setBounds(688, 11, 17, 350);
		frame.getContentPane().add(scrollBar);
		
		JTextPane txtpnGsgs = new JTextPane();
		txtpnGsgs.setEditable(false);
		txtpnGsgs.setBackground(new Color(255, 241, 219));
		txtpnGsgs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnGsgs.setText("sanduíche:\r\n  R$ 5,00\r\n");
		txtpnGsgs.setBounds(156, 133, 65, 36);
		frame.getContentPane().add(txtpnGsgs);
		
		JTextPane txtpnCoxinhaR = new JTextPane();
		txtpnCoxinhaR.setEditable(false);
		txtpnCoxinhaR.setText("coxinha:\r\nR$ 4,00\r\n");
		txtpnCoxinhaR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnCoxinhaR.setBackground(new Color(255, 241, 219));
		txtpnCoxinhaR.setBounds(337, 133, 54, 36);
		frame.getContentPane().add(txtpnCoxinhaR);
		
		JTextPane txtpnCachorroQuenteR = new JTextPane();
		txtpnCachorroQuenteR.setEditable(false);
		txtpnCachorroQuenteR.setText("cachorro quente:\r\n       R$ 6,00\r\n");
		txtpnCachorroQuenteR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnCachorroQuenteR.setBackground(new Color(255, 241, 219));
		txtpnCachorroQuenteR.setBounds(481, 133, 102, 36);
		frame.getContentPane().add(txtpnCachorroQuenteR);
		
		JTextPane txtpnRefrigeranteR = new JTextPane();
		txtpnRefrigeranteR.setEditable(false);
		txtpnRefrigeranteR.setText("refrigerante:\r\n  R$ 6,00\r\n");
		txtpnRefrigeranteR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnRefrigeranteR.setBackground(new Color(255, 241, 219));
		txtpnRefrigeranteR.setBounds(156, 292, 75, 36);
		frame.getContentPane().add(txtpnRefrigeranteR);
		
		JTextPane txtpnSucoR = new JTextPane();
		txtpnSucoR.setEditable(false);
		txtpnSucoR.setText("  suco:\r\nR$ 3,00\r\n");
		txtpnSucoR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnSucoR.setBackground(new Color(255, 241, 219));
		txtpnSucoR.setBounds(337, 292, 54, 36);
		frame.getContentPane().add(txtpnSucoR);
		
		JTextPane txtpnMilkshakeR = new JTextPane();
		txtpnMilkshakeR.setEditable(false);
		txtpnMilkshakeR.setText("milkshake:\r\nR$ 12,00\r\n");
		txtpnMilkshakeR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnMilkshakeR.setBackground(new Color(255, 241, 219));
		txtpnMilkshakeR.setBounds(508, 292, 62, 36);
		frame.getContentPane().add(txtpnMilkshakeR);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(624, 301, 54, 60);
		frame.getContentPane().add(panel_1_1_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(124, 334, 129, 111);
		frame.getContentPane().add(panel_3_1);
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setBounds(471, 334, 129, 111);
		frame.getContentPane().add(panel_1_1_3);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(297, 334, 129, 111);
		frame.getContentPane().add(panel_2_1_1);
		
		JTextPane txtpnBoloR = new JTextPane();
		txtpnBoloR.setText("  bolo:\r\nR$ 5,00\r\n");
		txtpnBoloR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnBoloR.setEditable(false);
		txtpnBoloR.setBackground(new Color(255, 241, 219));
		txtpnBoloR.setBounds(166, 446, 50, 36);
		frame.getContentPane().add(txtpnBoloR);
		
		JTextPane txtpnPudimR = new JTextPane();
		txtpnPudimR.setText(" pudim:\r\nR$ 3,00\r\n");
		txtpnPudimR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnPudimR.setEditable(false);
		txtpnPudimR.setBackground(new Color(255, 241, 219));
		txtpnPudimR.setBounds(341, 446, 50, 36);
		frame.getContentPane().add(txtpnPudimR);
		
		JTextPane txtpnBrownieR = new JTextPane();
		txtpnBrownieR.setText("brownie:\r\nR$ 4,00\r\n");
		txtpnBrownieR.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnBrownieR.setEditable(false);
		txtpnBrownieR.setBackground(new Color(255, 241, 219));
		txtpnBrownieR.setBounds(516, 446, 54, 36);
		frame.getContentPane().add(txtpnBrownieR);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltar.setBounds(20, 334, 75, 27);
		frame.getContentPane().add(btnVoltar);
	}
}
