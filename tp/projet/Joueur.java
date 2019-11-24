import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Joueur {
	//attribut
	protected String nom;
	protected String prenom;
	protected int score;
	
	public Joueur() {
		nom = "";
		prenom = "";
		score = 0;
	}
	
	//methode
	public void ecriture_fichier_texte() { //ecrit dans un fichier texte les donnés en question.
		try{
        	PrintWriter texte = null;
			FileWriter f = new FileWriter("Joueurs.txt");
		 
			f.write(this.getNom() + "\t" + this.getPrenom() + "\t" + this.getScore()) ;
			f.close();
    	} catch(Exception e){

    	}
	}

	public void ecriture() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Votre nom ?");
		this.setNom(scan.nextLine());
		 
		System.out.println("Votre prenom ?");
		this.setPrenom(scan.nextLine());
	}

	 //setter
	 public void setNom(String nom) {
		this.nom = nom;
	 }
	 
	 public void setPrenom(String prenom) {
		this.prenom = prenom;
	 } 
	 
	 //getter
	 public String getNom() {
		return this.nom;
	 }
	 
	 public String getPrenom() {
		return this.prenom;
	 }	 
	 
	 public int getScore() {
		return this.score;
	 }
	 public static void main(String []args) throws Exception {
		
	}
}
