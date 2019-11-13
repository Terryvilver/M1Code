import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException; 
import java.util.*;

public class Jeu {
	public int nb_essai;
	public char lettre;
	
	public static void main(String []args) throws IOException {
		File f = new File("monDicoCourt.txt");
		BufferedReader reader = new BufferedReader(new FileReader(f));
		ArrayList mots = new ArrayList();
	
		
		String line = null;
		
		while((reader.readLine()) != null) {
				mots.add(f);
			if(mots.contains("adorer")) {
				System.out.println("Le fichier contient le mot 'adorer'");
			}
		}	
	}
}
