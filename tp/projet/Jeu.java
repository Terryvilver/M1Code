import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException; 
import java.util.*;

public class Jeu {
	public int nb_essai;
	public char lettre;
	public File dico_court;
	public File dico_long;
	public ArrayList<String> mots;
	public String tab_mot [];

	Jeu() {
		nb_essai = 20;
		lettre = ' ';
		dico_court = new File("monDicoCourt.txt");
		dico_long = new File("monDicoLong.txt");
		mots = new ArrayList<String>();
		tab_mot = null;
	}

	//sélectionne un mot dans mon tableau de façon aléatoire
	public void randomWord() {
		Random rand = new Random();

		int rand_int = rand.nextInt(601);
		System.out.println(tab_mot[rand_int]);
	}

	/*public void randomWord1() {
		Random rand = new Random();

		int rand_int = rand.nextInt(22001);
		System.out.println(tab_mot[rand_int]);
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
		//Jeu parti2 = new Jeu();
		//parti2.stockage2();
		/*ce programme affiche les mots avec des indices de façon aléatoire.
		de la liste de mot des documents texte "dicocourt" et "dicolong".
		*/
	}	
}
