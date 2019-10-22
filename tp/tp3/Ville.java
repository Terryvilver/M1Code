public class Ville {
	protected String nom;
	protected int nbHabitant;
	
	/* Constructeur */
	public Ville() {
		nom = "";
		nbHabitant = 0;
	}
	
	public Ville(String nom, int nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	/* Accesseur */
	public String getNom() {
		return this.nom;
	}

	public int getNbHabitant() {
		return this.nbHabitant;
	}

	/* Mutateur */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNom(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public String toString() {
		return this.nom + " est constitué de " + this.nbHabitant + " habitants.";
	}
	 
	public static void main(String []args) {
		Capitale c1 = new Capitale("Paris",15000,"tour eiffel");
		System.out.println(c1.afficheMonument());	
	}
}
