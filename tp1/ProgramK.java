public class ProgramK{
		public static void main(String []args)
		{
			double k;
			
			k = 1.4;
			k = k + 2;
			k = k * 9;
			k = k / 6;
			
			System.out.println("La valeur de k est " + k);
			//la valeur affiché est 5.1
			/*si k est de type int, il y aura un 
			  problème, suite à la perte de 
			   détails du résultat 
			  en convertissant de  double à int */
		}
}
