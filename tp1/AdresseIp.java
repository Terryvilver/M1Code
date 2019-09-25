import java.util.Scanner;

public class AdresseIp{
	public static void main(String []args)
	{
			Scanner scan = new Scanner(System.in);
			int tab[] = new int[4];
			
			for(int i = 0; i < tab.length; i++)
			{
				System.out.print("Entrez l'entier " + i + " compris entre 0 et 255: ");
				tab[i] = scan.nextInt();
			}
			
			System.out.println(tab[0] + "." + tab[1] + "." + tab[2] + "." + tab [3]);
			
	}
}
