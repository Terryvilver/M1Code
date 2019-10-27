import java.util.*;

public class TestCompteurBorne {
    public static void main(String []args) {
        boolean lancement = true;
        CompteurBorne cp = new CompteurBorne(0);

        try {
				while(lancement == true) {
					Thread.sleep(1000);
					cp.incrementation();
					System.out.println(cp.getCompte());

					//Arrête le chronometre
					/*Nous souhaitons crée un moyen de stopper le chronomètre en détectant la frappe d'une touche*/

				}
			}catch(InterruptedException e) { }
	}
}