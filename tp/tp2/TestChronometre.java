import java.util.*;


public class TestChronometre {
    public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		Chronometre c1 = new Chronometre();
		boolean lancement = false;
		int test = 0;

		System.out.println("Voulez-vous lancez le chronometre ?(1:oui ou 2:non)");
		System.out.print("Réponse:");
		test = scan.nextInt();
		
		if(test == 1) {
			lancement = true;
			try {
				while(lancement == true) {
					Thread.sleep(1000);
					c1.incrementation();
					System.out.println(c1.getHeure() + ":" + c1.getMinute() + ":" + c1.getSeconde());
				}
			}catch(InterruptedException e) {
				System.out.println("interrupted.");
			}
		}
    }
}
