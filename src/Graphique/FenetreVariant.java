package Graphique;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenetreVariant {

	private JFrame frame;
	private JTextField variante;
	private String valeur;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreVariant window = new FenetreVariant();
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
	public FenetreVariant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("           Bonjour, Nous allons jouer \u00E0 The Other Hat Trick");
		lblNewLabel.setBounds(42, 28, 432, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("                    Voulez-vous jouer aux r\u00E8gles normales ? Y or N");
		lblNewLabel_1.setBounds(12, 59, 400, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		variante = new JTextField();
		variante.setBounds(148, 117, 116, 22);
		frame.getContentPane().add(variante);
		variante.setColumns(10);
		
		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// get valeur entree
				valeur=variante.getText();
				
			}
		});
		ok.setBounds(156, 170, 97, 25);
		frame.getContentPane().add(ok);
	}
}
