public class Capitale extends Ville {
    private String monument;

    /* Constructeur */
    public Capitale() {
        super();
        monument = "";
    }

    public Capitale(String nom, int nbHabitant, String monument) {
        super(nom, nbHabitant);
        this.monument = monument;
    }

    /* Accesseur */
    public String getMonument() {
		return this.monument;
	}

    /* Mutateur */
	public void setMom(String monument) {
		this.monument = monument;
	}

    public String afficheMonument() {
		return super.toString() + " Elle possède la " + this.monument + ".";
	}
}