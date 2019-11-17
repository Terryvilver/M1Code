import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException; 
import java.util.*;

public class Jeu {
	public int nb_essai;
	public char lettre;
	public File dico_court;
	public BufferedReader reader;
	public ArrayList<String> mots;
	
	public static void main(String []args) throws IOException {
		File dico_court = new File("monDicoCourt.txt");
		BufferedReader reader = new BufferedReader(new FileReader(dico_court));
		ArrayList<String> mots = new ArrayList<String>();
		
		String test = reader.readLine();
		//lecture du fichier dans ma liste
		while(test != null) {
			mots.add(test); //on remplit notre liste des éléments du fichier "monDicoCourt.txt"
			test = reader.readLine();
		}

		//création du tableau ou je stocke ma liste de mot.
		String tab_mot [] = new String [mots.size()];
		for(int i = 0; i < mots.size(); i++) {
			tab_mot[i] = mots.get(i);
		}

		System.out.println(tab_mot[300]); //TEST1
		System.out.println(tab_mot[264]); //TEST2
	}
}
