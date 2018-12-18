package Graphique;

import java.awt.BorderLayout;

import javax.print.DocFlavor.STRING;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controleur.Controller;
import Modele.Jeu;
import Joueur.JoueurVirtuel;

public class PanelJV extends JPanel {

	private Jeu jeu;
	private Controller controller;
	private JoueurVirtuel joueur;


	public PanelJV(Jeu jeu, Controller controller, JoueurVirtuel joueur) {
	//	super();
		this.jeu = jeu;
		this.controller = controller;
		this.joueur= joueur;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

	}
}