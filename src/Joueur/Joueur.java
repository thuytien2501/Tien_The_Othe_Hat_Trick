package Joueur;
import java.util.ArrayList;

import Carte.Prop;
import Carte.Trick;
import Modele.Jeu;

public abstract class Joueur {
    private String nom;
    
    private int choixTrick;

    private int point;

    private Jeu jeu; 
    
    private Prop cartesChoisies;


    private ArrayList<Prop> Main = new ArrayList<Prop> ();

    private ArrayList<Trick> trickARealiser = new ArrayList<Trick>();
    
    private ArrayList<Trick> tricksRealises = new ArrayList<Trick>();

    private boolean nouveauTrick;
    
    private boolean estPremierAJouer;
    
    private int variante; 
    
    public void setVariante(int variante) {
    	this.variante = variante;
    }
    
    public int getVariante() {
    	return variante;
    }
	public int getChoixTrick() {
		return choixTrick;
	}
	
	public void addPoint(int pt) {
		this.point = this.point + pt;
	}

	public void setChoixTrick(int choixTrick) {
		this.choixTrick = choixTrick;
	}

	public boolean isEstPremierAJouer() {
		return estPremierAJouer;
	}

	public abstract void setJeu(Jeu jeu);
	
	public void setJeu1(Jeu jeu) {
		this.jeu = jeu;
	}
	
	public void setEstPremierAJouer(boolean estPremierAJouer) {
		this.estPremierAJouer = estPremierAJouer;
	}

	public void addTrickRealises(Trick trickReussi) {
		this.tricksRealises.add(trickReussi);
	}

	public ArrayList<Trick> getTricksRealises() {
		return tricksRealises;
	}

	public Jeu getJeu() {
		return jeu;
	}

	public Joueur() {
		super();

	}
	
	
	


	public boolean setTrickARealiser(ArrayList<Trick> trickARealiser) {
		this.trickARealiser = trickARealiser;
		return false;
	}

	/**
	 * @return the trickARealiser
	 */
	public ArrayList<Trick> getTrickARealiser() {
		return trickARealiser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPoint() {
		return point;
	}

	public ArrayList<Prop> getMain() {
		return Main;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Prop getCartesChoisies() {
		return cartesChoisies;
	}

	public void setCartesChoisies(Prop cartesChoisies) {
		this.cartesChoisies = cartesChoisies;
	}

				
	public void setCarteMain(Prop carteMain) {
		this.Main.add(carteMain);
	}
	
	public void removeCarteMain(int index) {
		this.Main.remove(index);
	}
	
	public String afficherMain() {
		String Main = "Props : "+this.Main.get(0).toString();
		for (int i=1; i<this.Main.size();i++ ) {
			Main = Main +", " + this.Main.get(i).toString();
		}
		return Main;
	}
	
	public String toString2() {
		return "[ " + this.nom + ", " + "Points = " + this.point + " ]";
	}
	public void addMain(ArrayList<Prop> propsCentre) {
		this.Main.addAll(propsCentre);
	}
	
	public abstract void retournerCarte();
	
	public abstract Object[] jouer();
	
	public abstract ArrayList<Prop> melangerPropsCentre(ArrayList<Prop> propCentre);
	
	public boolean isNouveauTrick() {
		return nouveauTrick;
	}

	public void setNouveauTrick(boolean nouveauTrick) {
		this.nouveauTrick = nouveauTrick;
	}

	public void voirCartes() {
    }
	
	public void supprimerMain() {
		int a = this.Main.size();
		Main.removeAll(Main);

	}
	
	public abstract boolean donnerProp(ArrayList<Prop> propCentre, String echange);

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[" + nom  + ", " + this.afficherMain() + "]" + "\n=====================";
	}

  

    
}
