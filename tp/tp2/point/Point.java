import java.util.*;

class Points {
	private float x;
	private float y;
	Scanner scan = new Scanner(System.in);
	
	
	Points() {
		x = 0;
		y = 0;
	}
	
	Points(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	/* Setters */
	private void setX(float x) {
		this.x = x;
	}
	
	private void setY(float y) {
		this.y = y;
	}
	
	/* Getters */
	
	public float getX(){
		return this.x;
	}
	
	public float getY(){
		return this.y;
	}
	
	
	//Methode permettant deplacer un point à un autre endroit du plan.
	public void deplacement() {
		System.out.print("Valeur de x: ");
		setX(scan.nextFloat());
		System.out.print("Valeur de y: ");
		setY(scan.nextFloat());
	}
}

public class Point {
	public static void main(String []args) {
			Points p1 = new Points(5, 5);
			System.out.println("Coordonnée de x: " + p1.getX() );
			System.out.println("Coordonnée de y: " + p1.getY() );
			
			System.out.println(); //crée le saut à la ligne
			p1.deplacement(); // appel de la méthode pour déplacer mes points.
			System.out.println(); 
			
			System.out.println("Coordonnée de x: " + p1.getX() );
			System.out.println("Coordonnée de y: " + p1.getY() );
			
	}
}
