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
	 
	 public static void main(String []args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Joueur t = new Joueur();
		PrintWriter texte = null;
		FileWriter f = new FileWriter("Joueurs.txt");
		 
		System.out.println("Votre nom ?");
		t.setNom(scan.nextLine());
		 
		System.out.println("Votre prenom ?");
		t.setPrenom(scan.nextLine());
		 
		f.write(t.getNom()+ "\t\t");
		f.write(t.getPrenom());
		f.close();
	}
}
