public class Homme extends Omnivore {
	private int salaire;
	
	/* Constructeur */
	Homme() {
		super();
		salaire = 0;
	}
	
	Homme(String couleur, int nbPatte, int salaire) {
		super(couleur, nbPatte);
		this.salaire = salaire;
	}
	
	/* Accesseur */
	public int getSalaire() {
		return this.salaire;
	}
	
	/* Mutateur */
	public void setSalaire() {
		this.salaire = salaire;
	}
		
	/* Methode affichage */
	public String affichageSalaire() {
			return "je gagne " + this.salaire + " euros par mois.";
	}
}
