package Graphique;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JSpinner.NumberEditor;
import javax.swing.JTextField;

import Joueur.JoueurReel;

public class PremiereFenetre {
		private JFrame pricipalFrame;
		private JPanel container;
		private JSpinner spAgeJoueur;
		private NumberEditor iAgeJoueur;
		private ButtonGroup buttonGroup;
		private JRadioButton radioButton1;
		private JRadioButton radioButton2;
		private JRadioButton radioButton3;
		private JTextField nomField;
		public JButton button;
		public JFrame frame1;

		public PremiereFenetre() {
			
			pricipalFrame = new JFrame("Parametrage");
			container = new JPanel(new GridLayout(2, 4, 5, 10));
			
			
			
			
			spAgeJoueur = new JSpinner();
			iAgeJoueur = new JSpinner.NumberEditor(spAgeJoueur);
			spAgeJoueur.setEditor(iAgeJoueur);
				// Définition des limites du spinner
			iAgeJoueur.getModel().setMinimum(5);
			iAgeJoueur.getModel().setMaximum(80);
			iAgeJoueur.getModel().setStepSize(1);
			iAgeJoueur.getModel().setValue(5);
			iAgeJoueur.getTextField().setEditable(true);


				buttonGroup = new ButtonGroup();
				radioButton1 = new JRadioButton("Easy");
				radioButton2 = new JRadioButton("Moyen");
				radioButton3 = new JRadioButton("Difficult");
				JPanel tempPanel = new JPanel();
				tempPanel.setLayout(new BoxLayout(tempPanel, BoxLayout.Y_AXIS));
				tempPanel.add(radioButton1);
				tempPanel.add(radioButton2);
				tempPanel.add(radioButton3);

				// ajout des boutons radio dans le groupe
				buttonGroup.add(radioButton1);
				buttonGroup.add(radioButton2);
				buttonGroup.setSelected(radioButton1.getModel(), true);

				nomField = new JTextField("");

				this.button = new JButton("Start Game!");
				
				container.add(new JLabel("Veuillez enter ton nom"));
				container.add(nomField);
				container.add(new JLabel("Veuillez enter ton age"));
				container.add(spAgeJoueur);
				container.add(new JLabel("Veuillez choisir ton vineau"));
				container.add(tempPanel);
				
				container.add(new JLabel());
				container.add(button);

				pricipalFrame.setContentPane(container);
				pricipalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				pricipalFrame.pack();
				// frame.setSize(JFrame.MAXIMIZED_HORIZ, JFrame.MAXIMIZED_VERT);
				this.frame1=pricipalFrame;
				this.frame1.setVisible(true);
			}

			public static void main(String[] args) {
				PremiereFenetre view = new PremiereFenetre();
			}
			
			public JoueurReel  getJoueurReel() {
				JoueurReel joueur1 = null;
				int iAge = 5, idStrategie = 0;

				
				if (spAgeJoueur.getValue() instanceof Integer) {
					iAge = (Integer) spAgeJoueur.getValue();
				}
				
				 joueur1 = new JoueurReel(iAge,nomField.getText());
				
				
				return joueur1;
				
			}
			public void closeWindow() {
				this.frame1.dispose();
			}
			
		}
		
		



