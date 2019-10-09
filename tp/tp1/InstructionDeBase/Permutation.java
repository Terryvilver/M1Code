/* Écrire un programme qui saisit deux entiers A et B
 * au clavier, et permute ces deux valeurs
 */
 
public class Permutation{
	public static void main(String []args){
			int a = 5;
			int b = 3;
			int temp;
				
			System.out.println("a=" + a + " et b=" + b);
				
			System.out.println("Permutation");
				
			temp = a;
			a = b;
			b = temp; 
				
			System.out.println("a=" + a + " et b=" + b);
	}
}
