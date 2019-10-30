//Test du compte à rebours

import java.util.Scanner;

public class TestCompteRebours {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
		CompteRebours c1 = new CompteRebours(0,0,5);
		boolean lancement = false; 
		int test = 0;

		System.out.println("Voulez-vous lancez le compte à rebours?(1:oui ou 2:non)");
		System.out.print("Réponse:");
		test = scan.nextInt();
		
		if(test == 1) {
			lancement = true;
			try {
				while(lancement == true) {
					Thread.sleep(1000);
					c1.decrementation();
					System.out.println(c1.getHh() + ":" + c1.getMm() + ":" + c1.getSs());

                    if(c1.getHh() == 0)
                        if(c1.getMm() == 0)
                            if(c1.getSs() == 0)
                                lancement = false; //Arrête le compte a rebours lorsque heure = minute = seconde = 0

					/*Nous souhaitons crée un moyen de stopper le chronomètre en détectant la frappe d'une touche*/
					
				}
			}catch(InterruptedException e) {

			}
		}
    }
}