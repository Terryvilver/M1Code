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
		
		//lecture du fichier dans ma liste
		while((reader.readLine()) != null) {
			mots.add(reader.readLine());
		}

		if(mots.contains("adorer")) {
			System.out.println("Le fichier contient le mot 'adorer'");
		}	
	}
}
