package Graphique;

import java.awt.BorderLayout;

import javax.print.DocFlavor.STRING;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controleur.Controller;
import Modele.Jeu;
import Joueur.JoueurReel;

public class PanelJR extends JPanel {

	private Jeu jeu;
	private Controller controller;
	private JoueurReel joueur;


	public PanelJR(Jeu jeu, Controller controller, JoueurReel joueur) {
	//	super();
		this.jeu = jeu;
		this.controller = controller;
		this.joueur= joueur;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

	}
}