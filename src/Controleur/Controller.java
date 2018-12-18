package Controleur;


	import java.util.Observable;
	import java.util.Observer;
	
	import Graphique.MainGraphique;
	import Modele.Jeu;

	public class Controller {		
		private Jeu jeu;

		public Controller (Jeu recentJeu) {
			this.jeu = recentJeu;
				}

		public Jeu getJeu() {
			return jeu;
		}

}
