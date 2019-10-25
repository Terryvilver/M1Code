public class Herbivore extends Animal {
	/* Methode */
	public String jeMangeQuoi() {
		return "je mange de l'herbe !"; 
	}
	
	Herbivore() {
		super();
	}
	
	Herbivore(String couleur, int nbPatte) {
		super(couleur, nbPatte);
	}
}
