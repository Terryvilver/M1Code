//Le chronometre reste bloqué à 59 sec.

import java.util.*;

public class TestCompteurBorne {
    public static void main(String []args) {
        boolean lancement = true;
        CompteurBorne cp = new CompteurBorne();

        try {
				while(lancement == true) {
					Thread.sleep(1000);
					cp.incrementation();
					System.out.println(cp.getCompte());

					if(cp.getCompte() == 59)
						lancement = false;
				}
			}catch(InterruptedException e) { }
	}
}