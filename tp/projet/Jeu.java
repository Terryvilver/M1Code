import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException; 
import java.util.*;

public class Jeu {
	protected static int nb_essai = 1;
	protected char lettre;
	protected File dico_court;
	protected File dico_long;
	protected ArrayList<String> mots;
	protected String tab_mot [];
	protected int rand_int;
	protected char tab_hide [];
	protected Joueur joueur1;

	Jeu() {
		lettre = ' ';
		joueur1 = new Joueur();
		dico_court = new File("monDicoCourt.txt");
		dico_long = new File("monDicoLong.txt");
		mots = new ArrayList<String>(); //liste des mots récupérer dans les dico
		tab_mot = null; //liste de mot insérer dans un tableau de String
		rand_int = 0;
		tab_hide = null;
	}

	
	public boolean tableauRempli() {

		for(int i = 0; i < tab_mot[rand_int].length(); i++) {
			if(tab_hide[i] == '*' && nb_essai <= 20) {
				return true;
			}
		}
		this.calculScore();
		return false;
	}

	public void calculScore() {
		if( nb_essai == 1 )
			joueur1.score = 100;
		else if( nb_essai == 2) 
			joueur1.score = 50;
		else if( nb_essai == 3) 
			joueur1.score = 25;
		else if( nb_essai == 4) 
			joueur1.score = 10;
		else if( nb_essai == 5)
			joueur1.score = 5;
		else
			joueur1.score = 0;

	}

	public void essais () {
		joueur1.ecriture();
		System.out.println("Le nombre de lettres de votre mot secret est de " + tab_mot[rand_int].length() + " lettres.");
		while(this.tableauRempli()) {
			this.affichage();
			this.lettre();
			this.comparaison();
		}

		if(nb_essai < 6)
			System.out.print("Vous avez gagné en " + nb_essai + " essais !!!");
		else
			System.out.print("Vous avez perdu...");

		joueur1.ecriture_fichier_texte();
	}

	public void affichage () {
		System.out.println(tab_mot[rand_int]);
		System.out.print("Le mot secret est : ");
		System.out.println(tab_hide);
		System.out.print(nb_essai);
		System.out.print("\n");
	}

	public void comparaison () {
		int i = 0;
		boolean a = false; //condition incrémentant le nb d'essai
		boolean b = false; //condition incrémentant l'echec d'une tentative

		while(i < tab_mot[rand_int].length()) {
			if(lettre == tab_mot[rand_int].charAt(i)) {
				tab_hide[i] = lettre;
				a = true;
				b = true ;
			}
		i++;
		}
		if( a == false ) {
			nb_essai++;
		}

		if(b == true)			
			System.out.println("Une tentative avec succès");
		else
			System.out.println("Une tentative sans succès");
	}

	public void lettre () {
		Scanner scan = new Scanner(System.in);
		System.out.print("Votre lettre : ");
		lettre = scan.next().charAt(0);
	}

	//crée un mot caché avec des "******".
	public void hide() {
		int compteur = 0;
		for(int i = 0; i < tab_mot[rand_int].length(); i++) {    
            if(tab_mot[rand_int].charAt(i) != ' ')    
            	compteur++;    
        }

		tab_hide = new char [compteur];
		for(int i = 0; i < compteur; i++) {    
			tab_hide[i] = '*';
        }
	}
	//sélectionne un mot dans mon tableau de façon aléatoire
	public void randomWord() {
		Random rand = new Random();
		rand_int = rand.nextInt(601);

		this.hide();
	}

	/*public void randomWord1() {
		Random rand = new Random();

		int rand_int = rand.nextInt(22001);
		this.hide();
	}*/	

	public void stockage1() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(dico_court));
		//lecture du fichier dans ma liste
		String test = reader.readLine();
		while(test != null) {
			mots.add(test); //on remplit notre liste des éléments du fichier "monDicoCourt.txt"
			test = reader.readLine();
		}

		//création du tableau ou je stocke ma liste de mots
		tab_mot = new String [mots.size()];
		for(int i = 0; i < mots.size(); i++) {
			tab_mot[i] = mots.get(i);
		}

		//appel de randomWord pour sélectionnez un mot dans mon tableau de mot
		this.randomWord();
	} 

	/*public void stockage2() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(dico_long));
		//lecture du fichier dans ma liste
		String test = reader.readLine();
		while(test != null) {
			mots.add(test); //on remplit notre liste des éléments du fichier "monDicoCourt.txt"
			test = reader.readLine();
		}

		//création du tableau ou je stocke ma liste de mots
		tab_mot = new String [mots.size()];
		for(int i = 0; i < mots.size(); i++) {
			tab_mot[i] = mots.get(i);
		}

		this.randomWord1();
	}*/

	public static void main(String []args) throws IOException {	
		Jeu parti1 = new Jeu();
		parti1.stockage1();
		parti1.essais();
		//Jeu parti2 = new Jeu();
		//parti2.stockage2();
		/*ce programme affiche les mots avec des indices de façon aléatoire.
		de la liste de mot des documents texte "dicocourt" et "dicolong".
		*/
	}	
}
