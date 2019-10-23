public class Vache extends Herbivore {
	private int qtiteLait;
	
	/* Constructeur */
	Vache() {
		super();
		qtiteLait = 0; 
	}
	
	Vache(String couleur, int nbPatte, int qtiteLait) {
		super(couleur, nbPatte);
		this.qtiteLait = qtiteLait; 
	}
	
	/* Accesseur */
	public int getQtiteLait() {
		return this.qtiteLait;
	}
	
	/* Mutateur */
	public void setSalaire() {
		this.qtiteLait = qtiteLait;
	}
	
	/* Methode affichage */
	public String affichageQtiteLait() {
			return "j'ai une quantité de " + this.qtiteLait + " litre de lait.";
	}
}
