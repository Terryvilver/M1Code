public class Animal {
	private String couleur;
	private int nbPatte;
	
	/* Constructeur */
	Animal() {
		couleur = "";
		nbPatte = 0;
	}
	
	Animal(String couleur, int nbPatte) {
		this.couleur = couleur;
		this.nbPatte = nbPatte;
	}
	
	/* Accesseur */
	public String getCouleur() {
		return this.couleur;
	} 
	
	public int getNbPatte() {
		return this.nbPatte;
	} 
	
	/* Mutateur */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public void setNbPatte(int nbPatte) {
		this.nbPatte = nbPatte;
	}
	
	/* Affichage */
	public String toString() {
		return "L'animal est de couleur " + this.couleur + " et possède " + this.nbPatte + " pattes.";
	}
	
	/* Methode */
	public String jeMangeQuoi(String mange) {
		return "je mange de la " + mange + "."; 
	}
	
	public static void main(String []args) {
		System.out.println();
		Homme f1 = new Homme("rouge", 4, 15000);
		System.out.println(f1);
		System.out.println(f1.jeMangeQuoi());
		System.out.println(f1.affichageSalaire());
		
		System.out.println();
		Vache f2 = new Vache("vert", 2, 13);
		System.out.println(f2);
		System.out.println(f2.jeMangeQuoi());
		System.out.println(f2.affichageQtiteLait());
	}
}
