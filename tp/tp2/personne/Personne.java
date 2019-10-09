public class Personne {
	/* membre d'instance */
	private int age;
	private String prenom;
	
	/* Constructeur */
	Personne() {
		age = 0;
		prenom = "";
	}
	
	Personne(String prenom)  {
		this.prenom = prenom;
	}
	
	Personne(String prenom, int age) {
		this.age = age;
		this.prenom = prenom;
	}
	
	/* Getter */
	public String getPrenom() {
		return this.prenom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	/* Setter */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "La personne s'appelle " + this.prenom + " et à " + this.age + " ans.";
	}
	
	public static void main(String []args) {
		Personne a = new Personne("toto", 34);
		Personne b = new Personne("tata");
		Personne c = new Personne();
		
		b.setAge(56);
		c.setPrenom("titi"); c.setAge(12);
		System.out.println(a.getAge()); //affiche 34.
		System.out.println(a);
		System.out.println(c);
	}
}
