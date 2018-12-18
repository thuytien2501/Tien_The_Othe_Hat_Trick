package Graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import Controleur.Controller;
import Modele.Jeu;
import Joueur.JoueurReel;
import Joueur.JoueurVirtuel;

public class MainGraphique implements Observer {
	
	private Jeu jeu;
	private JoueurReel JoueurReel;
	private Controller controller;
	private JFrame frame;
	private JPanel panelNorth;
	private JPanel panelWest;
	private JPanel panelEast;
	private JPanel panelCenter;
	private JPanel panelSouth;
	private JoueurVirtuel panelLeft;

	public MainGraphique(Controller ctrl) {
		this.controller = ctrl;
		this.jeu = this.controller.getJeu();
		
		this.initialize();
	}

	private void initialize() {
		frame = new JFrame("HatTrick");
		frame.setBounds(0, 0, 1240, 800);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.setBackground(new Color(0, 100, 0));
		frame.getContentPane().setLayout(new BorderLayout());

		
		panelNorth = new GraphiqueCentre(this.jeu, this.controller);
		TitledBorder borderTop = new TitledBorder("Center Game");
		borderTop.setTitleJustification(TitledBorder.CENTER);
		borderTop.setTitlePosition(TitledBorder.TOP);
		panelNorth.setBorder(borderTop);
		panelNorth.setPreferredSize(new Dimension(1220, 180));
		frame.add(panelNorth,BorderLayout.PAGE_START);

		
		panelWest = new PanelJV(this.jeu, this.controller, this.jeu.getJoueurV().get(0));
		TitledBorder borderWest = new TitledBorder("Joueur 1");
		borderWest.setTitleJustification(TitledBorder.CENTER);
		borderWest.setTitlePosition(TitledBorder.TOP);
		panelWest.setBorder(borderWest);
		panelWest.setPreferredSize(new Dimension(400, 400));
		frame.add(panelWest,BorderLayout.LINE_START);
		
		
		panelEast = new PanelJV(this.jeu, this.controller,this.jeu.getJoueurV().get(1));
		TitledBorder borderEast = new TitledBorder("Joueur 2");
		borderEast.setTitleJustification(TitledBorder.CENTER);
		borderEast.setTitlePosition(TitledBorder.TOP);
		panelEast.setBorder(borderEast);
		panelEast.setPreferredSize(new Dimension(400, 400));
		frame.add(panelEast,BorderLayout.LINE_END);
		
		
		
		panelSouth = new PanelJR(this.jeu,this.controller,this.jeu.getJoueurR().get(0));
		TitledBorder borderBottom = new TitledBorder("Jouer3");
		borderBottom.setTitleJustification(TitledBorder.CENTER);
		borderBottom.setTitlePosition(TitledBorder.TOP);
		panelSouth.setBorder(borderTop);
		panelSouth.setPreferredSize(new Dimension(1220, 180));
		frame.add(panelSouth,BorderLayout.PAGE_END);
		

		panelCenter = new PanelPropCentre(this.jeu, this.controller, this.jeu.getProp());
		TitledBorder borderCenter = new TitledBorder("Prop Centre");
		borderCenter.setTitleJustification(TitledBorder.CENTER);
		borderCenter.setTitlePosition(TitledBorder.TOP);
		panelCenter.setBorder(borderCenter);
		panelCenter.setPreferredSize(new Dimension(300, 200));
		frame.add(panelCenter,BorderLayout.CENTER);
		
		this.frame.setVisible(true);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
